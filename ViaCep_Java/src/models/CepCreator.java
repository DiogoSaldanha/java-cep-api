package models;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CepCreator {
    public void createCepJson(String json) throws IOException{
        Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
        CepRecord cepJson = gson.fromJson(json, CepRecord.class);
        Cep finalCep = new Cep(cepJson);
        FileWriter writer = new FileWriter("CEP.json");
        writer.write(gson.toJson(finalCep));
        writer.close();
    }
}
