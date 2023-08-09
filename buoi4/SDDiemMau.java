package buoi4;

public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau a = new DiemMau(5, 10, "trang");
		a.hienThi();
		DiemMau b = new DiemMau();
		b.nhap();
		b.doiDiem(10, 8);
		b.hienThi();
		b.ganMau("do");
		b.hienThi();
	}

}
