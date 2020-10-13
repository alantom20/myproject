package com.tom.student;

import com.tom.FinanceReport;
import com.tom.HealthReport;
import com.tom.Report;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        List<Report> reports = new ArrayList<>();
        Report health = new HealthReport();
        Report finance = new FinanceReport();
        reports.add(health);
        reports.add(finance);
        for (Report report : reports) {
            report.print();
            report.load();
        }
        
    }
}
