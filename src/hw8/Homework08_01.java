package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework08_01 {
	public static void main(String[] arg) {
		Homework08_01 h08 = new Homework08_01();
		// 請建立一個Collection物件並將資料加入
		List list = new ArrayList();
		h08.addList(list, new Integer(100), new Double(3.14), new Long(21L), Short.valueOf("100"), Double.valueOf(5.1),
				"Kitty", Integer.valueOf(100), new Object(), "Snoopy", new BigInteger("1000"));

		// 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		Iterator itor = list.iterator();
		h08.printList(list, itor);

//		System.out.println(list);

		// 移除不是java.lang.Number相關的物件

		while (itor.hasNext()) {
			if (itor.next() instanceof Number) {
				itor.remove();
			}
		}

		// 再次印出這個集合物件的所有元素
		System.out.println(list);

	}
	
	
	

	private void addList(List list, Object... objs) {
		for (Object obj : objs) {
			list.add(obj);
		}
	}

	private void printList(List list, Iterator itor) {
//		Iterator itor = list.iterator();
		while (itor.hasNext()) {
			System.out.println(itor.next());
		}

		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if (!(obj instanceof Number || obj instanceof String)) {
				System.out.println("Object物件");
				continue;
			}
			System.out.println(obj);
		}

		for (Object obj : list) {
			if (!(obj instanceof Number || obj instanceof String)) {
				System.out.println("Object物件");
				continue;
			}
			System.out.println(obj);
		}
	}
}
