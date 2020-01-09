package Test;

import net.sf.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;


public class test {
	public static void main(String[] args) {
		cityForecast forecast = new cityForecast();
		cityLives lives = new cityLives();
		
		try {
			URL url = new URL("https://restapi.amap.com/v3/weather/weatherInfo?city=110101&key=d2b6dfb2428f588c178226a0ea3dddad");
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection connection = null;
			if (urlConnection instanceof HttpURLConnection) {
				connection = (HttpURLConnection) urlConnection;
			}
			BufferedReader in = new BufferedReader(
			new InputStreamReader(connection.getInputStream()));
			String urlString = "";
			String current;
			while((current = in.readLine()) != null) {
				urlString += current;
			}
			
			JSONObject json = JSONObject.fromObject(urlString);
			lives.setStatus(json.optString("status"));
			lives.setCount(json.optString("count"));
			lives.setInfo(json.optString("info"));
			lives.setInfocode(json.optString("infocode"));
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		getConnection connection = new getConnection();
		getConnection con = (getConnection) connection.Connection();
		
		try {
			Statement sql;
			ResultSet res;
			int a;
			
			sql = ((Connection) con).createStatement();
			
			for(int i = 0; i < lives.getCount(); i++) {
				a = sql.executeUpdate("insert into sql (status,count,info,infocode,lives,province,city,adcodeweather,temperature,winddirection,windpower,humidity,reporttime,forecast,city,adcode,province,reporttime,casts,date,week,dayweather,nightweather,daytemp,nighttemp,daywind,nightwind,daypower,nightpower) "
						+ "values('"+lives.getPois().get(i).getStatus()+"','"+lives.getPois().get(i).getCount()+"'"
						+ ",'"+lives.getPois().get(i).getInfo()+"','"+lives.getPois().get(i).getInfocode()+"','"+jsonBean.getPois().get(i).getProvince()+"'"
						+ ",'"+lives.getPois().get(i).getCity()+"','"+lives.getPois().get(i).getAdcodeweather()+"','"+jsonBean.getPois().get(i).getTemperature()+"'  "
						+ ",'"+lives.getPois().get(i).getprovince()+"','"+lives.getPois().get(i).getWinddirection()+"','"+jsonBean.getPois().get(i).getWindpower()+"','"+jsonBean.getPois().get(i).getHumidity()+"'"
						+ ",'"+lives.getPois().get(i).getPcode()+"','"+lives.getPois().get(i).getReporttime()+"','"+jsonBean.getPois().get(i).getCityname()+"','"+jsonBean.getPois().get(i).getAdcode()+"'"
					    + ",'"+lives.getPois().get(i).getAdcode()+"','"+lives.genBean.getPois().get(i).getNightweather()+"')");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}
}
