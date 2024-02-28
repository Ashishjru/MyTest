//package Excel_Concept;
//
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Comparison_Sheet {
//    public static void main(String[] args) {
//
//
//    Map<String, String> hashMap1 = new HashMap<>();
//        hashMap1.put("internet", "Value1A");
//        hashMap1.put("campaign", "Value1B");
//        hashMap1.put("effective date", "Value1C");
//        hashMap1.put("end date", "Value1D");
//
//    Map<String, String> hashMap2 = new HashMap<>();
//        hashMap2.put("internet", "Value2A");
//        hashMap2.put("campaign", "Value2B");
//        hashMap2.put("effective date", "Value2C");
//        hashMap2.put("end date", "Value2D");
//
//    // Creating Excel workbook and sheet
//        try (Workbook workbook = new XSSFWorkbook()) {
//        Sheet sheet = workbook.createSheet("Comparison");
//
//        // Creating header row
//        Row headerRow = sheet.createRow(0);
//        headerRow.createCell(0).setCellValue("Key");
//        headerRow.createCell(1).setCellValue("HashMap1 Value");
//        headerRow.createCell(2).setCellValue("HashMap2 Value");
//
//        // Populating data rows
//        int rowNum = 1;
//        for (String key : hashMap1.keySet()) {
//            Row row = sheet.createRow(rowNum++);
//            row.createCell(0).setCellValue(key);
//            row.createCell(1).setCellValue(hashMap1.get(key));
//            row.createCell(2).setCellValue(hashMap2.get(key));
//        }
//
//        // Writing to Excel file
//        try (FileOutputStream fileOut = new FileOutputStream("Comparison.xlsx")) {
//            workbook.write(fileOut);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//            System.out.println("Comparison.xlsx created successfully.");
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}
//
//}
