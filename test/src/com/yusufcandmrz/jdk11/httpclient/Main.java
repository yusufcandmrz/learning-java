package com.yusufcandmrz.jdk11.httpclient;

public class Main {

    /*

    https://www.baeldung.com/java-10-local-variable-type-inference

    Before the HTTP Client API, developers relied on:
    HttpURLConnection:
    Verbose and difficult to work with
    URL url = new URL("https://example.com");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    int responseCode = connection.getResponseCode();

    Third-Party Libraries:
    Libraries like Apache HttpClient or OkHttp were used to overcome the limitations of HttpURLConnection.

    Examples of Usage
    Synchronous GET Request:
    var client = HttpClient.newHttpClient();
    var request = HttpRequest.newBuilder()
                         .uri(URI.create("https://example.com"))
                         .GET()
                         .build();
    var response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());

    POST Request with JSON Payload:
    var client = HttpClient.newHttpClient();
    var request = HttpRequest.newBuilder()
                         .uri(URI.create("https://example.com"))
                         .header("Content-Type", "application/json")
                         .POST(HttpRequest.BodyPublishers.ofString("{\"key\":\"value\"}"))
                         .build();
    var response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());

    Asynchronous Request:
    var client = HttpClient.newHttpClient();
    var request = HttpRequest.newBuilder()
                         .uri(URI.create("https://example.com"))
                         .build();
    client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
      .thenApply(HttpResponse::body)
      .thenAccept(System.out::println)
      .join();

    HTTP/2 Support:
    Automatically uses HTTP/2 when supported by the server:
    var client = HttpClient.newBuilder()
                       .version(HttpClient.Version.HTTP_2)
                       .build();
    */
}
