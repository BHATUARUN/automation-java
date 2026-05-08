package webdriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class assertclass{
	@Test
	public void testassert() {
		assertEquals(10 , 10);
		
		assertTrue(true);
		
		assertFalse(false);
		
		assertNull(null);
		
		assertNotNull("World");
		
		System.out.println("assert is run");
	}
		
	
}