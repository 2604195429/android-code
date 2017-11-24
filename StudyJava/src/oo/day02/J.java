package oo.day02;

public class J {
	Cell[] cells = new Cell[4];

	public J() {
		this(0, 0);
	}

	public J(int row, int col) {
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row, col + 1);
		cells[2] = new Cell(row, col + 2);
		cells[3] = new Cell(row + 1, col + 2);
	}

	void drop() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].row++;
		}
	}

	void moveLeft() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].col--;
		}
	}

	void moveRight() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].row++;
		}
	}
}
