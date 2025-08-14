package com.qa.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromXL {

	private static FileInputStream fis;
	private static Workbook workbook;
	public static void main(String[] args) throws IOException {
		readDataFromXL("C:\\Users\\satyannarayana\\Documents\\TestData.xlsx", "TestData");
	}

	public static void readDataFromXL(String filepath, String sheetname) throws IOException {
		try {
			fis = new FileInputStream(filepath);
			workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet(sheetname);

			int rowsCount = sheet.getPhysicalNumberOfRows();
			int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

			for (int i = 1; i < rowsCount; i++) {
				for (int j = 0; j < cellCount; j++) {
					Cell cell = sheet.getRow(i).getCell(j);
					String cellData = getCellValue(cell);
					System.out.print(cellData + " | ");
				}
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (workbook != null) {
					workbook.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static String getCellValue(Cell cell) {
		if (cell == null) {
			return "";
		}
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				return cell.getDateCellValue().toString();
			} else {
				return String.valueOf(cell.getNumericCellValue());
			}
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());

		case FORMULA:
			return String.valueOf(cell.getCellFormula());
		case BLANK:
			return "";
		default:
			return "Unsupported Cell Type";
		}
	}
}
