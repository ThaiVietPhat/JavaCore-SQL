package CauDieuKien;

import java.util.Scanner;

public class Swich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap vao gia tri");
		int i = scan.nextInt();
		switch (i) {
		case 1:
			System.out.println("x=1");
			break;
		case 2:
			System.out.println("x=2");
			break;
		case 3:
			System.out.println("x=3");
			break;
		default:
			System.out.println("x>3");

		}
	}

}
