package buoi2;

import java.util.Scanner;

public class Diem {
	private int x, y;
	public Diem() {
		x=y=0;
	}
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Diem(Diem d) {
		x = d.x;
		y = d.y;
	}
	public void nhap() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap x: ");
		x = s.nextInt();
		System.out.println("Nhap y: ");
		y = s.nextInt();
	}
	public void hienThi() {
		System.out.println("("+x+","+y+")");
	}
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
	public int giaTriX() {
		return x;
	}
	public int giaTriY() {
		return y;
	}
	public double khoangCach() {
		return (double)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	public double khoangCach(Diem d) {
		return (double)Math.sqrt(Math.pow(x-d.x, 2)+Math.pow(y-d.y, 2));
	}
	public Diem doixung(Diem d) {
		Diem res = new Diem(d.x, d.y);
		res.x *= -1;
		res.y *= -1;
		return res;
	}
}
