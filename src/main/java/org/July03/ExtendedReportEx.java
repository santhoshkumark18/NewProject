package org.July03;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendedReportEx {
    public static void main(String[] args) {
        //Template
        ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Projects\\SampleSelenium\\src\\main\\java\\org\\July03\\report.hmtl");
        //Html content
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(reporter);//attaching actual content into template
        ExtentTest test = reports.createTest("open url");
        test.log(Status.FAIL,"youtube opened successfully");
        test.log(Status.FAIL,"googledrive opened successfully");
        test.log(Status.FAIL,"facebook opened successfully");
        test.addScreenCaptureFromPath("img.png");
        //test.
        //save repot
        reports.flush();
    }
}
