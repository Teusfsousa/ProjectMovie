import Title.packge.MyTitleOmdb;
import Title.packge.Title;
import br.com.year.exception.ErrorYearException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(andress))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy
                    (FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            MyTitleOmdb myTitleOmdb = gson.fromJson(json, MyTitleOmdb.class);
            System.out.println(myTitleOmdb);

            Title title = new Title(myTitleOmdb);
            System.out.println("Ttile converted");
            System.out.println(title);

        } catch (NumberFormatException e) {
            System.out.println("An error ocurred!: ");
            System.out.println(e.getMessage()); //Está mensagem vai mostrar o erro que deu ao rodar

        } catch (IllegalArgumentException e) {
            System.out.println("Error in the search");

        } catch (ErrorYearException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Successfully completed!");
        }
    }
}