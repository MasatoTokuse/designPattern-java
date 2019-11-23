package bridge;

public class SortTimer extends Sorter{
	
	public SortTimer(SortImple sortImple){
        super(sortImple);
    }
	
	// 機能を追加する場合は、継承することで実装の変更を気にすることなく追加できる。
	public void timerSorter(Object obj[]){
        long start = System.currentTimeMillis();
        sort(obj);
        long end = System.currentTimeMillis();
        System.out.println("time:"+(end - start));
    }
}
