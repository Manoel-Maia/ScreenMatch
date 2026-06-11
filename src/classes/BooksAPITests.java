package classes;

import java.io.IOException;

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
