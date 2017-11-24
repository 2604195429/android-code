package oo.day03;

public class O extends Tetromino{
  
	public O() {
		this(0, 0);
	}

	public O(int row, int col) {
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row + 1, col);
		cells[2] = new Cell(row, col + 1);
		cells[3] = new Cell(row + 1, col + 1);
	}
}
