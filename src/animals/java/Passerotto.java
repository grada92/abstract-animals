package animals.java;

public class Passerotto extends Animale implements IVolante{

	@Override
	void dormi() {
		System.out.println("Zzz");
		
	}

	@Override
	void verso() {
		System.out.println("Il Passerotto fa Cip Cip");
		
	}

	@Override
	void mangia() {
		System.out.println("Il Passerotto Mangia frutta secca!");
		
	}

	@Override
	public void Vola() {
		System.out.println("Il Passerotto Sta Volando!");
		
	}
	
	

}
