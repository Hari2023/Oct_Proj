package com.Datadriven.prac;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Column {

	public static void Clmn() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Oct31_Proj\\Data_Read.xlsx");

		FileInputStream ifs = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(ifs);

		Sheet s = wb.getSheetAt(0);

		int numberOfRows = s.getPhysicalNumberOfRows();

		for (int j = 0; j < numberOfRows; j++) {

			Row r = s.getRow(j);

			Cell cell = r.getCell(0);

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

		wb.close();
	}

	public static void main(String[] args) throws IOException {
		Clmn();
	}

}
