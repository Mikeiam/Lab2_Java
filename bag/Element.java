package bag;

public abstract class Element {
	private String name; //��������
	private int number; //���������� �����	
	private int valence; //�����������
	private int energy; // ������� ������� �����
	public Element(String name,int number,int valence,int energy){
		this.name=name;
		this.number=number;
		this.valence=valence;
		this.energy=energy;
	}
	public String getName(){
		return name;
	}
	public int getNumber(){
		return number;
	}
	public int getValence(){
		return valence;
	}
	public int getEnergy(){
		return energy;
	}
	public void reaction(Element obj){};
	
}
