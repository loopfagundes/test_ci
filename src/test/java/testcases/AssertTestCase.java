package testcases;

import org.junit.Assert;
import org.junit.Test;

public class AssertTestCase {
	private String nome = "Luciano";
	private String anosExperiencia = "5";
	
	@Test
	public void test () {
		Assert.assertTrue(nome.equals("Luciano"));
		Assert.assertTrue(anosExperiencia.equals("5"));
		
		Assert.assertEquals("Luciano", nome);
		Assert.assertEquals("5", anosExperiencia);
	}
	

}
