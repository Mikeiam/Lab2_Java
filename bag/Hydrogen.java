package bag;

public class Hydrogen extends Element {
	public Hydrogen(String name,int number,int valence,int energy){
		super(name,number,valence,energy);
	}
	
	@Override
	public void reaction(Element obj){
		double endEnergy=0;
		if(obj.getNumber()==6 & obj.getValence()==4){
			double molekCrEn=948;
			System.out.println("Реакция с углеродом:");
			System.out.println();
			endEnergy=molekCrEn-2*getEnergy()-obj.getEnergy();
			System.out.println("2 H2 + C = CH4 +" + endEnergy + " kJ/mole");
		}
	}
}
