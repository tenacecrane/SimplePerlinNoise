package terrainGenerator;

public class Point {
	private double x;
	private double y;
	private double weight;

	public Point() {
		x = 0;
		y = 0;
		weight = 0;
	}

	public Point(int x, int y, int weight) {
		this.x = x;
		this.y = y;
		this.weight = weight;
	}

}
