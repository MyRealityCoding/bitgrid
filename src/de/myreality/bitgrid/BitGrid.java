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
 * Main class which provides a basic grid
 * 
 * @author Miguel Gonzalez <miguel-gonzalez@gmx.de>
 * @since 1.0
 * @version 1.0
 */
public class BitGrid {

	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================
	
	private int[][] field;
	
	private int width, height;

	// ===========================================================
	// Constructors
	// ===========================================================
	
	public BitGrid(int width, int height) {
		this.width = width;
		this.height = height;
		clear();
	}

	// ===========================================================
	// Getters and Setters
	// ===========================================================
	
	public int getWidth() {
		return 0;
	}
	
	public int getHeight() {
		return 0;
	}

	// ===========================================================
	// Methods from Superclass
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	
	public boolean set(int x, int y) {
		return false;
	}
	
	public boolean clear(int x, int y) {
		return false;
	}
	
	public boolean get(int x, int y) {
		return false;
	}
	
	public void clear() {
		field = new int[height][];
	}


	// ===========================================================
	// Inner classes
	// ===========================================================
}
