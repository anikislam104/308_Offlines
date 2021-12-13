package calculate;
import java.io.*;

public class SUM {
    Files files;

    public Files getFiles() {
        return files;
    }

    public void setFiles(Files files) {
        this.files = files;
    }

    void calculateSum() throws IOException {
        int i;
        int s=0;
        FileReader fileReader=new FileReader(files.getFile());
        while((i=fileReader.read())!=-1){
            s=s+i-48;
            //System.out.println(i);
        }
        System.out.println(s);
    }
}


