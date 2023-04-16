import java.util.Scanner;

public class MinMax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap vao daay 3 so nguyen a b c");
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int min= min(a,b,c);
		int max=max(a,b,c);
		System.out.println("Max="+max);
		System.out.println("Min="+min);
	}
	public static int max(int a, int b, int c) {
		int max=(a<b)?b:a;
		max=(max<c)?c:max;
		return max;
	}
	public static int min(int a, int b, int c) {
		int min=(a<b)?a:b;
		min=(min<c)?min:c;
		return min;
	}

}
