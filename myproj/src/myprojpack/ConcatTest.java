package myprojpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void concattest() {
		MyClass obj = new MyClass();
		String result = obj.concat("hello", "world");
		assertEquals("helloworld" , result);
	}

}
