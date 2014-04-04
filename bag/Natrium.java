package bag;

public class Natrium extends Element{
	public Natrium(String name,int number,int valence,int energy){
		super(name,number,valence,energy);
	}

	@Override
	public void reaction(Element obj){
		double endEnergy=0;
		if(obj.getNumber()==17 & obj.getValence()==1){
			double molekCrEn=540;
			System.out.println("Реакция с хлором:");
			System.out.println();
			endEnergy=2*molekCrEn-2*getEnergy()-obj.getEnergy();
			System.out.println("2 Na + Cl2 = 2 NaCl +" + endEnergy + " kJ/mole");
		}
	}
}
