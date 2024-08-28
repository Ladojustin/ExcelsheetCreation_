// program to create a excel sheet in the filepath we give................
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateExcelSheet {
    public static void main(String[] args)  {
        CreateExcelSheet sheet = new CreateExcelSheet();
        sheet.createExcelSheet();
    }
    Scanner in = new Scanner(System.in);
    public void createExcelSheet() {
        // path to create an excel sheet
        String filePath = "C://Users//ladoj//sql//hod_details.csv";
        BufferedWriter Writer;
        try {
            Writer = new BufferedWriter(new FileWriter(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("EXCEL SHEET CREATED!!!");
    }
}
