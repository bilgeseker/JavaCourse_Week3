package abstractClasses;

public class Main {

	public static void main(String[] args) {
		FemaleGameCalculator femaleGameCalculator = new FemaleGameCalculator();
		femaleGameCalculator.hesapla();
		femaleGameCalculator.gameOver();
		
		GameCalculator[] gameCalculator = {new FemaleGameCalculator(), new KidsGameCalculator()};
	}

}
