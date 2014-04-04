package bag;

public class Carbon extends Element {
	public Carbon(String name,int number,int valence,int energy){
		super(name,number,valence,energy);
	}
	
	@Override
	public void reaction(Element obj){
		double endEnergy=0;
		if(obj.getNumber()==1 & obj.getValence()==1){
			double molekCrEn=948;
			System.out.println("Реакция с водородом:");
			System.out.println();
			endEnergy=molekCrEn-getEnergy()-2*obj.getEnergy();
			System.out.println("2 H2 + C = CH4 +" + endEnergy + " kJ/mole");
		}
		if(obj.getNumber()==8 & obj.getValence()==2){
			double molekCrEn=893.5;
			System.out.println("Реакция с кислородом:");
			System.out.println();
			endEnergy=molekCrEn-getEnergy()-obj.getEnergy();
			System.out.println("O2 + C = CO2 +" + endEnergy + " kJ/mole");
		}
	}
}
