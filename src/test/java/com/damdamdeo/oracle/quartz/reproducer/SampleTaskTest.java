package com.damdamdeo.oracle.quartz.reproducer;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.awaitility.Awaitility.await;

@QuarkusTest
public class SampleTaskTest {

    @Inject
    SampleTaskScheduler sampleTaskScheduler;

    @Test
    void shouldCount() {
        await().until(() -> sampleTaskScheduler.getCount().intValue() > 0);
    }
}
