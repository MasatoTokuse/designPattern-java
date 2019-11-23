package builder;

public class BuilderSample {

	public static void main(String[] args) {
		Builder builder = new SaltWaterBuilder();
		Director director = new Director(builder);
		director.constract();
		SaltWater saltWater = (SaltWater)builder.getResult();
		System.out.println(saltWater.salt + saltWater.water);
		
		builder = new SugarWaterBuilder();
		director = new Director(builder);
		director.constractTwo();
		SugarWater sugarWater = (SugarWater)builder.getResult();
		System.out.println(sugarWater.sugar + sugarWater.water);
	}

}
