package buoi3;
import buoi2.Date;
import java.util.Scanner;
public class SinhVien {
	final int MAX = 60;
	private String mssv;
	private String hoten;
	private Date ng_sinh;
	private int so_hp;
	private String[] ten_hp;
	private String[] diem;
	
	public SinhVien(){
		mssv = new String();
		hoten = new String();
		ng_sinh = new Date();
		so_hp = 0;
		ten_hp = new String[MAX];
		diem = new String[MAX];
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getEmail() {
		return " ";
	}
	public SinhVien(String mssv,String hoten, Date ng_sinh, int so_hp,String ten_hp[],String diem[]){
		this.mssv = new String(mssv);
		this.hoten = new String(hoten);
		this.ng_sinh = new Date(ng_sinh);
		this.so_hp = so_hp;
		this.ten_hp = new String[MAX];
		this.diem = new String[MAX];
		for(int i=0;i<so_hp;i++){
			this.ten_hp[i] = new String(ten_hp[i]);
			this.diem[i] = new String(diem[i]);
		}		
	}
	public SinhVien(SinhVien sv){
		mssv = new String(sv.mssv);
		hoten = new String(sv.hoten);
		ng_sinh = new Date(sv.ng_sinh);
		so_hp = sv.so_hp;
		ten_hp = new String[MAX];
		diem = new String[MAX];
		for(int i=0; i<so_hp; i++){
			ten_hp[i] = new String(sv.ten_hp[i]);
			diem[i] = new String(sv.diem[i]);
		}
	}
	public void nhap(){
		Scanner s = new Scanner(System.in);
		System.out.println("nhap ma so sinh vien: ");
		mssv = s.nextLine();
		System.out.println("nhap ho ten: ");
		hoten = s.nextLine();
		ng_sinh.nhap();
		System.out.println("nhap so hoc phan dang ky: ");
		so_hp = s.nextInt();
		s.nextLine();
		int i;
		for(i=0; i<so_hp; i++){
			System.out.println("nhap ten hoc phan thu "+(i+1));
			ten_hp[i] = s.nextLine();
			System.out.println("nhap diem hoc phan thu "+(i+1));
			diem[i] = s.nextLine();
		}
	}
	public void nhapDiem(){
		int i;
		Scanner s = new Scanner(System.in);
		for(i=0;i<so_hp;i++){
			System.out.println("Nhap diem mon "+ten_hp[i]);
			diem[i] = s.nextLine();
		}
	}
	public String toString(){
		String s = mssv+" "+ hoten+" ngay sinh: "+ ng_sinh+" so luong hoc phan dang ky: "+so_hp+"\n";
		int i;
		s+= "Cac hoc phan da dang ky \n";
		for(i=0; i<so_hp; i++){
			s = s + ten_hp[i] +" "+ diem[i]+ "\n";
		}
		return s;
	}
	public double tinhDiem(){
		int i;
		double tong = 0;
		for(i=0;i<so_hp;i++){
			if(diem[i].equals("A")){
				tong += 4;
			}else if(diem[i].equals("B+")==true){
				tong += 3.5;
			}else if(diem[i].equals("B")==true){
				tong += 3;
			}else if(diem[i].equals("C+")==true){
				tong += 2.5;
			}else if(diem[i].equals("C")==true){
				tong += 2;
			}else if(diem[i].equals("D+")==true){
				tong += 1.5;
			}else if(diem[i].equals("D")==true){
				tong += 1;
			}else if(diem[i].equals("F")==true){
				tong += 3.5;
			}
		}
		return tong/so_hp;
	}
	public void dangKy(){
		if(so_hp == MAX){
			System.out.println("Da dang ky toi da so hoc phan");
			return;
		}
		System.out.println("Nhap ten hoc phan dang ky: ");
		Scanner s = new Scanner(System.in);
		ten_hp[so_hp] = new String();
		diem[so_hp] = new String();
		ten_hp[so_hp] = s.nextLine();
		so_hp++;
	}
	public void xoaHocPhan(String hp){
		int i=0;
		int index = 0;
		for(; i<so_hp; i++){
			if(hp.equalsIgnoreCase(ten_hp[i]) == true){
				index = i;
				break;
			}
		}
		if(index < so_hp)
			for(i=index; i<so_hp-1;i++){
				ten_hp[i] = ten_hp[i+1];
				diem[i] = diem[i+1];
			}
	}	
}
