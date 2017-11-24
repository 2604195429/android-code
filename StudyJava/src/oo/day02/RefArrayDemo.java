package oo.day02;

public class RefArrayDemo {

	public static void main(String[] args) {
		Cell[] cells = new Cell[4];
		cells[0] = new Cell(3, 2);
		cells[1] = new Cell(3, 4);
		cells[2] = new Cell(2, 3);
		cells[4] = new Cell();

		Cell[] cells1 = { new Cell(2, 3), new Cell(), new Cell() };
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[3] = new int[4];
		arr[1][0] = 100;
		int[][] arr1 = new int[3][4];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr[i][j] = 100;
			}
		}
	}

}
