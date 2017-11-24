package oo.day01;

public class CellTest {
	public static void main(String[] args) {
		Cell c = new Cell();
		c.row = 2;
		c.col = 5;
		printWall(c);
		c.drop();
		System.out.println("下落后的");
		printWall(c);
		c.moveLeft(1);
		System.out.println("左移的");
		printWall(c);
	}

	public static void printWall(Cell c) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (c.row == i && c.col == j) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}
