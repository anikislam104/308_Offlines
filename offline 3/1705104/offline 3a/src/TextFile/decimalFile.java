package TextFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class decimalFile {
    File file=new File("F:\\HTML\\offline 3a\\src\\calculate\\file.txt");
    public File getFile() throws IOException {
        return file;
    }
}
