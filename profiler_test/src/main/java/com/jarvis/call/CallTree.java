package com.jarvis.call;

public class CallTree {

	public static void main(String[] args) {
		System.out.println("Before sleep ");

		long duration = getSleepDuration();
		goToSleep(duration);
		System.out.println("After sleep ");
	}


	public static long getSleepDuration() {
		return 20000l;
	}

	public static void goToSleep(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
