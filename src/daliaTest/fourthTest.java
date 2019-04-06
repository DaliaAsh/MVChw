package daliaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import source.Model;

public class fourthTest {

	@Test
	public void test() {
	Model m = new Model();
		
	    m.DivTwoNumbers(16.0,4.0);
	    assertTrue(4.0 == m.getCalcValue());
	}

}
