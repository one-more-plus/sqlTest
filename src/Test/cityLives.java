package Test;

public class cityLives {
	private String status;
	private String count;
	private String info;
	private String infocode;
	private String province;
	private String city;
	private int adcode;
	private String weather;
	private String temperature;
	private String winddirection;
	private String windpower;
	private String humidity;
	private String reporttime;
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAdcode() {
		return adcode;
	}
	public void setAdcode(int adcode) {
		this.adcode = adcode;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getWinddirection() {
		return winddirection;
	}
	public void setWinddirection(String winddirection) {
		this.winddirection = winddirection;
	}
	public String getWindpower() {
		return windpower;
	}
	public void setWindpower(String windpower) {
		this.windpower = windpower;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getReporttime() {
		return reporttime;
	}
	public void setReporttime(String reporttime) {
		this.reporttime = reporttime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfocode() {
		return infocode;
	}
	public void setInfocode(String infocode) {
		this.infocode = infocode;
	}
	@Override
	public String toString() {
		return "CityLives [status=" + status + ", count=" + count + ", info=" + info + ", infocode=" + infocode
				+ ", province=" + province + ", city=" + city + ", adcode=" + adcode + ", weather=" + weather
				+ ", temperature=" + temperature + ", winddirection=" + winddirection + ", windpower=" + windpower
				+ ", humidity=" + humidity + ", reporttime=" + reporttime + "]";
	}
}
