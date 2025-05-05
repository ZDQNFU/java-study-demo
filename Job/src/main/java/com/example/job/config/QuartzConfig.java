package com.example.job.config;

import com.example.job.job.MyJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    //创建JobDetail,其中有jobDataMap，用来存放共享数据
    @Bean
    public JobDetail myJobDetail() {
        return JobBuilder
                .newJob(MyJob.class)//基本
                .withIdentity("myJob","group1")//唯一标识
                .storeDurably()//持久化
                .usingJobData("count",0)//共享数据初始化为0
                .build();//基本
    }

    //Trigger
    @Bean
    public Trigger myTrigger() {
        return TriggerBuilder
                .newTrigger()//基本
                .forJob(myJobDetail())//关联JobDetail
                .withIdentity("Trigger1","group1")//标识
                .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))//Cron表达式，每5秒执行一次
                .build();
    }

}
