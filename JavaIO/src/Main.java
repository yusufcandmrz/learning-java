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


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // BufferedReader
        /* try (FileReader fr = new FileReader(testFileAddress);
             BufferedReader br = new BufferedReader(fr);
        ) {
            int content;
            while ((content = br.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */

        /* try (
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
        ) {
            String name = "";
            while (!name.equals("stop")) {
                System.out.println("Enter your name");
                name = br.readLine();
                System.out.println("name: " + name);
            }
            // System.out.println("Welcome " + name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // CharArrayReader
        /* char[] charArray = {'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};
        CharArrayReader car = new CharArrayReader(charArray);
        try {
            int result;
            while ((result = car.read()) != -1) {
                System.out.println("result: " + (char) result);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // CharArrayWriter
        /* try (CharArrayWriter caw = new CharArrayWriter();
             FileWriter fw = new FileWriter(testFileAddress);
        ) {
            caw.write("Hello javaTpoint");
            caw.writeTo(fw);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // PrintStream
        /* try (
        FileOutputStream fout = new FileOutputStream(testFileAddress);
        PrintStream ps = new PrintStream(fout);
        ) {
            ps.println(1999);
            ps.println("Hello Java");
            ps.println("Welcome to Java");
        } catch (Exception e) {
            throw new RuntimeException();
        } */

        /* int number = 25;
        System.out.printf("%d", number); */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // PrintWriter
        /* PrintWriter pw = new PrintWriter(System.out);
        String content = "javaTpoint provides tutorials of all technology";
        pw.write(content);
        pw.flush();
        pw.close();
        try {
            pw = new PrintWriter(testFileAddress);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        pw.write(content);
        pw.flush();
        pw.close(); */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // OutputStreamWriter
        /* try(OutputStream os = new FileOutputStream(testFileAddress);
            Writer writer = new OutputStreamWriter(os);
        ) {
            writer.write("hello javaTpoint");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // InputStreamReader
        /* try (InputStream is = new FileInputStream(testFileAddress);
             Reader reader = new InputStreamReader(is);
        ) {
            int result;
            while((result = reader.read()) != -1) {
                System.out.print((char) result);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // PushbackInputStream
        /* String content = "1##2#34###12";
        byte[] bytes = content.getBytes();
        try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
             PushbackInputStream pis = new PushbackInputStream(bais);
        ) {
            int firstResult;
            while ((firstResult = pis.read()) != -1) {
                if (firstResult == '#') {
                    int secondResult;
                    if ((secondResult = pis.read()) == '#') {
                        System.out.print("**");
                    } else {
                        pis.unread(secondResult);
                        System.out.print((char) firstResult);
                    }
                } else {
                    System.out.print((char) firstResult);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // ****************************************************
        // ****************************************************
        // ****************************************************
        // PushbackReader
        /* char[] array = {'1', '-', '-', '2', '-', '3', '4', '-', '-', '-', '5', '6'};
        CharArrayReader reader = new CharArrayReader(array);
        PushbackReader pr = new PushbackReader(reader);
        int currentResult;
        try {
            while ((currentResult = pr.read()) != -1) {
                int nextResult;
                if (currentResult == '-') {
                    if ((nextResult = pr.read()) == '-') {
                        System.out.print("#");
                    } else {
                        pr.unread(nextResult);
                        System.out.print((char) currentResult);
                    }
                } else {
                    System.out.print((char) currentResult);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */
    }
}