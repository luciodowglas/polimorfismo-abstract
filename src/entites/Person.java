package entites;

/*
Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usu�rio), os quais
podem ser pessoa f�sica ou pessoa jur�dica, e depois mostrar o valor do imposto pago por cada um,
bem como o total de imposto arrecadado.
Os dados de pessoa f�sica s�o: nome, renda anual e gastos com sa�de. Os dados de pessoa jur�dica
s�o nome, renda anual e n�mero de funcion�rios. As regras para c�lculo de imposto s�o as
seguintes:
Pessoa f�sica: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com sa�de, 50%
destes gastos s�o abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com sa�de, o imposto
fica: (50000 * 25%) - (2000 * 50%) = 11500.00
Pessoa jur�dica: pessoas jur�dicas pagam 16% de imposto. Por�m, se a empresa possuir mais de 10
funcion�rios, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcion�rios, o imposto fica:
400000 * 14% = 56000.00
*/

public abstract class Person {

	private Integer id;
	private String name;
	private double AnnualIncome;  // renda Anual
	
	//Construtor Padr�o
	public Person() {
		
	}

	public Person(String name, double annualIncome) {
		this.name = name;
		this.AnnualIncome = annualIncome;
	}
	
	public abstract double taxRade();
	//**Geters e Seters**//
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualIncome() {
		return AnnualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		AnnualIncome = annualIncome;
	}
	
	
	
	
}
