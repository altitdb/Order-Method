package br.com.estruturaDados.sort.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.estruturaDados.sort.Create;

public class CreatTest {
	  Create create = new Create();
	@Test
	public void orderlyTest() {
		int [] end = create.orderly(6);
		int[]expected = {1,2,3,4,5,6};
		Assert.assertArrayEquals(expected, end);
	}
	
	@Test
	public void orderReverseTest(){
		int [] end = create.orderReverse(6);
		int[]expected = {6,5,4,3,2,1};
		Assert.assertArrayEquals(expected, end);
	}
}
