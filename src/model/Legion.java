package model;

public class Legion{
	
	//relations
	private Angel angelito[];
	
	//Constructor
	public Legion (int n){
		angelito = new Angel[n];
	}
	
	//Methods
	/**
	 *This method allows you to add the angels
	
	 *<b>pre:</b> The number of angels to create must be valid.
	 *<b>post:</b> Add the number of angels entered.
	 * @param pname.
	 * @param pphoto.
	 * @param pprayer.
	 * @param pcelebrateMonth.
	 * @param pcelebrateDay.
	 * @param ppower.
	 * @param pcolor.
	 * @param psize.
	 * @param pessence.
	 * @param pilumination.
	 * @return String addAngel.
	 */
	public String addAngel(String pname, String pphoto, String pprayer, String pcelebrateMonth, int pcelebrateDay, String ppower, String pcolor, String psize, String pessence, String pilumination){
		String createAngel="The angel can't be register";
		boolean nameProof=nameProof(pname);
		boolean powerProof=powerProof(ppower);
		boolean proofEnd=proofEnd(pname);
		int empty=positionEmpty();
		if(nameProof==true && powerProof==true && proofEnd==true && empty!=-1) {
			createAngel="The angel has been registered";
			angelito[empty]=new Angel(pname,pphoto, pprayer, pcelebrateMonth, pcelebrateDay, ppower, pcolor, psize, pessence, pilumination);
		}
		return createAngel;
	}
	
	/**
	*This method reports the empty position in the array.
	
	*<b>pre:</b> Number of angels added.
	*<b>post:</b> Display the information of the mentioned angels.
	
	*@return int a.
	*/
	public int positionEmpty() {
		boolean found=false;
		int a=-1;
		for(int i=0; i<angelito.length && found==false; i++) {
			if (angelito[i]==null) {
				found=true;
				a=i;
			}
		}
		return a;
	}
	
	/**
	*This method lets you know if the name is repeated.
	
	*<b>pre:</b> The name must be valid.
	*<b>post:</b> Approve or not the name.
	
	*@param pname.
	*@return boolean approveName.
	*/
	public boolean nameProof(String pname){
		boolean approveName=true;
		String name;
		for(int i=0;i<angelito.length && approveName==true; i++){
			if(angelito[i]!=null){
				name=angelito[i].getName();
				if(name.equals(pname)){
					approveName=false;
				}
			}		
		}
		return approveName;
	}
	
	/**
	*This method lets you know if the power is repeated.
	
	*<b>pre:</b> The power must be valid.
	*<b>post:</b> Approve or not the power.
	
	*@param ppower.
	*@return boolean approvePower.
	*/
		public boolean powerProof(String ppower){
		boolean approvePower=true;
		String power;
		for(int i=0;i<angelito.length && approvePower==true; i++){
			if(angelito[i]!=null){
				power=angelito[i].getPower();
				if(power.equals(ppower)){
					approvePower=false;
				}
			}		
		}
		return approvePower;
	}
	

		public boolean proofEnd(String pname){
		boolean aproveEnd=false;
		char end=pname.charAt(pname.length()-1);
		char penultend=pname.charAt(pname.length()-2);
		
		if(end=='l' && penultend=='e') {
			aproveEnd=true;
		}
		return aproveEnd;
	}
	/**
	*This method allows to count how many angels have been created.
	
	*<b>post:</b> Indicate how many angels there are.
	
	*@return int countAngel.
	*/
	public int countAngel(){
		int totalCount=0;

		for(int i=0;i<angelito.length;i++){
			if(angelito[i]!=null){
				totalCount+=1;
			}
		}
		return totalCount;
	}
	/**
	*This method allows to display the information of an angel given its name.
	
	*<b>pre:</b> The name must be valid.
	*<b>post:</b> Display the information of the mentioned angels.
	
	*@param pname.
	*@return String infoName.
	*/
	public String infoName(String pname){
		boolean nameFound=false;
		String name;
		String info="Angel not found";
		for(int i=0; i<angelito.length && nameFound==false; i++) {
			if(angelito[i]!=null) {
				name=angelito[i].getName();
				if(name.equals(pname)) {
					info=angelito[i].toString()+"and the candle is: "+angelito[i].infoCandle();
					nameFound=true;
				}
			}
		}
		return info;
	}
	/**
	*This method allows to display the information of an angel given its power.
	
	*<b>pre:</b> The power must be valid.
	*<b>post:</b> Display the information of the mentioned power.
	
	*@param ppower.
	*@return String infoPower.
	*/
	public String infoPower(String ppower){
		boolean powerFound=false;
		String power;
		String info="Angel not found";
		for(int i=0; i<angelito.length && powerFound==false; i++) {
			if(angelito[i]!=null) {
				power=angelito[i].getPower();
				if(power.equals(ppower)) {
					info=angelito[i].toString()+"and the candle is: "+angelito[i].infoCandle();
					powerFound=true;
				}
			}
		}
		return info;
	}
	/**
	*This method allows to display the celebrations given a month
	
	*<b>pre:</b> The month must be valid
	*<b>post:</b> Display the celebrations of the month
	
	*@param pmonth.
	*@return String infoCelebraMonth.
	*/
	public String infoCelebrateMonth(String pmonth){
			String month;
			String info=" //";
			for(int i=0; i<angelito.length ; i++) {
				if(angelito[i]!=null) {
					month=angelito[i].getCelebrateMonth();
					if(month.equals(pmonth)) {
						info=info+"name: "+angelito[i].getName()+". Day of celebration: "+angelito[i].getDate()+". Color of the candle: "+angelito[i].getCandleColor()+". And the essence: "+angelito[i].getCandleEssence()+" //";
					}
				}
			}
			return info;
		}
	/**
	*This method allows to display all celebrations.
	
	*<b>pre:</b> celebrationMonth and celebrationDay must be valid.
	*<b>post:</b> Display all celebrations.
	
	*@return String allCelebration.
	*/
	
	public String allCelebration(){
		String info=" //";
		boolean angelFound=false;
		for(int i=0; i<angelito.length; i++) {
			if(angelito[i]!=null) {
				info=info+angelito[i].getName()+":"+angelito[i].getDate()+" //";
				angelFound=true;
				}
			}
		if (angelFound==false)
			info="Angels not found";
		return info;
		}
	}
