package factoryMethod;

import java.util.Comparator;

//ConcreteProductに相当する
public class LengthOrderComparator implements Comparator<String> {
	@Override
	 public int compare(String str1, String str2) {
	     return str1.length() - str2.length();
	 }
}