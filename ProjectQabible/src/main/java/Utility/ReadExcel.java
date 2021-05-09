package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public XSSFSheet sh;
	public ReadExcel() throws IOException  {
		FileInputStream f=new FileInputStream("C:\\Users\\HP\\Desktop\\ExcelRead1.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
	}
public String readData(int i, int j)
{
	Row r=sh.getRow(i);
	Cell c=r.getCell(j);
	int cellType=c.getCellType();
	switch(cellType)
	{
	case Cell.CELL_TYPE_NUMERIC:
	{
		double a=c.getNumericCellValue();
		return String.valueOf(a);
	}
	case Cell.CELL_TYPE_STRING:
	{
		return c.getStringCellValue();
	}
	}
	return null;
}


}
