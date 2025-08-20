package com.kham_pha_web.middleware;

import org.springframework.stereotype.Component;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class RequestCounter {
    private final AtomicLong count = new AtomicLong(0);

    public void increment() {
        count.incrementAndGet();
    }

    public long getCount() {
        return count.getAndSet(0); // Lấy giá trị và reset về 0
    }
}