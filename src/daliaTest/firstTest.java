package daliaTest;
import static org.junit.Assert.*;
import org.junit.Test;
import source.Model;

public class firstTest {

	@Test
	public void test() {
		Model m = new Model();
		m.addTwoNumbers(10.0,8.0);
		assertTrue(18 == m.getCalcValue()); 
	    m.SubTwoNumbers(5,2);
	    assertTrue(3 == m.getCalcValue());
	    m.MulTwoNumbers(5,5);
	    assertTrue(25 == m.getCalcValue());
	    m.DivTwoNumbers(9,3);
	    assertTrue(3 == m.getCalcValue());
	    m.ModTwoNumbers(9,3);
	    assertTrue(0 == m.getCalcValue());
	    m.SqtNumber(16);
	    assertTrue(4 == m.getCalcValue());
	}

}
