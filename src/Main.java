import java.io.IOException;

import org.ietf.jgss.GSSException;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import classes.BooksAPITests;
import classes.GeckoAPITests;
import classes.OMDBApiTests;
import classes.records.OMDB_APIRecord;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String movieJson;

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
        System.out.println(movieJson = omdbApi.getMovieInfo("matrix"));
        
        /* ====== Using Gson Library to create an object from a json file ====== */
        
        System.out.println("----------CREATING OBJECT FROM JSON");
        Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        OMDBApiTests jsonToObjTest = OMDBApiTests.createFromRecord(gson.fromJson(movieJson, OMDB_APIRecord.class));
        System.out.printf("""
                Title: %s
                Year of release: %d
                Sinopse: %s
                """
                ,jsonToObjTest.getTitle()
                ,jsonToObjTest.getReleaseYear()
                ,jsonToObjTest.getSinopse()
            );
    }
}