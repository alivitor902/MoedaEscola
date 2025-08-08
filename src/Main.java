import java.util.Scanner;

public class Main {
    //Objetivo: Converter reais para dólar.
    //
    //Variáveis sugeridas: double valorEmReais, double cotacaoDolar.
    //
    //Tarefas:
    //
    //    Guardar valor em reais.
    //
    //    Guardar cotação.
    //
    //    Calcular valor em dólar.
    //
    //    Imprimir:
    //
    //    R$ 500,00 equivalem a US$ 100,00

    public static void main(String[] args) {
        //Inicia scanner
        Scanner scanner = new Scanner(System.in);

        //Recebe valor em dinheiro
        System.out.println("Digite o Valor em Reais");
        Double valorEmReais = scanner.nextDouble();
        //Recebe valor em dolar
        System.out.println("Digite a cotação Atual do Dolar");
        Double cotacaoDolar = scanner.nextDouble();
        //Calcula o valor em dolar
        Double valorEmDolar =  valorEmReais / cotacaoDolar;
        //Apresenta somente 2 casas apos a virgula
        valorEmDolar = Math.round(valorEmDolar * 100.0) / 100.0;
        //Apresenta resultado
        System.out.println( "R$" + valorEmReais + " São equivalentes á US$" + valorEmDolar );






    }


}
