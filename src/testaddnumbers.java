import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		add jUnit=new add();
		int result=jUnit.addNumbers(100,12);
		assertEquals(112,result);
			}

}
