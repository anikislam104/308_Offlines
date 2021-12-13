package calculate;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        SUM sum=new SUM();
        String string=new String();
        Scanner scanner=new Scanner(System.in);
        string=scanner.nextLine();
        Files files=new FileAdapter(string);
        sum.setFiles(files);
        sum.calculateSum();
    }
}
