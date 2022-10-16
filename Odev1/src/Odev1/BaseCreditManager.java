package Odev1;

public abstract class BaseCreditManager implements ICreditManager{
	@Override
	public  abstract void calculate(); // calculate hepsinde değişir o yüzden abstract

	@Override
	public void save() {
		System.out.println("kaydedildi");
	}
}
