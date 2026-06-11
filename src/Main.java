import java.io.IOException;

import classes.BooksAPITests;
import classes.GeckoAPITests;
import classes.OMDBApiTests;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Testing Google Book API
        BooksAPITests bookAPI = new BooksAPITests();
        System.out.println("----------TESTING BOOKS API");
        System.out.println(bookAPI.getBookInfo("a+arte+da+guerra"));
        //Testing GeckoAPI
        GeckoAPITests geckoAPI = new GeckoAPITests();
        System.out.println("----------TESTING GECKO API");
        System.out.println(geckoAPI.getCoinInfo("bitcoin"));
        //Testing OMDB Api
        OMDBApiTests omdbApi = new OMDBApiTests();
        System.out.println("----------TESTING OMDB API");
        System.out.println(omdbApi.getMovieInfo("matrix"));
    }
}