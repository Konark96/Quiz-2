package Question1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTests {
	Main m;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		m = new Main();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("trbhue", m.r(), true);
		assertEquals("trbhue", m.r(), true);
		assertEquals("trbhue", m.r(), true);
		assertEquals("trbhue", m.r(), true);

	}
}
