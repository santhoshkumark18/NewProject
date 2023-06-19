package org.JDBCPractice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
    public static void main(String[] args) {
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("C:\\Projects\\SampleSelenium\\RTM\\aka.html");//template


        ExtentReports reports = new ExtentReports();//actual report

        reports.attachReporter(extentSparkReporter);

        ExtentTest test= reports.createTest("hondanewbikes");

        test.pass("clickupcomingbikes");
        test.fail("searchingfail");

        reports.createTest("Chennaiusercar");
        test.fail("searching");
        test.pass("displaypass");

        reports.flush();//save report
    }
}
