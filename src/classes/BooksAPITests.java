package classes;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BooksAPITests extends API {

    public BooksAPITests(){
        super(
            "AIzaSyCJCzgxHqYmf4QqWbcUJS03VVf5QYSxqjk"
            ,"https://www.googleapis.com/books/v1/volumes?q="
            ,"&key=");
    }
    
    public String getBookInfo(String name)throws IOException, InterruptedException{
        return getJson(name);
    }
}
