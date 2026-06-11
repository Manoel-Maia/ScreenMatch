package classes;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class OMDB {/*
    HttpClient client = HttpClient.newHttpClient();
        
        Scanner scanner = new Scanner(System.in);
        final String CHAVE_OMDB = "df986bf2";
        System.out.println("digite o nome do filme: ");
        String search = scanner.nextLine();
        String link = String.format("https://www.omdbapi.com/?t=%s&apikey=%s",search,CHAVE_OMDB);
        System.out.println(link);

        HttpRequest request = HttpRequest.newBuilder().uri(
            URI.create("https://www.omdbapi.com/?t=matrix&apikey=df986bf2")).build();
        
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());*/
}
