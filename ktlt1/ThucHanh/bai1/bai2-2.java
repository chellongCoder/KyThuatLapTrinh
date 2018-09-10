import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		System.out.print("tong 10 so chan dau tien> ");
		int sum = 0;
		int i = 0;
		int dem = 0;
		while (dem<10) {
			if(i%2==0) {
				sum += i;
				dem++;
			}
			i += 2;
		}
		System.out.print(sum);
	}
}