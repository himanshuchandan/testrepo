package myprojpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void addtest() {
		MyClass obj = new MyClass();
		int result = obj.add(100, 200);
		assertEquals(300 , result);
	}

}
