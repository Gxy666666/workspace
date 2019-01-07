package day05;

public class Test01 {
	public static void main(String[] args) {
		try {
			test();
			System.out.println("1...");
		} catch (ArithmeticException e) {
			System.out.println("2...");
		} catch (Exception e) {
			System.out.println("3...");
		} finally {
			System.out.println("end...");
		}
	}

	public static void test() {
		String str = "cc";
		str.compareTo("abc");
	}
}
