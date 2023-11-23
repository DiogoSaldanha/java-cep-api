package models;

public class CepValidator {
    public boolean isValid(String cep){
        return cep.length() == 8;
    }
}
