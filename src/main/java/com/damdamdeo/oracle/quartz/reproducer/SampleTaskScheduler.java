package com.damdamdeo.oracle.quartz.reproducer;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
public class SampleTaskScheduler {
    public static AtomicInteger count = new AtomicInteger(0);

    @Scheduled(cron = "*/2 * * * * ?", delay = 1L, delayUnit = TimeUnit.SECONDS, executeWith = Scheduled.QUARTZ)
    void execute() {
        count.incrementAndGet();
    }

    public AtomicInteger getCount() {
        return count;
    }
}
