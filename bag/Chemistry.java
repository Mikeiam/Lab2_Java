package bag;
import java.util.*;

public class Chemistry {
	public static void main(String[] args){
		int pick1=1,pick2=1,pick3=1;
		String name1="O2",name2="H2",name3="S",name4="C",name5="Na",name6="Cl2";
		int num1=8,num2=1,num3=16,num4=6,num5=11,num6=17;
		int val1=2,val2=1,val3=4,val4=4,val5=1,val6=1;
		int energy1=497,energy2=436,energy3=0,energy4=0,energy5=0,energy6=261;
		Element oxygen=new Oxygen(name1,num1,val1,energy1);
		Element hydrogen=new Hydrogen(name2,num2,val2,energy2);
		Element sulfur=new Sulfur(name3,num3,val3,energy3);
		Element carbon=new Carbon(name4,num4,val4,energy4);
		Element natrium=new Natrium(name5,num5,val5,energy5);
		Element chlorine=new Chlorine(name6,num6,val6,energy6);
		Scanner scan=new Scanner(System.in);
		while(pick1!=0){
			System.out.println("Выберите элемент:");
    		System.out.println("_________________");
    		System.out.println("1.Кислород");
    		System.out.println("2.Водород");
    		System.out.println("3.Сера");
    		System.out.println("4.Углерод");
    		System.out.println("5.Натрий");
    		System.out.println("6.Хлор");
    		System.out.println("0.Exit");
    		System.out.println("_________________");
    		pick1=scan.nextInt();
    		switch(pick1){
    			case 1:{
    				while(pick2!=0){
    				System.out.println("Выберите реакцию:");
    				System.out.println("1.С водородом");
    				System.out.println("2.С углеродом");
    				System.out.println("0.Exit");
    				pick2=scan.nextInt();
    				switch(pick2){
    					case 1:{
    						oxygen.reaction(hydrogen);
    						System.out.println();
    						break;
    					}
    					case 2:{
    						oxygen.reaction(carbon);
    						System.out.println();
    						break;
    					}
    					case 0:{
    						System.out.println();
    						break;	
    					}
    				}
    			    }
    			}
    			case 2:{
    				hydrogen.reaction(carbon);
    				System.out.println();
					break;
    			}
    			case 3:{
    				sulfur.reaction(oxygen);
    				System.out.println();
					break;
    			}
    			case 4:{
    				while(pick3!=0){
    				System.out.println("Выберите реакцию:");
    				System.out.println("1.С водородом");
    				System.out.println("2.С кислородом");
    				System.out.println("0.Exit");
    				pick3=scan.nextInt();
    				switch(pick3){
    					case 1:{
    						carbon.reaction(hydrogen);
    						System.out.println();
    						break;
    					}
    					case 2:{
    						carbon.reaction(oxygen);
    						System.out.println();
    						break;
    					}
    					case 0:{
    						System.out.println();
    						break;
    					}	
    				}
    				}
    			}
    			case 5:{
    				natrium.reaction(chlorine);
    				System.out.println();
					break;
    			}
    			case 6:{
    				chlorine.reaction(hydrogen);
    				System.out.println();
					break;
    			}
    			case 0:{
    				break;
    			}
    		}
    		
		}
		scan.close();
	}

}
