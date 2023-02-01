package animals.java;

public class Delfino extends Animale implements INuotante {

	@Override
	void dormi() {
		System.out.println("Zzz");
		
	}

	@Override
	void verso() {
		System.out.println("Il Delfino fa gri gri");
		
	}

	@Override
	void mangia() {
		System.out.println("il Delfino mangia acciughe");
		
	}

	@Override
	public void Nuota() {
		System.out.println("Delfino Sta Nuotando!");
		
	}
	
	
}
