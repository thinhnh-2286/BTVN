package vehicle;

public class Motobike extends Vehicle {

	private int congSuat;

	public Motobike(String soXe, String nhaSX, int namSX, String mauXe, Owner owner,
			int congSuat) {
		super(soXe, nhaSX, namSX, mauXe, owner);
		{
			this.congSuat = congSuat;
		}
	}

	public int getcongSuat() {
		return congSuat;
	}

	public void setcongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
}