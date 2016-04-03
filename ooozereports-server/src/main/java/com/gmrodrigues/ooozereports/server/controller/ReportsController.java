package com.gmrodrigues.ooozereports.server.controller;

import com.gmrodrigues.ooozereports.core.model.ReportModel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ReportsController
{
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/reports")
    public ReportModel listReports(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        return new ReportModel(counter.incrementAndGet(),
                String.format(template, name));
    }
}
