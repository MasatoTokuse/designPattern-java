package composite;

public class CompositeSample {
	public static void main(String[] args) {
		FileInterface root = new Folder("root");
		FileInterface usr = new Folder("usr");
		FileInterface var = new Folder("var");
		FileInterface home = new Folder("home");
		FileInterface user1 = new Folder("user1");
		FileInterface file1 = new File("file1");

		root.addComponent(usr);
		usr.addComponent(var);
		root.addComponent(home);
		home.addComponent(user1);
		user1.addComponent(file1);
		root.defaultMethod(0);
	}
}