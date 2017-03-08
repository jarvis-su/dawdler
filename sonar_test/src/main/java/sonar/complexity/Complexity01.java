package sonar.complexity;

public class Complexity01 {

	public static void main(String[] args) {
		hello(100);
	}

	public static void hello(Integer i) {
		if (null == i) {
			doSomething();
		} else if (i % 2 == 0) {
			doSomething1();
		} else {
			doSomething2();
		}
	}

	public static void doSomething() {

	}

	public static void doSomething1() {

	}

	public static void doSomething2() {

	}
}
