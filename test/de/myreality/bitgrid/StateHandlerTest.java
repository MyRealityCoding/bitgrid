/*
 * bitgrid provides a smart state grid
 * Copyright (C) 2013  Miguel Gonzalez
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package de.myreality.bitgrid;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test case for {@see StateHandler}
 * 
 * @author Miguel Gonzalez <miguel-gonzalez@gmx.de>
 * @since 1.0
 * @version 1.0
 */
public class StateHandlerTest {

    StateHandler handler;
    
    @Before
    public void setup() {
    	handler = new StateHandler();
    }

	@Test
	public void testClear() {
		int element = 5; // 00000101
		assertTrue("element has to be 1", handler.clear(2, element) == 1);
		assertTrue("element has to be 4", handler.clear(0, element) == 4);
		element = handler.clear(2, element);
		element = handler.clear(0, element);
		assertTrue("element has to be 0", handler.clear(0, element) == 0);
	}

	@Test
	public void testSet() {
		int element = 0; // 00000000
		
		// Test all bits
		int value = 1;
		for (int i = 0; i < 8; ++i) {
			assertTrue("element has to be " + value, handler.set(i, element) == value);
			value *= 2;
		}
	}
	
	@Test
	public void testGet() {
		int element = 5;
		
		assertTrue("First index has to be true instead of " + handler.get(0, element), handler.get(0, element));
		assertFalse("Second index has to be false instead of " + handler.get(1, element), handler.get(1, element));
		assertTrue("Third index has to be true instead of " + handler.get(2, element), handler.get(2, element));
	}
}
