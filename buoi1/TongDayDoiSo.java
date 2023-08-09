package buoi1;

public class TongDayDoiSo {

	public static void main(String[] args) {
		int sum = 0, n, max = Integer.MIN_VALUE;
		for(String e : args) {
			try {
				n = Integer.parseInt(e);
			}catch(NumberFormatException x) {
				n = 0;
			}
			sum += n;
			if(n > max)
				max = n;
		}
		System.out.println("Tong day = "+sum);
		System.out.println("So lon nhat: "+max);
	}

}
