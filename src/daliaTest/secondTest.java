package daliaTest;
import static org.junit.Assert.*;
import org.junit.Test;
import source.Model;

public class secondTest {

	@Test
	public void test() {
		Model m = new Model();
		
	    m.SubTwoNumbers(5.0,2.0);
	    assertTrue(3.0 == m.getCalcValue());
	   
	}

}
