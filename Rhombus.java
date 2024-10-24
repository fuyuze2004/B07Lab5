package lab4;

class RhombusException extends Exception {
	public RhombusException(String message) {
		super(message);
	}
}

public class Rhombus {
	Point a;
	Point b;
	Point c;
	Point d;
 	public Rhombus(Point a, Point b, Point c, Point d) {
 		this.a = a;
 		this.b = b;
 		this.c = c;
 		this.d = d;
 	}

 	public boolean isRhombus() {
 		double dab = a.distance(b);
 		double dbc = b.distance(c);
 		double dcd = c.distance(d);
 		double dda = d.distance(a);
 		return (dab == dbc) && (dbc == dcd) && (dcd == dda);
 	}

 	public double perimeter() throws RhombusException {
 		if (this.isRhombus()) {
 			return 4 * a.distance(b);
 		}
 		throw new RhombusException("The given rhombus is not a real rhombus, play more Genshin!");
 	}
}
