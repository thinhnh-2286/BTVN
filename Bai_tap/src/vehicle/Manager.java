package vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Manager {
	Scanner sc = new Scanner(System.in);

	private ArrayList<Vehicle> vehicles;

	public Manager() {
		this.vehicles = new ArrayList<>();
	}

	// 1 - Thêm phương tiện giao thông
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

//	public void addXe(Vehicle vehicle) {
//	    char c;
//		int chon = 0;
//		while (true) {
//			System.out.print("Ban muon nhap loai xe nao (1-XeTai,2-Xemay,3-Oto):");
//			chon = sc.nextInt();
//			sc.nextLine();
//			switch (chon) {
//			case 1: {
//		System.out.println("Nhập số xe");
//		String soXe = sc.nextLine();
//		System.out.println("Nhập nhà sản xuất");
//		String nhaSX = sc.nextLine();
//		System.out.println("Nhập năm sản xuất");
//		int namSX = sc.nextInt();
//		System.out.println("Nhập màu xe");
//		String mauXe = sc.nextLine();
//		System.out.println("Nhập công suất xe:");
//		int congSuat = sc.nextInt();
//		System.out.println("Nhập thông tin chủ xe:");
//		System.out.println("- Nhập ID:");
//		String IdOwner = sc.nextLine();
//		System.out.println("- Nhập name:");
//		String name = sc.nextLine();
//		System.out.println("- Nhập email:");
//		String email = sc.nextLine();
//		vehicles.add(vehicle);
//		System.out.println(vehicle);
//		System.out.println("Thông tin xe:");
//		System.out.println("- Nhà sản xuất: " + nhaSX);
//		System.out.println("- Năm sản xuất: " + namSX);
//		System.out.println("- Màu xe: " + mauXe);
//		System.out.println("- Công suất: " + congSuat);
//		System.out.println("Thông tin chủ xe:");
//		System.out.println("- ID: " + IdOwner);
//		System.out.println("- Name: " + name);
//		System.out.println("- Email: " + email);
//		
//
	// break;
	// }
//	
//			}
//		}

//	}
//	}

	// 2 - Tìm kiếm phương tiện giao thông theo số xe
	public Vehicle timPTsoXe(String soXe) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getsoXe() == soXe) {
				return vehicle;
			}
		}
		return null;
	}

	// 3 - Tìm phương tiện giao thông của chủ xe có số cmnd tương ứng.
	public List<Vehicle> timPTID(String ownerId) {
		List<Vehicle> result = new ArrayList<>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getOwner().getIdOwner().equals(ownerId)) {
				result.add(vehicle);
			}
		}
		return result;
	}

	// 4 - Xóa tất cả các phương tiện giao thông của một nhà sản xuất bất kỳ.
	public void xoaPTNSX(String nhaSX) {
		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getnhaSX().equals(nhaSX)) {
				vehicles.remove(i);
			}
		}
	}


	// 6 - Sắp xếp các phương tiện giao thông theo số xe giảm dần
	public void SxbysoXe() {
		Collections.sort(vehicles);
		Collections.reverse(vehicles);
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getsoXe());
		}
	}



	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
