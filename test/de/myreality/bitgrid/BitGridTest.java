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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


/**
 * Test case for {@link BitGrid}
 * 
 * @author Miguel Gonzalez <miguel-gonzalez@gmx.de>
 * @since 1.0
 * @version 1.0
 */
public class BitGridTest {

	BitGrid grid;
	
	BitGridDebugger debugger;
	
	@Before
	public void setup() {
		grid = new BitGrid(10, 10);
		
		debugger = new BitGridDebugger(grid);
	}
	
	@Test
	public void testSet() {
		grid.set(4, 5);
		assertTrue("Grid has to be true at 4|5", grid.get(4, 5));
		assertFalse("Grid has to be false at -1,-1", grid.get(-1, -1));
		assertFalse("Grid has to be false at 10,10", grid.get(10, 10));
		debugger.print();
	}
	
	@Test
	public void testClear() {
		grid.set(4, 5);
		assertTrue("Grid has to be true at 4|5", grid.get(4, 5));
		grid.clear(4, 5);
		assertFalse("Grid has to be false at 4|5", grid.get(4, 5));
	}
}
