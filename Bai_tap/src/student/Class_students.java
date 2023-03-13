package student;

import java.util.ArrayList;
import java.util.List;

public class Class_students {

	private static void student20(List<School> dsHocSinh) {
		System.out.println("===== Danh sach hoc sinh 20 tuoi =====");
		for (int i = 0; i < dsHocSinh.size(); i++) {
			if (dsHocSinh.get(i).age == 20) {
				dsHocSinh.get(i).display_data();
			}
		}
	}

	private static void student23(List<School> dsHocSinh) {
		int count = 0;
		System.out.println("===== Danh sach hoc sinh 23 tuoi va que DN =====");
		for (int i = 0; i < dsHocSinh.size(); i++) {
			if (dsHocSinh.get(i).age == 23 && dsHocSinh.get(i).province == "DN") {
				count++;
				dsHocSinh.get(i).display_data();

			}
		}
		System.out.println("=> So luong hoc sinh 23 tuoi va que o DN: " + count);

	}

	public static void main(String[] args) {
		List<School> dsHocSinh = new ArrayList();
		School hocSinh1 = new School();
		School hocSinh2 = new School();
		School hocSinh3 = new School();
		School hocSinh4 = new School();

		dsHocSinh.add(hocSinh1.add_infor("Thinh1", "1", 21, "DN"));
		dsHocSinh.add(hocSinh2.add_infor("Thinh2", "2", 23, "DN"));
		dsHocSinh.add(hocSinh3.add_infor("Thinh3", "3", 20, "QN"));
		dsHocSinh.add(hocSinh4.add_infor("Thinh4", "4", 23, "DN"));

		//Hoc sinh 20 tuoi
		student20(dsHocSinh);
		//Hoc sinh 23 tuoi que DN
		student23(dsHocSinh);
	}

}
