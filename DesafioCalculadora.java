package FundamentosJava.Operadores.ParaGit.DesafioCalculadora;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Desafio da calculadora, com base no aprendizado e na orientação da COD3R pela
		// UDEMY
		// Entradas no sistemas
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Primeiro numero: ");
		double Vl1 = Entrada.nextDouble();

		System.out.println("Segundo numero: ");
		double Vl2 = Entrada.nextDouble();

		System.out.println("Selecione a operação:");
		String Cont = Entrada.next();

		// Logica:
		double Resultado = "+".equals(Cont) ? Vl1 + Vl2 : 0;
		Resultado = "-".equals(Cont) ? Vl1 - Vl2 : Resultado;
		Resultado = "*".equals(Cont) ? Vl1 * Vl2 : Resultado;
		Resultado = "/".equals(Cont) ? Vl1 / Vl2 : Resultado;
		Resultado = "%".equals(Cont) ? Vl1 % Vl2 : Resultado;
		// Saida do resultado:
		System.out.printf("%.2f %s %.2f = %.2f", Vl1, Cont, Vl2, Resultado);
		//Fim do desafio

		Entrada.close();
	}
}
