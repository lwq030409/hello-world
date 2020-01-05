package org.lyc.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
	
	public static AtomicInteger count = new AtomicInteger(1); 
	public static ScheduledExecutorService service;

	public static void main(String[] args) {
		
		service = Executors.newSingleThreadScheduledExecutor();    
        service.scheduleAtFixedRate(new DemoThread(5), 2, 2, TimeUnit.SECONDS);  
	}

}
