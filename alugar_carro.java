import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Software de Supermercado");
    System.out.println("---------------------------");

    System.out.println("Digite o preço unitário:");
    float preco_unitario = scan.nextFloat();

    System.out.println("Digite a quantidade vendida:");
    float qtd = scan.nextFloat();
    
    float preco_total = preco_unitario * qtd;
    
    System.out.println("O preço total a pagar é de R$"+preco_total);
    
//-----------------------------------------------------------------------
    
    System.out.println("Digite a quantidade de Km percorridos:");
    float qtd_de_km = scan.nextFloat();
    System.out.println("Digite a quantidade de dias em que o carro foi alugado:");
    int qtd_de_dias = scan.nextInt();
    
    float total = (qtd_de_km*0.20f)+(qtd_de_dias*90);
    
    System.out.println("O valor total a pagar é de R$"+total);
	}
}
