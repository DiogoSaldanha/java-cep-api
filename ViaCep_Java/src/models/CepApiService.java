package models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CepApiService {
    public String getCepJson(String cep) throws IOException, InterruptedException{
        String address = "https://viacep.com.br/ws/"+ cep + "/json/";
        HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        return json;
    }
}
