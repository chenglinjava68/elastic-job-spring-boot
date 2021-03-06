package com.purgeteam.elasticjob.starter.demo.config;

import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.purgeteam.elasticjob.starter.demo.scheduled.PropertiesSimpleJob;
import com.purgeteam.elasticjob.starter.factory.SpringJobSchedulerFactory;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * @author purgeyao
 * @since 1.0
 */
//@Configuration
public class PropertiesSimpleJobConfig {

    @Resource
    private SpringJobSchedulerFactory springJobSchedulerFactory;

    @Bean(initMethod = "init")
    public JobScheduler propertiesSimpleJobScheduler(final PropertiesSimpleJob job) {
        return springJobSchedulerFactory.getSpringJobScheduler(job,"PropertiesSimpleJob", true);
    }

}
