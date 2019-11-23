package templateMethod;

public class TemplateMethodSample {

	public static void main(String[] args) {
		AbstractDisplay strDisp = new StringDisplay("Design Pattern");
		strDisp.display();
	}

}
