package profiler.jvm.zzm.chapter7;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(Sub.B);
	}

	static class Parent {
		public static int A = 1;

		static {
			A = 2;
		}
	}

	static class Sub extends Parent {
		public static int B = A;
	}
}

