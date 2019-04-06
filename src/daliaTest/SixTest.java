package daliaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import source.Model;

public class SixTest {

	@Test
	public void test() {
		Model m = new Model();
		m.SqtNumber(9.0);
		assertTrue(3.0 == m.getCalcValue()); 
	}

}
