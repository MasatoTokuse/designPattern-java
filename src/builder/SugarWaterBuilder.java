package builder;

public class SugarWaterBuilder implements Builder {
	private SugarWater sugarWater;

	public SugarWaterBuilder() {
		this.sugarWater = new SugarWater(0, 0);
	}

	@Override
	public void addSolute(double sugarAmount) {
		sugarWater.sugar += sugarAmount;
	}

	@Override
	public void addSolvent(double waterAmount) {
		sugarWater.water += waterAmount;
	}

	@Override
	public void abandonSolution(double sugarWaterAmount) {
		double sugarDelta = sugarWaterAmount * (sugarWater.sugar / (sugarWater.sugar + sugarWater.water));
		double waterDelta = sugarWaterAmount * (sugarWater.sugar / (sugarWater.sugar + sugarWater.water));
		sugarWater.sugar -= sugarDelta;
		sugarWater.water -= waterDelta;
	}

	@Override
	public Object getResult() {
		return this.sugarWater;
	}
}
