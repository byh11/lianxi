import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Main {
    public static void main(String[] args) {
        try {
            String path="/home/bai/桌面/1.xlsx";
            InputStream inputStream = new FileInputStream(path);
            Workbook workbook = null;
            workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            BufferedWriter bw=new BufferedWriter(new FileWriter("/home/bai/桌面/题库.txt"));
            int a=1;
            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                // 循环读取每一个格
                Row row = sheet.getRow(i);
                // row.getPhysicalNumberOfCells()获取总的列数
                for (int index = 0; index < row.getPhysicalNumberOfCells(); index++) {
                    // 获取数据，但是我们获取的cell类型
//代码上的内容自己根据实际需要自己调整就可以，这里只是展示一个样式···~
                    Cell cell = row.getCell(index);
                    // 转换为字符串类型
                    cell.setCellType(CellType.STRING);
                    // 获取得到字符串
                    String id = cell.getStringCellValue();
                    System.out.println(id);
                    bw.write(id+"\n");
                }
                bw.write("\n");
            }
            bw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
