package model;

public class Candle{
	
	//attribute
	private String color;
	private String size;
	private String essence;
	private String ilumination;
	
	//Constructor
	public Candle(String pcolor, String psize, String pessence, String pilumination){
		
		color=pcolor;
		size=psize;
		essence=pessence;
		ilumination=pilumination;
	}
	
	//methods
	public String getColor(){
		return color;
	}
	public String getSize(){
		return size;
	}
	public String getEssence(){
		return essence;
	}
	public String getIlumination(){
		return ilumination;
	}


	public String toString() {
		return "Candle [color=" + color + ", size=" + size + ", essence=" + essence + ", ilumination=" + ilumination
				+ "]";
	}
	
}
	