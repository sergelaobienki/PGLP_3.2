package PGLP_3.PGLP3_2;

public class Manager extends AllEmploye {
	private final int base=1500;
	private int NombresEmployes;
	public Manager(int NombresEmployes) {
		this.NombresEmployes=NombresEmployes;
	}


	@Override
	public double salaire() {
		// TODO Auto-generated method stub
		return base+(NombresEmployes*100);
	}
}
