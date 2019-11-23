package factoryMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Creatorに相当する
public abstract class ListPrinter {
    // anOperationに相当する(Template Method)
    public void printList(List<String> list) {
        Comparator<String> comparator = createComparator();
        list = new ArrayList<String>(list);

        Collections.sort(list, comparator);

        for (String item : list) {
            System.out.println(item);
        }
    }

    // factoryMethodに相当する
    protected abstract Comparator<String> createComparator();
}