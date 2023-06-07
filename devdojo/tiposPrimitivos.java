package devdojo;

import java.util.Date;

public class tiposPrimitivos {
    public static void main(String[] args) {
        String name1 = "Mario";
        String name2 = "Luigi";
        String site = "https://www.smbencanadores.com.br/";
        String data ="19/09/1985";
        double valor = 250.00;
        String frase = "Olá, meu nome é "+name1+" e este é meu irmão mais novo"+"("+name2+")."+"Estamos na " +
                "atividade " +
                "de encanadores desde de " +data+ " e temos serviços à partir de "+valor+" reais."+" Para mais " +
                "informaçõs, temos este link que leva ao nosso site:"+site;

        System.out.println(frase);
        System.out.println(name1);

    }
}
