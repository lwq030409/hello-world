package org.lyc.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.lyc.test.thread.WorkerThread;

public class DemoThread extends Thread {

	private int totalCnt = 5;
	
	private ExecutorService fixedThreadPool;
	
	public DemoThread(int totalCnt) {
		super();
		this.totalCnt = totalCnt;
		fixedThreadPool = Executors.newFixedThreadPool(this.totalCnt);
	}


	@Override
	public void run() {
		for (int i = 0; i < totalCnt; i++) {
            fixedThreadPool.submit(new WorkerThread());
        }
	}
	
}
