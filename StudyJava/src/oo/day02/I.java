package oo.day02;

public class I {
	Cell[] cells = new Cell[4];

	public I() {
		this(0, 0);
	}

	public I(int row, int col) {
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row + 1, col);
		cells[2] = new Cell(row + 2, col);
		cells[3] = new Cell(row + 3, col);
	}
}
