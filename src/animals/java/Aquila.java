package animals.java;

public class Aquila extends Animale implements IVolante {

	@Override
	void dormi() {
		System.out.println("Zzz");
		
	}

	@Override
	void verso() {
		System.out.println("l'Aquila fa stri stri");
		
	}

	@Override
	void mangia() {
		System.out.println("l'Aquila Mangia Lepre!");
		
	}

	@Override
	public void Vola() {
		System.out.println("Aquila Sta Volando!");
		
	}

}
