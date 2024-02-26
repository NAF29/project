package testListner;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListner {
		@Test
		public void testMethod1() {
			System.out.println("this is first method...");
			Assert.assertTrue(true);
		}

		@Test
		public void testMethod2() {
			System.out.println(" this is second method...");
			Assert.assertTrue(true);
		}
		@Test
		public void testMethod3() {
			System.out.println("this is third method..");
			Assert.assertTrue(false);
		}
	}


