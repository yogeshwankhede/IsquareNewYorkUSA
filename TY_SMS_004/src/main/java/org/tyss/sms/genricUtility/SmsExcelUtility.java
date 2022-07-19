package org.tyss.sms.genricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.util.Properties;

public class SmsExcelUtility {

	private Workbook workbook;
	/**
	 *  This method is used to fetch data from excel
	 * @param excelPath
	 * @param sheetName
	 */


	public void initExcelFile(String excelPath) {
		FileInputStream fisExcel=null;
		try {
			fisExcel= new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			workbook=WorkbookFactory.create(fisExcel);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}


	}
	/**
	 * This method is used to retrive from property file
	 */
	public String getDataFromProprty(String key) {
		return Properties.getPropertyValue(key);
	}

	/**
	 * This method is used to fetch data from excel
	 * @param rowNumber
	 * @param cellNumber
	 * @param sheetName
	 * @return 
	 */


	public String getDataFromExcel(int rowNumber, int cellNumber, String sheetName) {
		Sheet sheet = workbook.getSheet(sheetName);
		return new DataFormatter().formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
	}


	/**
	 * This Method is to write data to excel
	 */
	public void setDataToExcel() {
		FileOutputStream fos = null ;
		try {
			fos = new FileOutputStream(IConnect.SMSEXCELPATH);//Add excel path here
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	/**
	 * This method is to fetch mutiple data from excel row 
	 * @param cellNum
	 * @param sheetName
	 * @return
	 */
	
	public ArrayList<String> getMultipleDataFromExcelRow(int cellNum, String sheetName) {
		 ArrayList<String> list = new ArrayList<String>();
		Sheet sheet = workbook.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum();

		for(int i=1;i<=rowcount;i++) {
			String data = new DataFormatter().formatCellValue(sheet.getRow(i).getCell(cellNum));
			list.add(data);
		}
		return list;
	}
	
	
	
	public ArrayList<String> getMultipleDataFromExcelCell(int rowNum, String sheetName) {
		 ArrayList<String> list = new ArrayList<String>();
		Sheet sheet = workbook.getSheet(sheetName);
		int cellcount = sheet.getRow(rowNum).getLastCellNum();
		for(int i=1;i<=cellcount;i++) {
			String data = new DataFormatter().formatCellValue(sheet.getRow(rowNum).getCell(i));
			list.add(data);
		}
		return list;
	}
	public int getCellData(String sheetName, int rowNum) {
		int data = workbook.getSheet(sheetName).getRow(rowNum).getLastCellNum();
		return data;
		
	}

	/**
	 * This method is to close connection
	 */

	public void closeWorkbook() {
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}




