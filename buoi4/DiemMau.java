package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem {
	private String mau;
	public DiemMau() {
		super();
		mau = new String();
	}
	public void ganMau(String mau) {
		this.mau = new String(mau);
	}
	public DiemMau(int x, int y, String mau) {
		super(x, y);
		this.mau = new String(mau);
	}
	public DiemMau(DiemMau dm) {
		super((Diem) dm);
		mau = new String(dm.mau);
	}
	public void nhap() {
		Scanner s = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap mau");
		mau = s.nextLine();
	}
	public void hienThi() {
		super.hienThi();
		System.out.println("Mau: "+mau);
	}
}
