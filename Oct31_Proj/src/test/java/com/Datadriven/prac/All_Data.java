package com.Datadriven.prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {

	public static void all_Data() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Oct31_Proj\\Data_Read.xlsx");

		FileInputStream ifs = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(ifs);

		Sheet s = wb.getSheetAt(0);

		int all_data = s.getPhysicalNumberOfRows();

		for (int i = 0; i < all_data; i++) {

			Row r = s.getRow(i);

			int numberOfCells = r.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) {

				Cell cell = r.getCell(j);

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

	}

	public static void main(String[] args) throws IOException {
		all_Data();
	}

}
