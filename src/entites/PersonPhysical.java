package entites;

public class PersonPhysical extends Person {

	private double spentHealt;

	// construtor Padrão da Class
	public PersonPhysical() {

	}

	// Construtor da Super Class
	public PersonPhysical(String name, double annualIncome, double spentHealt) {
		super(name, annualIncome);
		this.spentHealt = spentHealt;
	}

	// **Geters e Seters**//
	public double getSpentHealt() {
		return spentHealt;
	}

	public void setSpentHealt(double spentHealt) {
		this.spentHealt = spentHealt;
	}

	//calculando imposto da Pessoa Fisica
	@Override
	public double taxRade() {
		if (getAnnualIncome() <= 20000.0) {
			return getAnnualIncome() * 0.15 - spentHealt * 0.5;
		} else
			return getAnnualIncome() * 0.25 - spentHealt * 0.5;

	}

}
