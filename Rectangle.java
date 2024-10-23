
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
		if (!(a.x == b.x && a.y == b.y && A.x * B.x + A.y * B.y == 0))
			throw new RecException("Not a rectangle");
		else
			this.A = A;
			this.B = B;
			this.C = C;
			this.D = D;
	}

	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}

	public boolean isSquare() {
		double rightangle = A.x * B.x + A.y * B.y;
		if (A.distance(B) == B.distance(C) && rightangle == 0)
			return true;
		else
			return false;
	}

}
