package com.exam;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ExcelEx03 {
    public static void main(String[] args) {
        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(new File("./excel.xls"));
            Sheet sheet = workbook.getSheet(0);

            System.out.println(sheet.getName());
            System.out.println(sheet.getRows());
            System.out.println(sheet.getColumns());

            Cell cell = sheet.getCell(0, 0);
            System.out.println(cell.getContents());
            cell = sheet.getCell(1, 4);
            System.out.println(cell.getContents());

            for (int i = 3; i < sheet.getRows(); i++) {
                Cell cell1 = sheet.getCell(13, i);
                Cell cell2 = sheet.getCell(14, i);
                Cell cell3 = sheet.getCell(15, i);
                System.out.printf("%s %s %s %n", cell1.getContents(), cell2.getContents(), cell3.getContents());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (BiffException e) {
            throw new RuntimeException(e);
        } finally {
            if (workbook != null) {
                workbook.close();
            }
        }
    }
}
