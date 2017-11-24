package oo.day04;

public class Cell {
	int row, col;

	public Cell() {
		this(0);
	}

	public Cell(int n) {
		this(n, n);
	}

	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	String getCellInfo() {
		return row + "," + col;
	}

}
