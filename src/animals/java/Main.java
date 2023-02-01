package animals.java;

public class Main {

	public static void main(String[] args) {

	
		Delfino delfino = new Delfino();
		Aquila aquila = new Aquila();
		Cane cane = new Cane();
		Passerotto passerotto = new Passerotto();
		
		// Delfino
		delfino.mangia();
		
		// Aquila
		aquila.mangia();
		
		// Cane
		cane.dormi();
		
		// Passerotto
		passerotto.verso();
		
		// METODI INTERFACCIA
		
		faiVolare(passerotto);
		faiVolare(aquila);
		faiNuotare(delfino);
		faiNuotare(cane);
	}

	public static void faiVolare(IVolante Animale) {
		Animale.Vola();
	}
	
	
	public static void faiNuotare(INuotante Animale) {
		Animale.Nuota();
	}
	

}
