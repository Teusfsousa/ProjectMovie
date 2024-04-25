import Title.packge.Title;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the name for moive:");
        var busca = scan.next();
        String andress = "https://www.omdbapi.com/?t=" + busca + "&apikey=3e230bd6";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(andress))
                .build();
        HttpResponse<String> response = client

                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);
        Gson gson = new Gson();
        Title title = gson.fromJson(json, Title.class);
        System.out.println(title);


    }
}
