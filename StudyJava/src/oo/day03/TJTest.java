package oo.day03;

public class TJTest {

	public static void main(String[] args) {
		Tetromino t = new T(3, 2);//向上造型
		printWall(t);//后转值
		J j = new J(1, 3);
		printWall(j);//传值的同时自动造型;
	}

	public static void printWall(Tetromino t) {
		Cell[] cells = t.cells;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				// if (cells[0].row==i&&cells[0].col==j
				// ||cells[1].row==i&&cells[1].col==j
				// ||cells[2].row==i&&cells[2].col==j
				// ||cells[3].row==i&&cells[3].col==j) {
				// System.out.print("* ");
				// } else {
				// System.out.print("- ");
				// }
				boolean flag = false;
				for (int k = 0; k < cells.length; k++) {
					if (cells[k].row == i && cells[k].col == j) {
						flag = true;
						break;
					} else {
						flag = false;
					}
				}
				if (flag) {
					System.out.print("* ");
				} else {
					System.out.print("- ");

				}
			}
			System.out.println();
		}
	}

}
