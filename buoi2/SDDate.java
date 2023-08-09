package buoi2;

public class SDDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(4,7,2003);
		d.hienThi();
		d = d.ngayHomSau();
		d.hienThi();
		d = d.congNgay(175);
		d.hienThi();
	}

}
