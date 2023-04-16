package HamVaBien;

import java.util.Scanner;

public class CachSuDungHamVaBien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chuVi(10);
		Scanner scan = new Scanner(System.in);
		float thuThoi = thuThoi(scan.nextFloat(), 50);
		System.out.println(thuThoi);
	}

	public static void chuVi(int i) {
		i = i + 1;
		System.out.println(i);
	}

	public static float thuThoi(float a, float b) {
		float f = a / b;
		return f;
	}
}