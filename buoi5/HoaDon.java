package buoi5;

import java.util.Scanner;

public class HoaDon {
	private String ma_so, tieu_de;
	private MyDate md;
	private KhachHang k;
	public HoaDon() {
		ma_so = new String();
		tieu_de = new String();
		md = new MyDate();
		k = new KhachHang();
	}
	public HoaDon(String ma_so, String tieu_de, MyDate md, KhachHang k) {
		this.ma_so = new String(ma_so);
		this.tieu_de = new String(tieu_de);
		this.md = new MyDate(md);
		this.k = new KhachHang(k);
	}
	public HoaDon(HoaDon hd) {
		ma_so = new String(hd.ma_so);
		tieu_de = new String(hd.tieu_de);
		md = new MyDate(hd.md);
		k = new KhachHang(hd.k);
	}
	public void nhap() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap ma so hoa don: ");
		ma_so = s.nextLine();
		System.out.println("Nhap tieu de: ");
		tieu_de = s.nextLine();
		md.nhap();
		k.nhap();
	}
	public void hienThi() {
		System.out.println("Ma so: "+ma_so+". Tieu de "+tieu_de);
		System.out.print("Tu ngay: ");
		md.hienThi();
		k.hienThi();
	}
	public String toString() {
		return "Ma so: "+ma_so+". Tieu de: "+tieu_de+". Tu ngay: "+md+" Thong tin khach: "+k;
	}
}
