import java.io.*;

public class ReaderWriter {
    public static void main(String[] args) throws IOException {
        File file_name = new File("D:\\JavaByte\\testdata\\file02.txt");

        FileWriter outfile = new FileWriter(file_name);
        outfile.write("hello");
        outfile.close();

        FileReader infile = new FileReader(file_name);
        System.out.println((char)infile.read());
        infile.close();
    }
}
