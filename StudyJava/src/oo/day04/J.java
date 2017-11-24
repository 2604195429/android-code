package oo.day04;

public class J extends Tetromino{

	public J() {
		this(0, 0);
	}

	public J(int row, int col) {
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row, col + 1);
		cells[2] = new Cell(row, col + 2);
		cells[3] = new Cell(row + 1, col + 2);
	}
	@Override
	void printInfo() {
		System.out.println("Œ“ «J");
		super.printInfo();
	}
}
