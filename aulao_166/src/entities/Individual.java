package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {

		// double basicTax = (getAnualIncome() < 20000.0) ? getAnualIncome() * 0.15 :
		// getAnualIncome() * 0.25;

		// ACIMA HÁ UMA FORMA RESUMIDA CHAMADA OPERADOR CONDICIONAL TERNÁRIO

		double basicTax;
		if (getAnualIncome() < 20000.0) {
			basicTax = getAnualIncome() * 0.15;

		} else {
			basicTax = getAnualIncome() * 0.25;

		}

		basicTax = basicTax - (getHealthExpenditures() * 0.5); // O PARENTESE NÃO É NESCESSARIO NESSE CASO POR CONTA DA
																// ORDEM DE PRECEDENCIA.
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}

		return basicTax;

	}

}
