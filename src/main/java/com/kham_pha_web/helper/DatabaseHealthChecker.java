package com.kham_pha_web.helper;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component

public class DatabaseHealthChecker {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(DatabaseHealthChecker.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void checkConnection() {
        try {
            jdbcTemplate.execute("SELECT 1");
            log.info("✅ DB Postgres connected successfully.");
        } catch (Exception e) {
            log.error("❌ Failed to connect to Postgres DB", e);
        }
    }
}
