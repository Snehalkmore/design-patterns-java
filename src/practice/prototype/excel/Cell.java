package practice.prototype.excel;

public class Cell implements Cloneable {
	private int cellHeight;
	private int cellWidth;
	private CellFont cellFont;

	/*
	 * //shallow copy
	 *
	 * @Override protected Cell clone() throws CloneNotSupportedException { 
	 * return (Cell)super.clone();
	 *  }
	 */
	
	//deep copy
	@Override
	protected Cell clone() throws CloneNotSupportedException { //deep copy
		Cell cell = (Cell)super.clone();
		cell.setCellFont(new CellFont());//new object deep copy
		return cell;
	}
	
	public Cell() {
	}
	
	//copy constructor
	Cell(Cell cell){
		this.cellHeight = cell.cellHeight;
		this.cellWidth = cell.cellWidth;
		this.cellFont = new CellFont();
	}

	public int getCellHeight() {
		return cellHeight;
	}

	public void setCellHeight(int cellHeight) {
		this.cellHeight = cellHeight;
	}

	public int getCellWidth() {
		return cellWidth;
	}

	public void setCellWidth(int cellWidth) {
		this.cellWidth = cellWidth;
	}

	public CellFont getCellFont() {
		return cellFont;
	}

	public void setCellFont(CellFont cellFont) {
		this.cellFont = cellFont;
	}

	@Override
	public String toString() {
		return "Cell [cellHeight=" + cellHeight + ", cellWidth=" + cellWidth + ", cellFont=" + cellFont + "]";
	}
	
	

}
