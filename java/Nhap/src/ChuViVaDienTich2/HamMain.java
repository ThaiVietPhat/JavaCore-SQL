package ChuViVaDienTich2;

import java.util.Scanner;

public class HamMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Nhap chieu dai va chieu rong hinh chu nhat");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int c=HinhChuNhat.dienTich(x,y);
		System.out.println("chu vi va dien tich hinh chu nhat la" );
		System.out.println(HinhChuNhat.chuVi(x, y));
		System.out.println(c);
		System.out.println("Nhap vao canh  hinh vuong");
		int a=scan.nextInt();
		System.out.println("chu vi va dien tich hinh vuong la");
		System.out.println(HinhVuong.chuVi(a));
		System.out.println(HinhVuong.dienTich(a));
		System.out.println("ket thuc");

	}
}
