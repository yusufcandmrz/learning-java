import java.io.*;
import java.sql.SQLData;
import java.util.Enumeration;
import java.util.Vector;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // JAVA INPUT/OUTPUT
        String testFileAddress = "D:\\\\java\\\\learning-java\\\\JavaIO\\\\testFile.txt";
        String testFileTwoAddress = "D:\\\\java\\\\learning-java\\\\JavaIO\\\\testFileTwo.txt";
        String testFileThreeAddress = "D:\\\\java\\\\learning-java\\\\JavaIO\\\\testFileThree.txt";
        /* System.out.println("simple message");
        System.err.println("error message");

        try {
            int i = System.in.read();
            System.out.println((char) i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // FileOutputStream
        /* try {
            FileOutputStream fout = new FileOutputStream(testFileAddress);
            String string = "JavaTpoint";
            byte[] byes = string.getBytes();
            fout.write(byes);
            fout.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // FileInputStream
        /* try {
            FileInputStream fin = new FileInputStream(testFileAddress);
            int result;
            while ((result = fin.read()) != -1) {
                System.out.print((char) result);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // BufferedOutputStream
        /* try {
            FileOutputStream fout = new FileOutputStream(testFileAddress);
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String string = "Hello JavaTpoint";
            byte[] bytes = string.getBytes();
            bout.write(bytes);
            bout.close();
            fout.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // BufferedInputStream
        /* try {
            FileInputStream fin = new FileInputStream(testFileAddress);
            BufferedInputStream bin = new BufferedInputStream(fin);
            int result;
            while ((result = bin.read()) != -1) {
                System.out.print((char)result);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // SequenceInputStream

        /* try (FileInputStream fin1 = new FileInputStream(testFileAddress);
             FileInputStream fin2 = new FileInputStream(testFileTwoAddress);
             SequenceInputStream sin = new SequenceInputStream(fin1, fin2);
             FileOutputStream fout = new FileOutputStream(testFileThreeAddress);
        ) {
            int result;
            while((result = sin.read()) != -1) {
                fout.write(result);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */
        /* try (FileInputStream fin1 = new FileInputStream(testFileAddress);
             FileInputStream fin2 = new FileInputStream(testFileTwoAddress);
             FileOutputStream fout = new FileOutputStream(testFileThreeAddress);
             SequenceInputStream sin = new SequenceInputStream(new Vector<>(List.of(fin1, fin2)).elements())) {

            int result;
            while((result = sin.read()) != -1) {
                fout.write(result);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // ByteArrayOutputStream
        /* try (FileOutputStream fin1 = new FileOutputStream(testFileAddress);
             FileOutputStream fin2 = new FileOutputStream(testFileTwoAddress);
             ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ) {
            bout.write(65);
            bout.writeTo(fin1);
            bout.writeTo(fin2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


    }
}