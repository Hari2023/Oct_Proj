package com.Datadriven.prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Row {

	public static void particular_Row() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Oct31_Proj\\Data_Read.xlsx");

		FileInputStream ifs = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(ifs);

		Sheet s = wb.getSheetAt(0);

		Row row = s.getRow(1);

		//int partirow = row.getPhysicalNumberOfCells();

		for (int i = 0; i < row.getLastCellNum(); i++) {

			Cell cell = row.getCell(i);

			CellType type = cell.getCellType();

			if (type.equals(CellType.STRING)) {

				String value = cell.getStringCellValue();

				System.out.println(value);

			} else if (type.equals(CellType.NUMERIC)) {
				double d = cell.getNumericCellValue();

				int a = (int) d;

				String value = String.valueOf(a);

				System.out.println(value);

			}
		}

	}

	public static void main(String[] args) throws IOException {
		
		particular_Row();
		
	}

}
