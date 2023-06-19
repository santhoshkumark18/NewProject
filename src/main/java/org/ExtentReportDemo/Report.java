package org.ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
    ExtentReports reports;
    ExtentTest test;

        //sample html body template
        public void startReport() {
            ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("./Extest.html");
            //actual report
            reports = new ExtentReports();
            reports.attachReporter(extentSparkReporter);
        }
        public void TestCase(String report) {
        test = reports.createTest(report);
        }
        public void reportPass(String report) {
            test.log(Status.PASS,report);
        }
    public void reprotFail(String report) {
        test.log(Status.FAIL,report);
    }
    public void saveReport() {
        reports.flush();
    }

}
