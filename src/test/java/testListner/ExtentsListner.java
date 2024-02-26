package testListner;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class ExtentsListner implements ITestListener {

	public void onStart(ITestContext Results) {
		System.out.println("on start method invoked...");
	}

	public void onFinish(ITestContext Results) {
		System.out.println("On FInishied Method Invoked");
	}

	public void onTestStart(ITestContext Results) {
		System.out.println("On Test Start method..." + Results.getName());
	}

	public void onTestFinish(ITestContext Results) {
		System.out.println("On Test Finish method..." + Results.getName());
	}

	public void onTestFailure(ITestContext Results) {
		System.out.println("On tets Failed method..." + Results.getName());
	}

	public void onTestPass(ITestContext Results) {
		System.out.println("On tets passed method..." + Results.getName());
	}

}