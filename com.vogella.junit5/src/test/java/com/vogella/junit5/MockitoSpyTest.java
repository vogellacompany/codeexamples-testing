package com.vogella.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MockitoSpyTest {

	@Test
	public void testLinkedListSpyCorrect() {
	    // Lets mock a LinkedList
	    List<String> list = new LinkedList<>();
	    List<String> spy = spy(list);
	    
	    // this would not work as delegate it called so spy.get(0)
	    // throws IndexOutOfBoundsException (list is still empty)
	    // when(spy.get(0)).thenReturn("foo");
	    
	    // you have to use doReturn() for stubbing
	    doReturn("foo").when(spy).get(0);
	    
	    assertEquals("foo", spy.get(0));
	}
	
}
