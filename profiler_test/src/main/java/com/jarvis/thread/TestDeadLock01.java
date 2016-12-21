package com.jarvis.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestDeadLock01 implements Runnable {
	private static Logger logger = LogManager.getLogger(TestDeadLock01.class
			.getName());

	public int flag = 0;
	static Object o1 = new Object(), o2 = new Object();

	public void run() {

		logger.debug("flag=" + flag);

		if (flag == 1) {
			synchronized (o1) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (o2) {
					logger.debug("Lock o1 first and flag = 1");
				}
			}
		}

		if (flag == 0) {
			synchronized (o2) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (o1) {
					logger.debug("Lock o2 first and flag = 0");
				}
			}

		}
	}

	public static void main(String[] args) {
		TestDeadLock01 lock1 = new TestDeadLock01();
		TestDeadLock01 lock2 = new TestDeadLock01();
		lock1.flag = 1;
		lock2.flag = 0;
		Thread t1 = new Thread(lock1);
		Thread t2 = new Thread(lock2);
		t1.start();
		t2.start();

	}
}
