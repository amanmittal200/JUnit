import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
		add jUnit=new add();
		String result=jUnit.addString("as", "we");
		assertEquals("aswe",result);
	}

}
