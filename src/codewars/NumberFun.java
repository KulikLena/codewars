package codewars;

public class NumberFun {

	public static long findNextSquare(long sq) {
		if (Math.sqrt(sq) % 1 != 0)
			return -1;
		else {
			long i = (long) Math.sqrt(sq);
			return (long) Math.pow(i + 1, 2);
		}

	}

	public static void main(String[] args) {
		System.out.println(findNextSquare(120));
	}
}