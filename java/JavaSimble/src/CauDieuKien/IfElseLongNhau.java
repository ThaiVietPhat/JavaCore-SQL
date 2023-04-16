package CauDieuKien;

import java.util.Scanner;

public class IfElseLongNhau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao gia tri :");
		float i = scan.nextFloat();
		if (i > 5) {
			System.out.println("Gia tri da nhap lon hon 5");

		} else if (i == 5) {
			System.out.println("Gia tri da nhap bang 5");
		} else {
			System.out.println("Gia tri da nhapv nho hon 5");
		}

	}

}
