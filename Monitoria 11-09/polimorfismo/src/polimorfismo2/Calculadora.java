package polimorfismo2;

import java.io.IOException;

public class Calculadora {

	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
//		System.out.println(calculadora.calcular(1000000000000000000l, 2000000000000000000l, "+"));
//		System.out.println(calculadora.calcular(1000000000, 200000000, "+"));
//		System.out.println(calculadora.calcular("3","30", "*"));
//		System.out.println(calculadora.calcular(3.0, 1.0, "+"));
//		System.out.println(calculadora.calcular(3.0f, 1.0f, "+"));
//		System.out.println(calculadora.calcular(new byte[] {0,1}, new byte[] {1,0}, "+"));
		
		System.out.println(calculadora.calcular(1F, 0F, "/"));
	}	
	
	public double calcular(int a, int b, String op) {
		double resultado = 0;
		System.out.println("Com inteiro");
		switch (op) {
		case "+":
		{
			resultado = a + b;
			break;
		}
		case "-":
		{
			resultado = a - b;
			break;
		}
		case "*":
		{
			resultado = a * b;
			break;
		}
		case "/":
		{
			if(b == 0) {
				resultado = 0;
			}else{
				resultado = a / b;
			}
			break;
		}
		}
		return resultado;
	}
	
	public double calcular(long a, long b, String op) {
		double resultado = 0;
		System.out.println("Inteiro longo");
		switch (op) {
		case "+":
		{
			resultado = a + b;
			break;
		}
		case "-":
		{
			resultado = a - b;
			break;
		}
		case "*":
		{
			resultado = a * b;
			break;
		}
		case "/":
		{
			if(b == 0) {
				resultado = 0;
			}else{
				resultado = a / b;
			}
			break;
		}
		}
		return resultado;
	}
	
	public double calcular(double a, double b, String op) {
		System.out.println("Com double");
		double resultado = 0;
		switch (op) {
		case "+":
		{
			resultado = a + b;
			break;
		}
		case "-":
		{
			resultado = a - b;
			break;
		}
		case "*":
		{
			resultado = a * b;
			break;
		}
		case "/":
		{
			if(b == 0) {
				resultado = 0;
			}else{
				resultado = a / b;
			}
			break;
		}
		}
		return resultado;
	}
	
	public double calcular(float a, float b, String op){
		System.out.println("Com float");
		double resultado = 0;
		switch (op) {
		case "+":
		{
			resultado = a + b;
			break;
		}
		case "-":
		{
			resultado = a - b;
			break;
		}
		case "*":
		{
			resultado = a * b;
			break;
		}
		case "/":
		{
			try {
				if(b == 0F) {
					throw new ArithmeticException("Divisão por zero!");
				}
				resultado = a / b;
			} catch (ArithmeticException e) {
				resultado = 0;
			}
			
//			if(b == 0) {
//				resultado = 0;
//			}else{
//				resultado = a / b;
//			}
			
			break;
		}
		}
		return resultado;
	}
	
	
	public double calcular(byte[] aBinario, byte[] bBinario, String op) {
		System.out.println("Com binário");
		double resultado = 0;
		String abinarioEmString = "";
		for(byte a : aBinario) 
			abinarioEmString += a;
		String bbinarioEmString  = "";
		for(byte b : bBinario) 
			bbinarioEmString += b;
		int a = Integer.parseInt(abinarioEmString, 2);
		int b = Integer.parseInt(bbinarioEmString, 2);
		switch (op) {
		case "+":
		{
			resultado = a + b;
			break;
		}
		case "-":
		{
			resultado = a - b;
			break;
		}
		case "*":
		{
			resultado = a * b;
			break;
		}
		case "/":
		{
			if(b == 0) {
				resultado = 0;
			}else{
				resultado = a / b;
			}
			break;
		}
		}
		return resultado;
	}
	
	
	
	public double calcular(Double a, Double b ,String op) {
		double resultado = 0;
		switch (op) {
		case "+":
		{
			resultado = a + b;
			break;
		}
		case "-":
		{
			resultado = a - b;
			break;
		}
		case "*":
		{
			resultado = a * b;
			break;
		}
		case "/":
		{
			if(b == 0) {
				resultado = 0;
			}else{
				resultado = a / b;
			}
			break;
		}
		}
		return resultado;
	}
	
	public double calcular(String aString, String bString, String op) {
		System.out.println("Com String");
		double resultado = 0;
		double a = Double.parseDouble(aString);
		double b = Double.parseDouble(bString);
		switch (op) {
		case "+":
		{
			resultado = a + b;
			break;
		}
		case "-":
		{
			resultado = a - b;
			break;
		}
		case "*":
		{
			resultado = a * b;
			break;
		}
		case "/":
		{
			if(b == 0) {
				resultado = 0;
			}else{
				resultado = a / b;
			}
			break;
		}
		}
		return resultado;
	}
	
	
}
