import java.util.Scanner;

class Hello {
	public static void main (String[] args) {
		System.out.print("nhap ho ten: ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("name = " + name);
	}
}