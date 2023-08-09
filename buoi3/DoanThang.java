package buoi3;
import java.text.DecimalFormat;

import java.text.DecimalFormat;

import buoi2.Diem;
public class DoanThang {
	private Diem d1, d2;
	
	DecimalFormat df = new DecimalFormat(".#");
	public DoanThang(){
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(int x1, int y1, int x2, int y2){
		d1 = new Diem(x1, y1);
		d2 = new Diem(x2, y2);
	}
	public DoanThang(Diem d1, Diem d2){
		this.d1 = new Diem(d1);
		this.d2 = new Diem(d2);
	}
	public DoanThang(DoanThang d){
		d1 = new Diem(d.d1);
		d2 = new Diem(d.d2);
	}
	public void nhap(){
		System.out.println("Nhap toa do 2 diem");
		System.out.println("Diem thu nhat: ");
		d1.nhap();
		System.out.println("Diem thu hai: ");	
		d2.nhap();
	}
	public void hienThi(){
		System.out.println("Toa do 2 dau mut: ");
		d1.hienThi();
		d2.hienThi();
	}
	public void tinh_tuyen(int dx, int dy){
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float tinhDoDai(){
		return (float)d1.khoangCach(d2);
	}
	public void goc_voi_Ox(){
		// d1 dinh trai va d2 la dinh phai
		double dai_x = d1.giaTriX() - d2.giaTriX();
		double dai_y = d1.giaTriY() - d2.giaTriY();
		double cos;
		dai_x = Math.abs(dai_x);
		cos = dai_x/d1.khoangCach(d2);
		cos = Math.acos(cos);
		cos = cos*180/Math.PI;
		if(dai_y>0){
			cos = 180 - cos;
		}
		System.out.println("Goc cua doan thang voi Ox: "+df.format(cos)+" degree") ;
	}
	
}