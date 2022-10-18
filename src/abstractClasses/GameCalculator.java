package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla(); //inherit edildiği classta hesapla fonksiyonu override edilmek zorunda
	public void gameOver() {  //abstract olmadığı için her classta aynı şeklde kullanılır
		System.out.println("Oyun bitti");
	}
}
