import java.util.Scanner;
// ax + b = c
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("nhap vao 3 so a,b,c>  ");
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		c = Integer.parseInt(sc.nextLine());

		if(a==0) {
			if(b==c) {
				System.out.print("phuong trinh vo so ngiem");
			} else {
				System.out.print("phuong trinh vo nghiem");
			}
		} else {
			System.out.print("phuong trinh co nghiem> " + );
		}
	}
}