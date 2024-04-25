import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
       System.out.println("Digite um fillme");
       var busca = scan.next();
       String key = "AIzaSyDqcHSojnNfjVW2qmOWmdTQObT-e773w5g";
        String andress = "https://www.googleapis.com/books/v1/volumes?q=" + busca + "&fields=items&key=" + key;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(andress))
                .build();
        HttpResponse<String> response = client

                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
