package calculate;
import TextFile.*;

import java.io.File;
import java.io.IOException;

public class FileAdapter implements Files{
    File file;

    public FileAdapter(String str) throws IOException {
        if(str.equalsIgnoreCase("char")){
            textFile tf=new textFile();
            file=tf.getFile();
        }
        else if(str.equalsIgnoreCase("decimal")){
            decimalFile df=new decimalFile();
            file=df.getFile();
        }
    }

    public File getFile() {
        return file;
    }
}
