package oo.day03;

public class I extends Tetromino{

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
