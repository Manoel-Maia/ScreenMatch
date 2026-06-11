import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import classes.BooksAPITests;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BooksAPITests bookAPI = new BooksAPITests();

        System.out.println(bookAPI.getBook("a+arte+da+guerra"));
    }
}