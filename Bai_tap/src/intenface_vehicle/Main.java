package intenface_vehicle;

public class Main {

	public static void main(String[] args) {
		Xe_dap xd1 = new Xe_dap("Xe dap", 100000);
		xd1.display_data();
		Xe_may xm1 = new Xe_may("Xe may", 200000);
		xm1.display_data();
		OTo oto1 = new OTo("O To", 300000);
		oto1.display_data();
		XeKhach xk1 = new XeKhach("XeKhach1", 300000, 4);
		xk1.display_data();
		XeKhach xk2 = new XeKhach("XeKhach2", 300000, 5);
		xk2.display_data();
		XeKhach xk3 = new XeKhach("XeKhach3", 300000, 6);
		xk3.display_data();
	}

}
