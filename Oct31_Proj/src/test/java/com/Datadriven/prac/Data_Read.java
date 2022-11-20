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

public class Data_Read {

	public static void particular_Data() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Oct31_Proj\\Data_Read.xlsx");

		FileInputStream ifs = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(ifs);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(2);

		Cell c = r.getCell(1);

		CellType type = c.getCellType();

		if (type.equals(CellType.NUMERIC)) {

			double d = c.getNumericCellValue();

			int a = (int) d;

			String value = String.valueOf(a);

			System.out.println(value);

		} else if (type.equals(CellType.STRING)) {

			String value = c.getStringCellValue();

			System.out.println(value);

		}

		wb.close();

	}

	public static void main(String[] args) throws IOException {

		particular_Data();

	}

}
