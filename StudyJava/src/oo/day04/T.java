package oo.day04;

public class T extends Tetromino {
//	Cell cells=new Cell();
	public T() {
		this(0, 0);
	}

	
	public T(int row, int col) {
		super();//调用父类的无参构造
		super.cells[0] = new Cell(row, col);
		cells[1] = new Cell(row, col + 1);
		cells[2] = new Cell(row + 1, col + 1);
		cells[3] = new Cell(row, col + 2);

	}
	@Override
	void printInfo() {
		System.out.println("我是T");
		super.printInfo();
		
	}

}
