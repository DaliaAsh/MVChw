package daliaTest;
import static org.junit.Assert.*;
import org.junit.Test;
import source.Model;

public class firstTest {

	@Test
	public void test() {
		Model m = new Model();
		m.addTwoNumbers(10.0,8.0);
		assertTrue(18.0 == m.getCalcValue()); 
	    
	}

}
