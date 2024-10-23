
public class RecException extends Exception {
	String message;

		public RecException(String message) {
		this.message = message;
	}
}

public class Rectangle {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Rectangle(Point A, Point B, Point C, Point D) throws RecException{
		Point a = new Point(A.x-B.x, A.y-B.y);
		Point b = new Point(C.x-D.x, C.y-D.y);
		Point c = new Point(B.x-C.x, B.y-C.y);
		Point d = new Point(A.x-C.x, A.y-C.y)
		double rightangle1 = a.x*c.x + a.y*c.y;
		double rightangle2 = a.x*d.x + a.y*d.y;
		if (a.x == b.x && a.y == b.y && (rightangle1 == 0 || rightangle2 == 0))
			this.A = A;
			this.B = B;
			this.C = C;
			this.D = D;
		else
			throw new RecException("Not a rectangle");
	}

	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}

	public boolean isSquare() {
		if (A.distance(B) == B.distance(C))
			return true;
		else
			return false;
	}

}
