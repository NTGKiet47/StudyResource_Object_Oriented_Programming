package buoi5;

import java.util.Scanner;

public class MyDate {
	private int d, m ,y;
	public MyDate() {
		d = m = y = 1;
	}
	public MyDate(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}
	public MyDate(MyDate md) {
		d = md.d;
		m = md.m;
		y = md.y;
	}
	public void nhap() {
		System.out.println("Nhap ngay thang va nam:");
		Scanner s = new Scanner(System.in);
		d = s.nextInt();
		m = s.nextInt();
		y = s.nextInt();
	}
	public void hienThi() {
		System.out.println(d+"/"+m+"/"+y);
	}
	public String toString() {
		return d+"/"+m+"/"+y;
	}
}

