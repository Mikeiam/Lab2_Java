package bag;

public class Chlorine extends Element{
	public Chlorine(String name,int number,int valence,int energy){
		super(name,number,valence,energy);
	}

	@Override
	public void reaction(Element obj){
		double endEnergy=0;
		if(obj.getNumber()==1 & obj.getValence()==1){
			double molekCrEn=440.8;
			System.out.println("Реакция с водородом:");
			System.out.println();
			endEnergy=2*molekCrEn-getEnergy()-obj.getEnergy();
			System.out.println("H2 + Cl2 = 2 HCl +" + endEnergy + " kJ/mole  + BoOoM!");
		}
	}
}
