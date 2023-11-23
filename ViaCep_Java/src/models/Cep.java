package models;
import java.util.Scanner;

public class Cep {
    private String numeroCep;
    private String logradouroCep;
    private String complementoCep;
    private String bairroCep;
    private String localidadeCep;
    private String estadoCep;
    private String ibgeCep;

    public Cep(CepRecord CepRecord) {
        this.numeroCep = CepRecord.cep();
        this.logradouroCep = CepRecord.logradouro();
        this.complementoCep = CepRecord.complemento();
        this.bairroCep = CepRecord.bairro();
        this.localidadeCep = CepRecord.localidade();
        this.estadoCep = CepRecord.uf();
        this.ibgeCep = CepRecord.ibge();
    }

    public Cep() {
    }

    public String getCep(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um CEP para fazer a busca: ");
        String cep = scanner.nextLine();
        scanner.close();
        this.numeroCep = cep;
        return cep;
    }

    @Override
    public String toString() {
        return "Cep [numeroCep=" + numeroCep + ", logradouroCep=" + logradouroCep + ", complementoCep=" + complementoCep
                + ", bairroCep=" + bairroCep + ", localidadeCep=" + localidadeCep + ", estadoCep=" + estadoCep
                + ", ibgeCep=" + ibgeCep + "]";
    }
}
