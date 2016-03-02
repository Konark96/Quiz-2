package Question1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void test() {
		System.out.println(Main.updateI(10.0, 10.1, 2, .1));
		assertEquals(Main.updateI(10.0, 10.0, 1, 10), 10.1,.1);
		assertEquals(Main.updateI(10.0, 10.0, 2, .1), 110,.1);
		assertEquals(Main.updateI(10.1, 10.1, 2, .1), 112.211,.001);
	//	assertEquals(Main.updateI(10.0, 12.3, 4, .5), 110,.1);
		

	}
}
