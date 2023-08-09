package buoi3;

public class Gach {
	String ms;
	String mau;
	int so_luong;
	int dai, ngang;
	long gia;
	
	public Gach() {
		ms = new String();
		mau = new String();
		so_luong = 0;
		dai = ngang = 0;
		gia = 0;
	}
	public Gach(String ms, String mau, int so_luong,int dai, int ngang, long gia) {
		this.ms = new String(ms);
		this.mau = new String(mau);
		this.so_luong = so_luong;
		this.dai = dai;
		this.ngang = ngang;
		this.gia = gia;
	}
	public Gach(Gach g) {
		this.ms = new String(g.ms);
		this.mau = new String(g.mau);
		this.so_luong = g.so_luong;
		this.dai = g.dai;
		this.ngang = g.ngang;
		this.gia = g.gia;
	}
	
}
