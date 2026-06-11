package classes;

import java.io.IOException;

public class OMDBApiTests extends API {
    
    public OMDBApiTests(){
        super(
            "df986bf2"
            ,"https://www.omdbapi.com/?t="
            ,"&apikey=");
    }

    public String getMovieInfo(String movieName) throws IOException, InterruptedException{
        return getJson(movieName);
    }
    
}
