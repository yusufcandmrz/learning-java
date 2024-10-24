import java.io.*;
import java.security.PermissionCollection;
import java.sql.SQLData;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // JAVA INPUT/OUTPUT
        String fileAddress = "D:\\\\java\\\\learning-java\\\\JavaIO";
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


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // ByteArrayInputStream
        /* byte[] bytes = {34, 35, 36};
        ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
        int result;
        while((result = bin.read()) != -1){
            System.out.print(result + " ");
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // DataOutputStream
        /* try (FileOutputStream fout = new FileOutputStream(testFileAddress);
             DataOutputStream dout = new DataOutputStream(fout);
        ) {
            dout.writeInt(65);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // DataInputStream
        /* try (
                FileInputStream fin = new FileInputStream(testFileAddress);
                DataInputStream din = new DataInputStream(fin);
        ) {
            int size = din.available();
            byte[] bytes = new byte[size];
            din.read(bytes);
            for (byte b : bytes) {
                System.out.println((char) b);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // FilterOutputStream
        /* try (
                FileOutputStream fout = new FileOutputStream(testFileAddress);
                FilterOutputStream filterOut = new FilterOutputStream(fout);
        ) {
            String string = "hello java";
            byte[] bytes = string.getBytes();
            filterOut.write(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // FilterInputStream
        /* try (
                FileInputStream fin = new FileInputStream(testFileAddress);
                FilterInputStream filterIn = new BufferedInputStream(fin);
        ) {
            int result;
            while((result = filterIn.read()) != -1) {
                System.out.print((char) result);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // ObjectStreamClass
        /* ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);
        System.out.println(osc.getField("hash"));
        System.out.println(osc.getSerialVersionUID());
        System.out.println(osc.getName());
        System.out.println(Arrays.toString(osc.getFields())); */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // ObjectStreamField
        /* ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);
        ObjectStreamField osf = osc.getField("value");
        try {
            System.out.println(osf.getName());
            System.out.println(osf.getType());
            System.out.println(osf.isPrimitive());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // Console
        /* Console console = System.console();
        System.out.println("Enter your name");
        String input = console.readLine();
        System.out.println("Enter password");
        char[] input2 = console.readPassword();
        System.out.println("Welcome " + input + ", your password is: " + String.valueOf(input2)); */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // FilePermission
        /* FilePermission fp = new FilePermission(fileAddress, "read");
        PermissionCollection pc = fp.newPermissionCollection();
        pc.add(fp);
        FilePermission fp2 = new FilePermission(fileAddress, "write");
        pc.add(fp2);
        if (pc.implies(new FilePermission(fileAddress, "read, write"))) {
            System.out.println("read and write permissions is granted");
        } else {
            System.out.println("read and write permissions is not granted");
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // Writer
        /* try (Writer writer = new FileWriter(testFileAddress)) {
            String content = "hello world";
            writer.write(content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // Reader
        /* try (
                Reader reader = new FileReader(testFileAddress);
        ) {
            int result;
            while ((result = reader.read()) != -1) {
                System.out.print((char) result);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // FileWriter
        /* try (FileWriter fw = new FileWriter(testFileAddress)) {
            String content = "hello javaTpoint";
            fw.write(content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // BufferedWriter
        /* try (FileWriter fw = new FileWriter(testFileAddress);
             BufferedWriter bw = new BufferedWriter(fw);
        ) {
            bw.write("Welcome to javaTpoint");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */
    }
}