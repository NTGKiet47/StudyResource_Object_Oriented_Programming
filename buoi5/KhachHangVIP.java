package buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang{
	private float tyleGiam;
	private MyDate d; // ngay thanh khach VIP
	public KhachHangVIP() {
		super();
		tyleGiam = 0.0f;
		d = new MyDate();
	}
	public KhachHangVIP(String ms, String hten, boolean g_tinh, float tyLeGiam, MyDate d) {
		super(ms, hten, g_tinh);
		this.tyleGiam = tyLeGiam;
		this.d = new MyDate(d);
	}
	public KhachHangVIP(KhachHangVIP k_vip) {
		super(k_vip);
		tyleGiam = k_vip.tyleGiam;
		d = new MyDate(k_vip.d);
	}
	public void nhap() {
		System.out.println("Khach VIP");
		Scanner s = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap ty le giam gia: ");
		tyleGiam = s.nextFloat();
		System.out.println("Nhap ngay tro thanh khach VIP: ");
		d.nhap();
	}
	public void hienThi() {
		System.out.println("Thong tin khach VIP");
		super.hienThi();
		System.out.println("Ty le giam: "+tyleGiam+" tu ngay "+d);
	}
	public String toString() {
		return super.toString() + " Ty le giam: "+tyleGiam+" Tu ngay: "+d;
	}
}
