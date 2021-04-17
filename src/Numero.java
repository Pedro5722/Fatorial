import java.util.Scanner;
public class Numero {
	int Valor;
	int Fatorial = 1;

	Scanner leia = new Scanner(System.in);
	
	
	public void cadastro() {
		System.out.println("============== Calculo de fatoriais ============");
		System.out.println("Qual o numero que você deseja fatorar?");
		this.Valor = leia.nextInt();
		System.out.println("============== Fatorando ============");
	}
	
	public void calcular() {
		for (int c = 1; c <= this.Valor; c++) {
			System.out.println(this.Fatorial+" * "+c+" = ");
			this.Fatorial = this.Fatorial * c;
			System.out.println(this.Fatorial);
			System.out.println("________________");
		};
		System.out.println("============== Fatorado com Sucesso ============");
		System.out.println(this.Valor+"! = "+this.Fatorial);
		
	}
	
	
	
}
