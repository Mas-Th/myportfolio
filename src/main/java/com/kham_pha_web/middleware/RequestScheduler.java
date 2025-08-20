package com.kham_pha_web.middleware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@EnableScheduling
public class RequestScheduler {
    private static final Logger log = LoggerFactory.getLogger(RequestScheduler.class);

    @Autowired
    private RequestCounter requestCounter;

    // Chạy mỗi 10 phút (600,000 milliseconds)
    @Scheduled(fixedRate = 600000)
    public void logRequestCount() {
        long count = requestCounter.getCount();
        log.info("📊 [Scheduler] Số lượng request trong 10 phút vừa qua: {}", count);
    }
}