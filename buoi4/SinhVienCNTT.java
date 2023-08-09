package buoi4;

import java.util.Scanner;

import buoi2.Date;
import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien{
	private String taikhoan, matkhau, email;
	public SinhVienCNTT() {
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(String hoten, String mssv, Date ng_s, int s_lg, String[] hp, String[] diem, String tk, String mk, String e) {
		super(hoten, mssv, ng_s, s_lg, hp, diem);
		taikhoan = new String(tk);
		matkhau = new String(mk);
		email = new String(e);
	}
	public SinhVienCNTT(SinhVien s, String tk, String mk, String e) {
		super(s);
		taikhoan = new String(tk);
		matkhau = new String(mk);
		email = new String(e);
	}
	public SinhVienCNTT(SinhVienCNTT sv) {
		super((SinhVien) sv);
		taikhoan = new String(sv.taikhoan);
		matkhau = new String(sv.matkhau);
		email = new String(sv.email);
	}
	public void nhap() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap thong tin sinh vien");
		super.nhap();
		System.out.println("Nhap tai khoan ELCIT: ");
		taikhoan = s.nextLine();
		System.out.println("Nhap mat khau");
		matkhau = s.nextLine();
		System.out.println("Nhap email: ");
		email = s.nextLine();
	}
	public String toString() {
		return super.toString() + "\nTai khoan: "+taikhoan+"\nemail: "+email;
	}
	public String getEmail() {
		return email;
	}
	
}
