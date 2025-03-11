package com.aggregation.LLD.repository;

import com.aggregation.LLD.model.LogEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LogRepository {
    private final List<LogEntry> logs = new ArrayList<>();

    public void save(LogEntry logEntry) {
        logs.add(logEntry);
    }

    public List<LogEntry> findAll() {
        return logs;
    }
}

