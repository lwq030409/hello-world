package org.lyc.test.thread;

import java.util.Calendar;

import org.lyc.test.Demo;

public class WorkerThread extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println(Demo.count.getAndIncrement() + "/" + Calendar.getInstance().getTimeInMillis() + ":" + currentThread().getId());
		
		if (Demo.count.get() >= 50) {
			Demo.service.shutdown();
		}
	}
}
