package CauDieuKien;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dung if else
		Scanner scan = new Scanner(System.in);

		System.out.println("Vui long nhap vao gia tri");
		int i = scan.nextInt();
		if (i > 5) {

			System.out.println("gia tri cua x >5");
		} else {
			System.out.println("Gia tri cua i nho hon 5");
		}
		System.out.println("Ket thuc");

	}

}
