package CauDieuKien;

import java.util.Scanner;

public class ToanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao gia tri");
		float f = scan.nextFloat();
		if (f > 5) {
			f = f + 5;
			System.out.println(f);
		} else if (f == 5) {
			System.out.println(f + 1);
		} else {
			System.out.println(f - 5);
		}

	}

}
	