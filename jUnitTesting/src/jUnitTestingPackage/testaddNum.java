package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddNum {

	@Test
	public void test() {
		jUnitFunction jUnit=new jUnitFunction();
		int result=jUnit.addNum(10, 30);
		assertEquals(40,result);
	}
}
