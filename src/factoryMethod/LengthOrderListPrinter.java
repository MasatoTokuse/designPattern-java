package factoryMethod;

import java.util.Comparator;

//ConcreteCreatorに相当する
public class LengthOrderListPrinter extends ListPrinter {
	 @Override
	 protected Comparator<String> createComparator() {
	     return new LengthOrderComparator();
	 }
}