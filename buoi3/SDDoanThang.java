package buoi3;

import buoi2.Diem;
public class SDDoanThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem a = new Diem(1, 1);
		Diem b = new Diem(3, 3);
		DoanThang ab = new DoanThang(a, b);
		ab.hienThi();
		System.out.println("Sau khi tinh tuyen di doan (5, 3");
		ab.tinh_tuyen(5, 3);
		ab.hienThi();
		
		DoanThang cd = new DoanThang();
		cd.nhap();
		cd.hienThi();
		System.out.println("Do dai CD: "+ cd.tinhDoDai());
		cd.goc_voi_Ox();
	}

}
