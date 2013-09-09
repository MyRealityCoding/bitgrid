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
	
	private FieldHandler handler;

	// ===========================================================
	// Constructors
	// ===========================================================
	
	public BitGrid(int width, int height) {
		this.width = width;
		this.height = height;
		handler = new FieldHandler(this);
		clear();
	}

	// ===========================================================
	// Getters and Setters
	// ===========================================================
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	// ===========================================================
	// Methods from Superclass
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	
	public boolean set(int x, int y) {
		handler.set(x, y, field);
		return true;
	}
	
	public boolean clear(int x, int y) {
		return handler.clear(x, y, field);
	}
	
	public boolean get(int x, int y) {
		return handler.getState(x, y, field);
	}
	
	public void clear() {
		FieldFactory factory = new SimpleFieldFactory();
		this.field = factory.create(width, height);
	}


	// ===========================================================
	// Inner classes
	// ===========================================================
}
