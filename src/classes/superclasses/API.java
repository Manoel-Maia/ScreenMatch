package classes.superclasses;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    protected final String API_KEY;
    protected final String BASE_URL;
    protected final String KEY_QUERY_NAME;
    
    protected API(String key, String baseUrl, String keyQueryName){
        API_KEY=key;
        BASE_URL=baseUrl;
        KEY_QUERY_NAME = keyQueryName;
    }

    protected String getJson(String name) throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(BASE_URL+name+KEY_QUERY_NAME+API_KEY)).build();
    
        return client
            .send(request, HttpResponse.BodyHandlers.ofString()).body();
    }
}
