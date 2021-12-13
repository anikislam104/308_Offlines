package TextFile;

import java.io.*;

public class textFile {
    File file=new File("F:\\HTML\\offline 3a\\src\\calculate\\file.txt");
    File file1=new File("F:\\HTML\\offline 3a\\src\\calculate\\file1.txt");
    void convertToAscii() throws IOException {
        FileReader fileReader=new FileReader(file);
        int i;
        int count=0;
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file1));
        while ((i=fileReader.read())!=-1){
            if(count%2==0){
                i+=48;
                bufferedWriter.append((char) i);
                //System.out.println(i);
            }
            count++;
            //i+=48;
            //bufferedWriter.append((char) i);
            //System.out.println(i);
        }
        bufferedWriter.close();
    }

    public File getFile() throws IOException {
        this.convertToAscii();
        return file1;
    }
}
