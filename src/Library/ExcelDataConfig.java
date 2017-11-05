package Library;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelDataConfig(String ExcelPath)
	{
		try {
			File src=new File(ExcelPath);
			FileInputStream fis=new FileInputStream(src);
			 wb=new XSSFWorkbook(fis);
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
	}

	public String GetData(int SheetNo,int Row,int columnNo)
	{
		sheet1=wb.getSheetAt(0);
		String Data=sheet1.getRow(Row).getCell(columnNo).getStringCellValue();
		return Data;
		
	}
	
	public int getRowCount(int sheetIndex)
	{
	int row=wb.getSheetAt(sheetIndex).getLastRowNum();
	row=row+1;
	return row;
		
	}
	

}
