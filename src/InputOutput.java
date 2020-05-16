import java.io.*;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        File file_name = new File("D:\\JavaByte\\testdata\\file01.txt");

        OutputStream outfile = new FileOutputStream(file_name);
        outfile.write('H');
        outfile.close();


        InputStream infile = new FileInputStream(file_name);
        System.out.println((char)infile.read());
        infile.close();


    }
}
