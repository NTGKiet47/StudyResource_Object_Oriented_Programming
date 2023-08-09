package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sum=0, max = Double.MIN_VALUE ;
		PhanSo max_ps = new PhanSo();
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap so luong phan so: ");
		n = s.nextInt();
		PhanSo ar[] = new PhanSo[n];
		for(int i=0;i<n;i++) {
			ar[i] = new PhanSo();
			ar[i].nhap();
			sum += ar[i].giaTriThuc();
			if(ar[i].giaTriThuc()>max) {
				max = ar[i].giaTriThuc();
				max_ps = ar[i];
			}
				
		}
		System.out.println("Tong day phan so = "+sum);
		System.out.print("Phan so lon nhat: ");
		max_ps.hienThi();
	}

}
