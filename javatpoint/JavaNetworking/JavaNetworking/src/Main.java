import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // URL Class
        /* try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } */

        /* try {
            URL url = new URL("https://www.google.com/searh?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("Default Port Number: " + url.getDefaultPort());
            System.out.println("Query String: " + url.getQuery());
            System.out.println("Path: " + url.getPath());
            System.out.println("File: " + url.getFile());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } */


        // *****************************************************
        // *****************************************************
        // *****************************************************
        // URLConnection Class
        /* try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            URLConnection urlConnection = url.openConnection();
            try (
                    InputStream stream = urlConnection.getInputStream();
            ) {
                int content;
                while ((content = stream.read()) != -1) {
                    System.out.print((char) content);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } */


        // *****************************************************
        // *****************************************************
        // *****************************************************
        // HttpURLConnection
        /* HttpURLConnection httpURLConnection;
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            httpURLConnection = (HttpURLConnection) url.openConnection();
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                System.out.println("key: " + key + ", value: " + value);
            }
        } catch (IOException e) {
            System.out.println("Erorr while connecting to URL: " + e.getMessage());
        } */


        // *****************************************************
        // *****************************************************
        // *****************************************************
        // InetAddress Class
        /* try {
            InetAddress inetAddress = InetAddress.getByName("www.javatpoint.com");
            System.out.println("Host Name: " + inetAddress.getHostName());
            System.out.println("IP Address: " + inetAddress.getHostAddress());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } */
    }
}