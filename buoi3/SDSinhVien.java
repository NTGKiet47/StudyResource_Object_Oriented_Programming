package buoi3;
import java.util.Scanner;
public class SDSinhVien {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			SinhVien a = new SinhVien();
			a.nhap();
			a.dangKy();
			System.out.println(a);
			
		int n, i;
		System.out.println("Nhap so luong sinh vien: ");
		n = s.nextInt();
		SinhVien list[] = new SinhVien[n];
		for(i=0;i<n;i++){
			list[i] = new SinhVien();
			list[i].nhap();
		}
		int index = 0;
		double max = Double.MIN_VALUE;
		System.out.println("Cac sinh vien bi canh cao hoc vu: ");
		for(i=0; i<n; i++){
			if(list[i].tinhDiem() > max){
				index = i;
				max = list[i].tinhDiem();
			}
			if(list[i].tinhDiem() < 1.0){
				System.out.println(list[i]);
			}
		}
		System.out.println("\nSinh vien co diem trung binh cao nhat lop"+list[index]);
		sort(list, n);
		for(i=0; i<n; i++){
			System.out.println("Sinh vien thu "+(i+1));
			System.out.println(list[i]);
		}
	}
	public static void sort(SinhVien list[], int n){
		int i, j;
		for(i=0; i<n-1; i++){
			for(j=i+1; j<n; j++){
				String ten1 = new String(list[i].getHoten()); 
				ten1 = ten1.trim();
				String ten2 = new String(list[j].getHoten());
				ten2 = ten2.trim();
				int i1, i2;
				i1 = ten1.lastIndexOf(" ");
				i2 = ten2.lastIndexOf(" ");
				ten1 = ten1.substring(i1);
				ten2 = ten2.substring(i2);
				if(ten1.compareTo(ten2) > 0){
					SinhVien tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
					
			}
		}
	}
}
