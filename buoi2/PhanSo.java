package buoi2;

import java.util.Scanner;

public class PhanSo {
	int tu, mau;
	public PhanSo() {
		tu = 0;
		mau = 1;
	}
	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}
	public PhanSo(PhanSo p) {
		tu = p.tu;
		mau = p.mau;
	}
	public void nhap() {
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Nhap tu va mau");
			tu = s.nextInt();
			mau = s.nextInt();
			if(mau==0)
				System.out.println("Nhap lai");
		}while(mau==0);
	}
	public void hienThi() {
		if(tu==0 || tu==1)
			System.out.println(tu);
		else {
			if(tu*mau>0) {
				System.out.println(tu+"/"+mau);
			}else {
				if(mau<0) {
					mau*=-1;
					tu*=-1;
				}
				System.out.println(tu);
			}
		}
	}
	public PhanSo giaTriNghichDao() {
		PhanSo p = new PhanSo(tu, mau);
		int tmp = p.mau;
		p.mau = p.tu;
		p.tu = tmp;
		return p;
	}
	public double giaTriThuc() {
		return (double)tu/mau;
	}
	public boolean lonHon(PhanSo p) {
		return giaTriThuc() > p.giaTriThuc();
	}
	public PhanSo cong(PhanSo a) {
		PhanSo r = new PhanSo(tu, mau);
		if(r.mau == a.mau) {
			r.tu += a.tu;
		}else {
			int tu = r.tu*a.mau + r.mau*a.tu;
			int mau = r.mau*a.mau;
			r.tu = tu;
			r.mau = mau;
		}
		r.toiGian();
		return r;
	}
	public PhanSo tru(PhanSo a) {
		PhanSo r = new PhanSo(tu, mau);
		if(r.mau == a.mau) {
			r.tu -= a.tu;
		}else {
			int tu = r.tu*a.mau - r.mau*a.tu;
			int mau = r.mau*a.mau;
			r.tu = tu;
			r.mau = mau;
		}
		r.toiGian();
		return r;
	}
	public PhanSo nhan(PhanSo a) {
		PhanSo r = new PhanSo(tu, mau);
		r.tu *= a.tu;
		r.mau *= a.mau;
		r.toiGian();
		return r;
	}
	public PhanSo chia(PhanSo a) {
		PhanSo r = new PhanSo(tu, mau);
		r.tu *= a.mau;
		r.mau *= a.tu;
		r.toiGian();
		return r;
	}
	public void toiGian() {
		int i, up = tu<mau?tu:mau;
		int ucln = 1;
		for(i=1;i<=up;i++) {
			if(tu%i==0 && mau%i==0)
				ucln = i;
		}
		tu/=ucln;
		mau/=ucln;
	}
}
