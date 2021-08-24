package Items;

public class Position {
	
	/**
	 * Die x Koordinate der Zelle
	 * @param x
	 */
	private int x;
	
	/**
	 * Die y Koordinate der Zelle
	 * @param y
	 */
	private int y;
	
	/**
	 * Erstellt eine Position mit einer x und einer y Koordinate
	 * @param x
	 * @param y
	 */
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Gibt den x Wert zurueck
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Legt den neuen x Wert fest
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Gibt den y Wert zurueck
	 * @return y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Legt den neuen y Wert fest
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	

}
