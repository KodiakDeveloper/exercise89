package bookExercises;

public class Ex89methods {

	public Double arithmeticCalculations(Double a, Double b, Double c, int d) {

		Double finalResult = 0.0;

		if (d == 1) {

			finalResult = arithmeticMean(a, b, c);

		}

		else if (d == 2) {

			finalResult = weightedAverage(a, b, c);

		}

		return finalResult;
	}

	public Double arithmeticMean(Double a, Double b, Double c) {

		Double arithmeticMean = (a + b + c) / 3;

		return arithmeticMean;

	}

	public Double weightedAverage(Double a, Double b, Double c) {

		Double weightedAverage = (a * 5 + b * 3 + 3 * 2) / (5 + 3 + 2);

		return weightedAverage;

	}

}
