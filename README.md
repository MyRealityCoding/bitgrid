![Bitgrid logo](logo.png)

Smart bit-based system to store boolean states in a fixed grid.

### Getting started

Using bitgrid it pretty simple:

```java
// Create a new grid of dimensions 1200x1200
BitGrid grid = new BitGrid(1200, 1200);

// Let's set a value
grid.set(400,400);

// Let's check a value
boolean isSet = grid.get(200,210);
boolean isSet2 = grid.get(400,400); // will return true
```
You can use this system to provide simple collision detection for tile based maps.

### Development

If you have further questions, mail to [Miguel Gonzalez](mailto:miguel-gonzalez@gmx.de) or [visit his website](http://my-reality.de).
