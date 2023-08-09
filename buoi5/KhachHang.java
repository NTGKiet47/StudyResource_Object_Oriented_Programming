package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String ms, hten;
	private boolean g_tinh;
	public KhachHang() {
		ms = new String();
		hten = new String();
		g_tinh = true; // true la phu nu 
	}
	public KhachHang(String ms, String hten, boolean g_tinh) {
		this.ms = new String(ms);
		this.hten = new String(hten);
		this.g_tinh = g_tinh;
	}
	public KhachHang(KhachHang kh) {
		ms = new String(kh.ms);
		hten = new String(kh.hten);
		g_tinh = kh.g_tinh;
	}
	public void nhap() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap ma so khach hang: ");
		ms = s.nextLine();
		System.out.println("Nhap ho ten khach hang: ");
		hten = s.nextLine();
		System.out.println("Gioi tinh: chon 1 la nu, chon 0 la nam");
		int c = s.nextInt();
		if(c==1)
			g_tinh = true;
		else
			g_tinh = false;
	}
	public void hienThi() {
		System.out.println("Ma so khach: "+ms);
		System.out.println("Ho ten: "+hten);
		System.out.print("Gioi tinh: ");
		if(g_tinh==true)
			System.out.println("NU");
		else
			System.out.println("NAM");
	}
	public String toString() {
		String s = "Ms: "+ms+" Ho ten: "+hten+ " Gioi tinh: ";
		if(g_tinh == true)
			s += "NU";
		else
			s += "NAM";
		return s;
	}
}
