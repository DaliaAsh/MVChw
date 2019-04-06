package daliaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import source.Model;

public class fifthTest {

	@Test
	public void test() {
		Model m = new Model();
		m.ModTwoNumbers(9.0,3.0);
		assertTrue(0.0 == m.getCalcValue()); 
	}

}
