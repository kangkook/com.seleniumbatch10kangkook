package SeleniumDay_11;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListernersTestNG.class)
public class testListeners {

	@Test //success Test
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test //failed
	public void test2() {
		Assert.assertTrue(false);
	}
	
	
	@Test //failed
	public void test3() {
		Assert.assertTrue(false));
	}
	
	
	@Test
	public void test4() {
		Assert.assertTrue(true);
	}
	
}
