package com.ola;

import java.util.Scanner;

public class Test {
	
	public static void main (String[]args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Quantidade de laranjas: ");
	var laranjas = entrada.nextInt();
	
	System.out.println("A forma de pagamento é PIX? (True ou false)");
	boolean pix = entrada.nextBoolean();
	
	double valor = laranjas < 10 ? 2.5 : 2;
	double desconto = pix == true ? .9 : 1;
	
	double valorFinal = valor * laranjas * desconto;
	
	System.out.println("Valor " + valorFinal);
	
	
	}
}



