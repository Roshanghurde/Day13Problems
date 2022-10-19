package Day13problems;

public class maxintstringfloat <T extends Comparable<T>> {
	T a, b, c;

	public maxintstringfloat(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public T maximum() {
		return maxintstringfloat.maximum(a, b, c);
	}

	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		printMax(a, b, c, max);
		return max;
	}

	public static String testMaximum(String a, String b, String c) {
		String max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		printMax(a, b, c, max);
		return max;
	}

	public static <T> void printMax(T a, T b, T c, T max) {
		System.out.printf("max of %s,%s and %s is %s\n", a, b, c, max);
	}

	public static void main(String[] args) {
		Integer aInt = 3, bInt = 4, cInt = 5;
		Float aF1 = 6.6f, bF1 = 8.8f, cF1 = 7.7f;
		String aStr = "pear", bStr = "apple", cStr = "orange";

		maxintstringfloat.testMaximum(aStr, bStr, cStr);
		new maxintstringfloat(aInt, bInt, cInt).maximum();
		new maxintstringfloat(aF1, bF1, cF1).maximum();
		new maxintstringfloat(aStr, bStr, cStr).maximum();

	}

}