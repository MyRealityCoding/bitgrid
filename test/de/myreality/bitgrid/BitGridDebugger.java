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

/**
 * Debugger for bitgrid
 * 
 * @author Miguel Gonzalez <miguel-gonzalez@gmx.de>
 * @since 1.0
 * @version 1.0
 */
public class BitGridDebugger {

	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================
	
	private BitGrid grid;

	// ===========================================================
	// Constructors
	// ===========================================================
	
	public BitGridDebugger(BitGrid grid) {
		this.grid = grid;
	}

	// ===========================================================
	// Getters and Setters
	// ===========================================================

	// ===========================================================
	// Methods from Superclass
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	
	public void print() {
		
		System.out.println("GRID DEBUG [" + grid.getWidth() + "x" + grid.getHeight() + "]\n");
		
		for (int y = 0; y < grid.getHeight(); ++y) {
			for (int x = 0; x < grid.getWidth(); ++x) {
				if (grid.get(x, y)) {
					System.out.print("x ");
				} else {
					System.out.print("o ");
				}
			}
			
			System.out.println();
		}
		
		System.out.println("\n");
	}

	// ===========================================================
	// Inner classes
	// ===========================================================
}
