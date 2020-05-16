
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SpiltFile {
    public static void main(String[] args) throws IOException {
        FileReader fileName = new FileReader("D:\\JavaByte\\testdata\\file02.txt");
        try (BufferedReader fileObject = new BufferedReader(fileName)) {

            while (fileObject.readLine().length() != 0) {
                System.out.println("error11");
                System.out.println(fileObject.readLine());

            }
            System.out.println("第二部分");
            System.out.println(fileObject.readLine());
        }

//        if (FileObject.readLine().equals("")){
//            System.out.println("ok");
//        }
    }
}
