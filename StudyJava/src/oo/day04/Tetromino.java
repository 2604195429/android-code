package oo.day04;

public class Tetromino {
	Cell[] cells;

	public Tetromino() {
		cells = new Cell[4];
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
			cells[i].col++;
		}
	}

	void printInfo() {
		for (int i = 0; i < cells.length; i++) {
			System.out.println(cells[i].getCellInfo());
		}
	}
}
