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
 * Scans a field for a given value
 * 
 * @author Miguel Gonzalez <miguel-gonzalez@gmx.de>
 * @since 1.0
 * @version 1.0
 */
class FieldHandler {

	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================
	
	private StateHandler handler;

	// ===========================================================
	// Constructors
	// ===========================================================
	
	public FieldHandler() {
		handler = new StateHandler();
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
	
	public boolean set(int x, int y, int[][] field) {
		
		if (!getState(x, y, field)) {
			
			int position = getPosition(x);
			int segmentID = getSegmentID(x);
			
			field[y][segmentID] = handler.set(position, field[y][segmentID]);		
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clear(int x, int y, int[][] field) {
		if (getState(x, y, field)) {
			
			int position = getPosition(x);
			int segmentID = getSegmentID(x);
			
			field[y][segmentID] = handler.clear(position, field[y][segmentID]);		
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean getState(int x, int y, int[][] field) {
		int position = getPosition(x);
		int segmentID = getSegmentID(x);
		
		return handler.get(position, field[y][segmentID]);
	}
	
	private int getSegmentID(int x) {
		return x % 32;
	}
	
	private int getPosition(int x) {
		return (getSegmentID(x) + 1) * 32 - x;
	}

	// ===========================================================
	// Inner classes
	// ===========================================================
}
