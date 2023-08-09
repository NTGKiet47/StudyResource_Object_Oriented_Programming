package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SDSinhVienCNTT {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien: ");
		int n=s.nextInt();
		SinhVien a[] = new SinhVien[n];
		for(int i=0;i<n;i++) {
			System.out.println("Chon 1: Sinh vien cntt\nChon 2: Sinh vien khac");
			int c = s.nextInt();
			if(c==1) {
				a[i] = new SinhVienCNTT();
			}else {
				a[i] = new SinhVien();
			}
			a[i].nhap();
		}
		s.nextLine();
		System.out.println("Nhap email sinh vien can tim: ");
		String find = new String();
		find = s.nextLine();
		for(SinhVien e : a) {
			if(e.getEmail().equalsIgnoreCase(find)) {
				System.out.println(e);
			}
		}
		
	}
}
