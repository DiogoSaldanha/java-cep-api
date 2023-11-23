package main;
import models.Cep;
import models.CepApiService;
import models.CepCreator;
import models.CepValidator;

public class App {
    public static void main(String[] args) throws Exception {
        Cep cep = new Cep();
        CepValidator cepValidator = new CepValidator(); 
        CepApiService cepApiService = new CepApiService();
        CepCreator cepCreator = new CepCreator();
        String cepNumber = cep.getCep();
       
        if(cepValidator.isValid(cepNumber)){
            System.out.println("Processando...");
            String json = cepApiService.getCepJson(cepNumber);
            cepCreator.createCepJson(json);
            System.out.println("Foi criado um arquivo JSON com o resultado :)");
        } else {
            System.out.println("CEP não pode ser validado.");
        }
     }
}
