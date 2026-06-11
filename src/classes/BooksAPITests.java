package classes;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BooksAPITests {
    private final String API_KEY = "AIzaSyCJCzgxHqYmf4QqWbcUJS03VVf5QYSxqjk";
    private final String BASE_URL = "https://www.googleapis.com/books/v1/volumes?q=";
    
    public String getBook(String name) throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(BASE_URL+name+"&key="+API_KEY)).build();
    
        return client
            .send(request, HttpResponse.BodyHandlers.ofString()).body();
    }

}
