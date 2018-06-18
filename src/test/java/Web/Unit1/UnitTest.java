package Web.Unit1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


import junit.framework.TestCase;

public class UnitTest {
	
	App a1;

	 @Before
	 /*
	 the init() method will be called for each test, such
	 testAdd() as well as testSub()
	 */
	 public void init() {

	 a1 = new App();

	 }

	 @Test
	 public void testConcatenate() {
	      

	        String result = a1.concatenate("one", "two");

	        assertEquals("onetwo", result);

	    }
	 
	
}
