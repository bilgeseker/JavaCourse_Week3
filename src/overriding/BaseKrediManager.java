package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) { // final  varsa override edilemez, inherit edildiği classlarda değiştirilemez
		return tutar*1.18;
	}
}
