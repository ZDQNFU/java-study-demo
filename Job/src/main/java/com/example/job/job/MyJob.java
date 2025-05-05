package com.example.job.job;

import org.quartz.*;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution//不允许并发执行,即上一个任务没有执行完，下一个任务不会执行
public class MyJob implements Job {
    //重写execute方法，context-任务执行的上下文
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //获取JobDetail
        JobDetail jobDetail = context.getJobDetail();
        //输出任务名，任务组，任务类，任务执行时间
        System.out.println("任务名"+jobDetail.getKey().getName());
        System.out.println("任务组"+jobDetail.getKey().getGroup());
        System.out.println("任务类"+jobDetail.getJobClass().getName());
        System.out.println("任务执行时间"+context.getFireTime());
        //记录任务执行次数,但是每次执行都会初始化为0，因为每次JobDetail都是新的
        //可以用@PersistJobDataAfterExecution解决，虽然JobDetail与jobDataMap都是新的，但是jobDataMap是共享的
        JobDataMap jobDataMap = jobDetail.getJobDataMap();
        Integer count = jobDataMap.getInt("count");
        System.out.println("任务执行次数"+count);
        jobDataMap.put("count",++count);

    }
}