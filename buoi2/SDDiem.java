package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem a = new Diem(3, 4);
		a.hienThi();
		Diem b = new Diem();
		b.nhap();
		Diem c = new Diem();
		c=c.doixung(b);
		c.hienThi();
		System.out.println(b.khoangCach());
		System.out.println(a.khoangCach(b));
	}

}
