package com.jarvis.call;

public class Tools {

	public static long getSleepDuration() {
		return 10000l;
	}

	public static void goToSleep(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
