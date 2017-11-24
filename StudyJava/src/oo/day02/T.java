package oo.day02;

public class T {
	Cell[] cells;

	public T() {
		this(0, 0);
	}

	public T(int row, int col) {
		this.cells = new Cell[4];
		this.cells[0] = new Cell(row, col);
		this.cells[1] = new Cell(row, col + 1);
		this.cells[2] = new Cell(row + 1, col + 1);
		this.cells[3] = new Cell(row, col + 2);

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
