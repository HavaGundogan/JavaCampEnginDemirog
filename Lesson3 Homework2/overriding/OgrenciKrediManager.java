package overriding;

public class OgrenciKrediManager extends BaseKrediManager{

	public final double hesapla(double tutar) {//final keywordu override edilmesini engeller
	return tutar*1.10;
	}
}
