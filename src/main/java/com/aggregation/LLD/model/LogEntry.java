package com.aggregation.LLD.model;

import java.time.LocalDateTime;

public class LogEntry {
    private String serviceName;
    private String logLevel;
    private String message;
    private LocalDateTime timestamp;

    public LogEntry(String serviceName, String logLevel, String message) {
        this.serviceName = serviceName;
        this.logLevel = logLevel;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public String getServiceName() { return serviceName; }
    public String getLogLevel() { return logLevel; }
    public String getMessage() { return message; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
