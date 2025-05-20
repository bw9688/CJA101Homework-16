package hw8;

import java.util.*;

public class Homework08_02 {
	
	public void addTrain(Collection<Train> list) {
//		Collection<Train> list = new HashSet<Train>();
		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list.add(new Train(118, "自強", "高雄", "台北", 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list.add(new Train(122, "自強", "台中", "花蓮", 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));

	}

	public void printTrain(Collection<Train> list) {
		for (Train t: list) {
		System.out.printf("%s%s列車從%s出發，目的地是%s，價錢為%.0f" ,
				t.getNumber(),t.getType(),t.getStart(),t.getDest(),t.getPrice()
				);

		System.out.println();
		}
	}

	public static void main(String[] args) {
		Homework08_02 h = new Homework08_02();
		
		
		System.out.println("-------不重複的Train物件-------");
		
		HashSet set = new HashSet();
		h.addTrain(set);
		h.printTrain(set);
		
		System.out.println("-------以班次編號由大到小印出-------");
		
		List<Train> list = new ArrayList<Train>();
		h.addTrain(list);
		Collections.sort(list);
		h.printTrain(list);
		
		System.out.println("-------班次編號由大排到小印出，且不重複-------");
		
		TreeSet<Train> tSet = new TreeSet<Train>();
		h.addTrain(tSet);
		h.printTrain(tSet);
	}
	
	
}
