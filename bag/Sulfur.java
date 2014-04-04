package bag;

public class Sulfur extends Element {
	public Sulfur(String name,int number,int valence,int energy){
		super(name,number,valence,energy);
	}
	
	@Override
	public void reaction(Element obj){
		double endEnergy=0;
		if(obj.getNumber()==8 & obj.getValence()==2){
			double molekCrEn=829;
			System.out.println("Реакция с кислородом:");
			System.out.println();
			endEnergy=molekCrEn-getEnergy()-obj.getEnergy();
			System.out.println("S + O2 = SO2 +" + endEnergy + " kJ/mole");
		}
	}
}
