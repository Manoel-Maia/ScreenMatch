package classes;

import java.io.IOException;

import com.google.gson.annotations.SerializedName;

import classes.records.OMDB_APIRecord;
import classes.superclasses.API;

public class OMDBApiTests extends API {
    
    protected String title;
    protected int releaseYear;
    protected String sinopse;

    public OMDBApiTests(){
        super(
            "df986bf2"
            ,"https://www.omdbapi.com/?t="
            ,"&apikey=");
    }

    public static OMDBApiTests createFromRecord(OMDB_APIRecord record){
        return new OMDBApiTests(){
                {
                    title = record.title();
                    sinopse = record.plot();
                    releaseYear = Integer.parseInt(record.year());
                }
        };
    }

    public String getMovieInfo(String movieName) throws IOException, InterruptedException{
        return getJson(movieName);
    }
    
    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getSinopse() {
        return sinopse;
    }

}
