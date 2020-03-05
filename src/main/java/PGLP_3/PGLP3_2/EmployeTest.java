package PGLP_3.PGLP3_2;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeTest {
	@Test
	public void Testsalaire() {
		Vendeur v =new Vendeur(10);
		Vendeur v2= new Vendeur(20);
		Employe e =new Employe(2010);
		Employe e2 =new Employe(2005);
		ArrayList<AllEmploye> listEmploye = new ArrayList <AllEmploye>();
		listEmploye.add(e);
		listEmploye.add(e2);
		listEmploye.add(v);
		listEmploye.add(v2);
		double salaireTotal=0;
		for(int i=0;i < listEmploye.size();i++) {
			salaireTotal += listEmploye.get(i).salaire();
		}
		System.out.println("salaire total :"+salaireTotal);
	}
	 
	 
	

}