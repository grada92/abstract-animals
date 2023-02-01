package animals.java;

public class Cane extends Animale implements INuotante {

	@Override
	void dormi() {
		System.out.println("Zzz");
		
	}

	@Override
	void verso() {
		System.out.println("Il Cane fa Bau Bau");
		
	}

	@Override
	void mangia() {
		System.out.println("Il Cane Mangia Crocchette!");
		
	}

	@Override
	public void Nuota() {
		System.out.println("Il Cane Sta Nuotando!");
		
	}

}
