package DesignPatters;

public class FactoryEx {
	public static void main(String[] args) {
		PolygonFactory polygonFactory = new PolygonFactory();
		Polygon polygon = null;
		for(int i=3; i<11; i++) {
			polygon = polygonFactory.getPolygon(i);
			System.out.println(polygon.getType());
		}

	}
}

class PolygonFactory {
	// we define a class which will expose a method which will create object for us.
	// Return type will be an interface
	public Polygon getPolygon(int sides) {
		switch (sides) {
		case 3 : return new Triangle();
		case 4 : return new Square();
		case 5 : return new Pentagon();
		case 6 : return new Hexagon();
		case 7 : return new Heptagon();
		case 8 : return new Octagon();
		case 9 : return new Nonagon();
		case 10 : return new Decagon();
		}
		return null;
	}
}

interface Polygon{
	String getType();
}

class Triangle implements Polygon{
	@Override
	public String getType() {
		return "The polygon is a triangle";
	}
}
class Square implements Polygon{
	@Override
	public String getType() {
		return "The polygon is a square";
	}
}
class Pentagon implements Polygon{
	@Override
	public String getType() {
		return "The polygon is a pentagon";
	}
}
class Hexagon implements Polygon{
	@Override
	public String getType() {
		return "The polygon is a hexagon";
	}
}
class Heptagon implements Polygon{
	@Override
	public String getType() {
		return "The polygon is a heptagon";
	}
}
class Octagon implements Polygon{
	@Override
	public String getType() {
		return "The polygon is a octagon";
	}
}
class Nonagon implements Polygon{
	@Override
	public String getType() {
		return "The polygon is a nonagon";
	}
}
class Decagon implements Polygon{
	@Override
	public String getType() {
		return "The polygon is a decagon";
	}
}