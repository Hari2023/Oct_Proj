package com.Datadriven.prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static Logger log = Logger.getLogger(Write_Data.class);

	public static void main(String[] args) throws IOException {

		BasicConfigurator.configure();

		File f = new File("C:\\Users\\ELCOT\\Desktop\\Data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("Data1").createRow(0).createCell(0).setCellValue("Name");

		wb.getSheet("Data1").getRow(0).createCell(1).setCellValue("Password");

		wb.getSheet("Data1").createRow(1).createCell(0).setCellValue("Hari");

		wb.getSheet("Data1").getRow(1).createCell(1).setCellValue("1234");

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		wb.close();

		log.info("Write the Data Successfully");

	}

}