package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddStrings {

	@Test
	public void test() {
		jUnitFunction jUnit=new jUnitFunction();
		String result=jUnit.addStrings("Dev","Ops");
		assertEquals("DevOps",result);
	}

}
