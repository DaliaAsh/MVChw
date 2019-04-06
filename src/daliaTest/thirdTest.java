package daliaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import source.Model;

public class thirdTest {

	@Test
	public void test() {
	Model m = new Model();
		
	    m.MulTwoNumbers(5.0,2.0);
	    assertTrue(10.0 == m.getCalcValue());
	}

}
