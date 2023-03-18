package vehicle;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Manager manager = new Manager();
	    // Thêm phương tiện giao thông
	    manager.addVehicle(new Car("1", "Yamaha", 2005, "Đỏ", new Owner("ID1", "Thinh1", "aaa@example.com"), 5, "Gas"));
	    manager.addVehicle(new Car("3", "Toyota", 2010, "Đen", new Owner("ID1", "Thinh2", "bbb@example.com"), 15, "Gas"));
	    manager.addVehicle(new Car("5", "Yamaha", 2015, "Trắng", new Owner("ID4", "Thinh3", "ccc@example.com"), 25, "Gas"));
	    manager.addVehicle(new Car("7", "Toyota", 2019, "Trắng", new Owner("ID1", "Thinh4", "ddd@example.com"), 35, "Gas"));
	    manager.addVehicle(new Car("9", "Suzuki", 2008, "Trắng", new Owner("ID1", "Thinh1", "aaa@example.com"), 45, "Gas"));
	    manager.addVehicle(new Motobike("2", "Suzuki", 2005, "Trắng", new Owner("ID3", "Thinh1", "aaa@example.com"), 1500));
	    manager.addVehicle(new Motobike("4", "Honda", 2010, "Trắng", new Owner("ID1", "Thinh1", "bbb@example.com"), 200));
	    manager.addVehicle(new Motobike("8", "Suzuki", 2015, "Trắng", new Owner("ID1", "Thinh1", "ccc@example.com"), 250));
	    manager.addVehicle(new Motobike("12", "Suzuki", 2019, "Trắng", new Owner("ID2", "Thinh1", "aaa@example.com"), 120));
	    manager.addVehicle(new Motobike("10", "Suzuki", 2008, "Trắng", new Owner("ID1", "Thinh2", "ddd@example.com"), 2200));
	    manager.addVehicle(new Truck("6", "Toyota", 2012, "Xanh", new Owner("ID1", "Thinh2", "aaa@example.com"), 18000));
	    manager.addVehicle(new Truck("11", "Yamaha", 2008, "Đen", new Owner("ID1", "Thinh2", "bbb@example.com"), 15000));
	    manager.addVehicle(new Truck("15", "Toyota", 2019, "Đen", new Owner("ID1", "Thinh2", "ddd@example.com"), 17000));
	    manager.addVehicle(new Truck("17", "Honda", 2015, "Đen", new Owner("ID2", "Thinh2", "aaa@example.com"), 60200));
	    manager.addVehicle(new Truck("13", "Toyota", 2010, "Xanh", new Owner("ID1", "Thinh2", "aaa@example.com"), 100000));

	    Vehicle vehicle1 = manager.timPTsoXe("17");
	    System.out.println("2 - Phuong tien tim theo so xe: ");
	    System.out.println("- Số xe: " + vehicle1.getsoXe());
	    System.out.println("- Nhà sản xuất: " + vehicle1.getnhaSX());
	    System.out.println("- Năm sản xuất: " + vehicle1.getnamSX());
	    System.out.println("- Màu xe: " + vehicle1.getmauXe());
	  
	    System.out.println("---------------------------");
	    List<Vehicle> vehicles1 = manager.timPTID("ID1");
	    System.out.println("3 - So luong phuong tien tim theo ID: " + vehicles1.size());
	    System.out.println("---------------------------");

	    System.out.println("4 - So luong phuong tien truoc khi xoa: " + manager.getVehicles().size());
	    manager.xoaPTNSX("Suzuki");
	    System.out.println("4 - So luong phuong tien sau khi xoa: " + manager.getVehicles().size());
	    System.out.println("6 - Danh sach cac phuong tien giao thong theo so xe giam dan:");
	    manager.SxbysoXe();


	}
}
