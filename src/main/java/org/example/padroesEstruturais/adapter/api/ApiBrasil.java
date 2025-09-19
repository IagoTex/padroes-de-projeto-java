package org.example.padroesEstruturais.adapter.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiBrasil {

    private String linkApi = "https://servicodados.ibge.gov.br/api/v1/localidades/paises/";

    public String getNomePais(String numero) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(linkApi + numero)).GET().build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        String chave = "\"nome\":";
        int inicio = json.indexOf(chave) + chave.length();

        inicio = json.indexOf("\"", inicio) + 1;

        int fim = json.indexOf("\"", inicio);

        String nome = json.substring(inicio, fim).trim();
        return nome;

    }

}
