package ui;

import java.util.Scanner;

import model.Legion;

public class Main{
	
	//attribute
	private Scanner lc1;
	private Scanner lc2;
	
	//relations
	private Legion maximaSuperior;
	
	public static void main(String[]args){
		Main main = new Main();
		main.menu();
	}
		
	//constructor
	public Main(){
		lc1 = new Scanner(System.in);
		lc2 = new Scanner(System.in);
		maximaSuperior = new Legion(num());
		}
	
	public int num() {
		System.out.println("how many angels do you want to register?");
		int num = lc2.nextInt();
		
		return num;
	}
	
	public void menu(){
		int op=0;
		while(op!=7) {
		System.out.println("");
		System.out.println("WELCOME TO YOUR APPLICATION OF ARCHANGELS");
		System.out.println("");
		System.out.println("MENU");
		System.out.println("");
		System.out.println("These are the functionalities of your application, choose the one you want to perform");
		System.out.println("1. Add archangels");
		System.out.println("2. Count the added archangels");
		System.out.println("3. Information of an archangel by name");
		System.out.println("4. Information of an archangel by power");
		System.out.println("5. Show celebrations according to the month you want");
		System.out.println("6. Show all celebration dates");
		System.out.println("7. Exit");
		System.out.println("");
		
		op=lc2.nextInt();
		
		switch(op){
			case 1:
					System.out.println("");
					System.out.println("Enter the archangels");
					System.out.println("");
					System.out.println("REMEMBER");
					System.out.println("The name must end in -el");
					System.out.println("Cannot repeat the name of an archangel");
					System.out.println("Power is unique to an archangel");
					System.out.println("");
					System.out.println("Enter name");
					
					String pname=lc1.nextLine();
					
					System.out.println("");
					System.out.println("Enter the URL of the photo");
					
					String pphoto=lc1.nextLine();
					
					System.out.println("");
					System.out.println("Enter prayer");
					
					String pprayer=lc1.nextLine();
					
					System.out.println("");
					System.out.println("Enter the month of celebration(Ej: january, february...)");
						
					String pcelebrateMonth=lc1.nextLine();
					
					System.out.println("");
					System.out.println("Enter the day of celebration(Ej: 1/ 2/ 3...)");
					
					int pcelebrateDay=lc2.nextInt();
					
					System.out.println("");
					System.out.println("Enter power(Ej: protection, health, abundance, justice, loyalty...)");
						
					String ppower=lc1.nextLine();
					
					System.out.println("");
					System.out.println("Enter the color of the candle");
					
					String pcolor=lc1.nextLine();
						
					System.out.println("");
					System.out.println("Enter the size of the candle(tall, medium or little)");
						
					String psize=lc1.nextLine();
					
					System.out.println("");
					System.out.println("Enter the essence of the candle");
					
					String pessence=lc1.nextLine();
						
					System.out.println("");
					System.out.println("Enter the ilumination of the candle(High, medium or low)");
						
					String pilumination=lc1.nextLine();
						
					System.out.println("");
					
					System.out.println(maximaSuperior.addAngel(pname, pphoto, pprayer, pcelebrateMonth, pcelebrateDay, ppower, pcolor, psize, pessence, pilumination));
					
					break;
			
			case 2:
					System.out.println("");
					System.out.println("You have created "+maximaSuperior.countAngel()+" archangels");
					System.out.println("");
					break;
			
			case 3:
					System.out.println("");
					System.out.println("Enter the name of the archangel you want to know your information");
					String	ppname=lc1.nextLine();
					System.out.println("");
					System.out.println(maximaSuperior.infoName(ppname));
					
			break;
			
			case 4:
					System.out.println("");
					System.out.println("Enter the power of the archangel you want to know your information");
					String	pppower=lc1.nextLine();
					System.out.println(maximaSuperior.infoPower(pppower));
					
			break;
			
			case 5:
					System.out.println("");
					System.out.println("Enter the month you want to know your celebrations");
					String ppcelebrateMonth=lc1.nextLine();
					System.out.println(maximaSuperior.infoCelebrateMonth(ppcelebrateMonth));

			break;
			
			case 6:
					System.out.println("Below you will find all the celebrations of the archangels");
					System.out.println(maximaSuperior.allCelebration());
			break;
			
		}
		}
	}
}