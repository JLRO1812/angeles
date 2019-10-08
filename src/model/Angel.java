package model;

/**
 * @author Dante
 *
 */
public class Angel{
	
	//attribute
	private String name;
	private String photo;
	private String prayer;
	private String celebrateMonth;
	private int celebrateDay;
	private String power;
	
	//relations
	private Candle anDle;
	
	//Constructor
	
	public Angel (String pname, String pphoto, String pprayer, String pcelebrateMonth, int pcelebrateDay, String ppower, String pcolor, String psize, String pessence, String pilumination){
		
		name=pname;
		photo=pphoto;
		prayer=pprayer;
		celebrateMonth=pcelebrateMonth;
		celebrateDay=pcelebrateDay;
		power=ppower;
		
		anDle = new Candle(pcolor, psize, pessence, pilumination);
	}
	
	//methods
	public String getName(){
		return name;
	}
	public String getPhoto(){
		return photo;
	}
	public String getPrayer(){
		return prayer;
	}
	public String getCelebrateMonth(){
		return celebrateMonth;
	}
	public String getCelebrateDay(){
		String day=Integer.toString(celebrateDay);
		return day;
	}
	
	public String getDate(){
		String date=getCelebrateMonth()+"/"+getCelebrateDay();
		return date;
	}
	
	public String getPower(){
		return power;
	}
	
	public String getCandleColor(){
		String candleColor=anDle.getColor();
		return candleColor;
	}
	public String getCandleSize(){
		String candleSize=anDle.getSize();
		return candleSize;
	}
	public String getCandleEssence(){
		String candleEssence=anDle.getEssence();
		return candleEssence;
	}
	public String getCandleIlumitation(){
		String candleIlumination=anDle.getIlumination();
		return candleIlumination;
	}
	
	public String infoCandle() {
		String infoCandle=anDle.toString();
		return infoCandle;
	}

	public String toString() {
		return "Angel [name=" + name + ", photo=" + photo + ", prayer=" + prayer + ", celebrateMonth=" + celebrateMonth
				+ ", celebrateDay=" + celebrateDay + ", power=" + power + ", anDle=" + anDle + "]";
	}
	
	
}