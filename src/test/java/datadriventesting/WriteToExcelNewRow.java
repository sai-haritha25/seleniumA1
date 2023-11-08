package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteToExcelNewRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/test/resources/test data.xlsx");
		Workbook wb =  WorkbookFactory.create(fis);
      Sheet sh = wb.getSheet("Sheet1");
      Row r = sh.createRow(4);
      Cell c = r.createCell(0);
      c.setCellValue("user2");
      Cell c1 = r.createCell(1);
      c1.setCellValue("user3");
      
      FileOutputStream fos = new FileOutputStream("./src/test/resources/test data.xlsx");
      wb.write(fos);
      wb.close();
      
      
	}

}
