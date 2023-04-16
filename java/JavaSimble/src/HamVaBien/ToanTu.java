package HamVaBien;

public class ToanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// toan tu can ban
		int x = 100;
		int y = 3;
		int du = x % y;
		System.out.println(du);
		float f1 = 30.2f;
		float f2 = 21.5f;
		float thuong = f1 / f2;
		System.out.println(thuong);
		// nang kieu du lieu
		byte b = 4;
		short s = 21;
		int i = 23;
		long l = 200L;
		int tong = b + s + i;
		int tong2 = b + s + i + (int) l;
		System.out.println(tong);
		System.out.println(tong2);
		// phep gan
		int t = 10;
		t = t + 5;
		System.out.println(t);

	}

}
