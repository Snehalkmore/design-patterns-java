package practice.prototype.excel;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Cell cell1 = new Cell();
		cell1.setCellFont(new CellFont());
		cell1.setCellHeight(1);
		cell1.setCellWidth(1);
		
		Cell cell2 = cell1.clone();
		
		System.out.println(cell1);
		System.out.println(cell1.hashCode());
		System.out.println(cell2);
		System.out.println(cell2.hashCode());
		
	}

}
