package terrainGenerator;

import java.awt.Image;

public class Grid {

	private int length;
	private int height;
	private int pointCount;
	private double weightMin;
	private double weightMax;
	private boolean white;

	public Grid() {
		length = 0;
		height = 0;
		pointCount = 0;
		weightMin = 0;
		weightMax = 0;
		white = true;
	}

	/**
	 * 
	 * @param length     - x value for grid space.
	 * @param height     - y value for grid space.
	 * @param white      - if true, points are white on black background, else
	 *                   opposite.
	 * @param pointCount - how many points there will be on background.
	 * @param weightMin  - minimum a weight can be. Determines point size.
	 * @param weightMax  - maximum a weight can be. Determines point size.
	 */
	public Grid(int length, int height, boolean white, int pointCount, double weightMin, double weightMax) {
		this.length = length;
		this.height = height;
		this.pointCount = pointCount;
		this.weightMin = weightMin;
		this.weightMax = weightMax;
		this.white = white;
	}

	/**
	 * Generates the terrain after a grid has been created with correct parameters.
	 * The image will not be blurry but instead will show Points at varying
	 * distances depending on the weighted Points. Not entirely sure if Image is
	 * correct return type, but I will do research and return to this method later.
	 * 
	 * @return
	 */
	public Image generateTerrain() {
		return null;
	}

}
