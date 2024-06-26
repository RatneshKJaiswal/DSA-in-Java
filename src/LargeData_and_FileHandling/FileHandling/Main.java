package LargeData_and_FileHandling.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {


//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.println("Enter some letters");
//            int letters = isr.read();
//            while(isr.ready()){
//                System.out.println((char)letters);
//                letters = isr.read();
//            }
//
////            isr.close();  Auto-close is available
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try(FileReader fr = new FileReader("C:\\DSA-in-Java\\src\\LargeData_and_FileHandling.FileHandling\\note.txt")){

            while(fr.ready()){
                int letters = fr.read();
                System.out.print((char)letters);
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileWriter fw = new FileWriter("C:\\DSA-in-Java\\src\\LargeData_and_FileHandling.FileHandling\\note.txt", true)) {

            for(int i =65; i< 91;i++){
                fw.write((char)i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
