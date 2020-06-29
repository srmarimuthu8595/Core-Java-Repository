package com.app.cpfb.springbatch;

import java.util.List;

import org.joda.time.DateTime;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class CpfbJobListener implements JobExecutionListener{
	
	private DateTime startTime, stopTime;

	public void afterJob(JobExecution arg0) {
		startTime = new DateTime();
		System.out.println("ExamResult Job starts at :"+startTime);
	}

	public void beforeJob(JobExecution jobExecution) {
		stopTime = new DateTime();
		System.out.println("ExamResult Job stops at :"+stopTime);
		System.out.println("Total time take in millis :"+DateTime.now());
		
		if(jobExecution.getStatus() == BatchStatus.COMPLETED){
			System.out.println("ExamResult job completed successfully");
			//Here you can perform some other business logic like cleanup
		}else if(jobExecution.getStatus() == BatchStatus.FAILED){
			System.out.println("ExamResult job failed with following exceptions ");
			List<Throwable> exceptionList = jobExecution.getAllFailureExceptions();
			for(Throwable th : exceptionList){
				System.err.println("exception :" +th.getLocalizedMessage());
			}
		}
		
	}
	/*private long getTimeInMillis(DateTime start, DateTime stop){
		return stop.getMillis() - start.getMillis();
	}*/

}
