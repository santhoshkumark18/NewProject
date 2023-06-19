package org.ExtendReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
    public static void main(String[] args) {
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("./report1.html");
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(extentSparkReporter);
        ExtentTest test = reports.createTest("name of the test case");
        test.log(Status.PASS,"pass the test");
        test.log(Status.PASS,"pass the test");
        test.log(Status.FAIL,"pass the test", MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());
        reports.createTest("second test");
        reports.flush();
    }
}
