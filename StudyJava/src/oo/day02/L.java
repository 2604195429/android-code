package oo.day02;

public class L {
	Cell[] cells = new Cell[4];

	public L() {
		this(0, 0);
	}

	public L(int row, int col) {
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row + 1, col);
		cells[2] = new Cell(row, col + 1);
		cells[3] = new Cell(row, col + 2);
	}
}
