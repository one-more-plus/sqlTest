package Test;

public class cityForecast {
	private String status;
	private String count;
	private String info;
	private String infocode;
	private String province;
	private String city;
	private int adcode;
	private String reporttime;
	private String temperature;
	private String winddirection;
	private String windpower;
	private String humidity;
	private String date;
	private String week;
	private String dayweather;
	private String nightweather;
	private String daytemp;
	private String nighttemp;
	private String daywind;
	private String nightwind;
	private String daypower;
	private String nightpower;
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
	public String getReporttime() {
		return reporttime;
	}
	public void setReporttime(String reporttime) {
		this.reporttime = reporttime;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getDayweather() {
		return dayweather;
	}
	public void setDayweather(String dayweather) {
		this.dayweather = dayweather;
	}
	public String getNightweather() {
		return nightweather;
	}
	public void setNightweather(String nightweather) {
		this.nightweather = nightweather;
	}
	public String getDaytemp() {
		return daytemp;
	}
	public void setDaytemp(String daytemp) {
		this.daytemp = daytemp;
	}
	public String getNighttemp() {
		return nighttemp;
	}
	public void setNighttemp(String nighttemp) {
		this.nighttemp = nighttemp;
	}
	public String getDaywind() {
		return daywind;
	}
	public void setDaywind(String daywind) {
		this.daywind = daywind;
	}
	public String getNightwind() {
		return nightwind;
	}
	public void setNightwind(String nightwind) {
		this.nightwind = nightwind;
	}
	public String getDaypower() {
		return daypower;
	}
	public void setDaypower(String daypower) {
		this.daypower = daypower;
	}
	public String getNightpower() {
		return nightpower;
	}
	public void setNightpower(String nightpower) {
		this.nightpower = nightpower;
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
		return "CityForecast [status=" + status + ", count=" + count + ", info=" + info + ", infocode=" + infocode
				+ ", province=" + province + ", city=" + city + ", adcode=" + adcode + ", reporttime=" + reporttime
				+ ", temperature=" + temperature + ", winddirection=" + winddirection + ", windpower=" + windpower
				+ ", humidity=" + humidity + ", date=" + date + ", week=" + week + ", dayweather=" + dayweather
				+ ", nightweather=" + nightweather + ", daytemp=" + daytemp + ", nighttemp=" + nighttemp + ", daywind="
				+ daywind + ", nightwind=" + nightwind + ", daypower=" + daypower + ", nightpower=" + nightpower + "]";
	}
}
