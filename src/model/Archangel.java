package src.model;

public class Archangel
	{

	// Atributtes
	private String name;
	private String prayer;
	private String dateCeleb; 
	private String power;
	private String photo;
	private int n;
	
	//Relations
	
	 private Candle candle1;
	 
   //Constructor Method
	public Archangel(String aname, String aprayer, String adateCeleb, String apower, String aphoto, String cColor, String cessence, double csize, double clightIlu)
	{
		name=aname;
		prayer=aprayer;
		dateCeleb=adateCeleb;
		power=apower;
		photo=aphoto;
		
		candle1=new Candle(cColor,cessence,csize, clightIlu);

	}

	//Class Methods
	
	public String getCandleColor()
  {
  String candleColor;
  candleColor=candle1.getColor();
  return candleColor;
  }

  public String getCandleEssence()
  {
    String candleEssence;
  candleEssence=candle1.getEssence();
  return candleEssence;
  }

  public String getCandleSize()
  {
    double candleSiz;
  candleSiz=candle1.getSize();

  String candleSize=String.valueOf(candleSiz);

  return candleSize;
  }
  
  public String getCandleIlu()
  {
  double candleIlu;
  
  candleIlu=candle1.getIlu();
  String candleIlum=String.valueOf(candleIlu);
  
  return candleIlum;
}
	public String getName(){
	return name;
	}
	
	public String getPrayer(){
	return prayer;
	}

	public String getDate(){
	return dateCeleb;
	}
	
	public String getPower(){
	return power;
	}
	
	public String getPhoto(){
	return photo;
	}
}
	