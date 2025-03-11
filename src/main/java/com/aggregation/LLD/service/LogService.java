package com.aggregation.LLD.service;

import com.aggregation.LLD.model.LogEntry;
import com.aggregation.LLD.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    @Autowired
    private LogRepository logRepository;

    public void logMessage(String serviceName, String logLevel, String message) {
        LogEntry logEntry = new LogEntry(serviceName, logLevel, message);
        logRepository.save(logEntry);
    }

    public List<LogEntry> getAllLogs() {
        return logRepository.findAll();
    }
}
