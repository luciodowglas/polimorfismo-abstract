package entites;

public class PersonLegal extends Person {

	private Integer numberEmployees;

	// Construtor Padrão da Class sem Argumentos
	public PersonLegal() {

	}

	public PersonLegal(String name, double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	// **Geters e Seters**//
	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	// Calculando imposto da Pessoa Juridica
	@Override
	public double taxRade() {
		if (numberEmployees > 10) {
			return getAnnualIncome() * 0.14;
		} else {
			return getAnnualIncome() * 0.16;
		}
	}

}
