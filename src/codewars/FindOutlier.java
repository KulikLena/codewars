package codewars;

public class FindOutlier {

	static boolean isEven(int[] integers) {
		boolean even = false;
		int count = 0;
		for (int j = 0; j < 3; j++) {
			if (integers[j] % 2 == 0)
				count++;
		}
		switch (count) {
		case 0:
		case 1:
			even = false;
		case 2:
		case 3:
			even = true;
		}
		if (even)
			return true;
		else
			return false;

	}

	static int find(int[] integers) {
		int a = 0;
		if (isEven(integers)) {
			for (int i = 0; i < integers.length; i++) {
				if (integers[i] % 2 == 1)
					a = integers[i];
			}
		} else {
			for (int i = 0; i < integers.length; i++) {
				if (integers[i] % 2 == 0)
					a = integers[i];
			}
		}
		return a;

	}

	public static void main(String[] args) {
		int[] exampleTest1 = {2,6,8,-10,3}; 
		System.out.println(find(exampleTest1));

	}

}
