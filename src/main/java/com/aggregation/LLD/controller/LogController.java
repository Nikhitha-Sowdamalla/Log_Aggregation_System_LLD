package com.aggregation.LLD.controller;

import com.aggregation.LLD.model.LogEntry;
import com.aggregation.LLD.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogController {
    @Autowired
    private LogService logService;

    @PostMapping("/add")
    public String addLog(@RequestParam String serviceName, @RequestParam String logLevel, @RequestParam String message) {
        logService.logMessage(serviceName, logLevel, message);
        return "Log added successfully!";
    }

    @GetMapping("/all")
    public List<LogEntry> getAllLogs() {
        return logService.getAllLogs();
    }
}
