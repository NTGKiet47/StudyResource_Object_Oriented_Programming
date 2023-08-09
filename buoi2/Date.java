package buoi2;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	public Date() {
		ngay = thang = nam = 1;
	}
	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	public String toString() {
		return ngay + "/"+thang+"/"+nam;
	}
	public boolean hopLe() {
		int max_day[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(ngay<1||thang<1||nam<1||ngay>max_day[thang]||thang>12)
			return false;
		return true;
	}
	public void nhap() {
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay thang nam: ");
			ngay = s.nextInt();
			thang = s.nextInt();
			nam = s.nextInt();
			if (!hopLe())
				System.out.println("Nhap lai: ");
		}while(!hopLe());
	}
	public void hienThi() {
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	public Date ngayHomSau() {
		Date d = new Date(ngay, thang, nam);
		d.ngay += 1;
		if(!d.hopLe()) {
			d.ngay = 1;
			d.thang++;
			if(!d.hopLe()) {
				d.thang = 1;
				d.nam++;
			}
		}
		return d;
	}
	public Date congNgay(int n) {
		Date d = new Date(ngay, thang, nam);
		for(int i=1;i<=n;i++) {
			d = d.ngayHomSau();
		}
		return d;
	}
	
}
