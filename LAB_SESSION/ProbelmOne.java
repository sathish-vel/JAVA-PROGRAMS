package labSession;

import java.util.*;

public class ProbelmOne {
	List<Integer> list = new ArrayList<>();
	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();

	public List<Integer> storeEvenNumbers(int n) {
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0)
				list.add(i);
		}
		return list;
	}

	public List<Integer> printEvenNumbers(List<Integer> evenNum) {
		for (Integer e : evenNum) {
			list1.add(e * 2);
		}
		return list1;
	}

	public List<Integer> retrieveEvenNumber(List<Integer> evenNum, List<Integer> printnum) {
		for (Integer e : evenNum) {
			for (Integer p : printnum) {
				if (e == p)
					list2.add(e);
			}
		}
		return list2;
	}

	public static void main(String[] args) {
		ProbelmOne obj = new ProbelmOne();

		List<Integer> EvenNum = obj.storeEvenNumbers(10);
		System.out.println("Printing Even Numbers : \n" + EvenNum);

		List<Integer> printnum = obj.printEvenNumbers(EvenNum);
		System.out.println("Printing AddEven Numbers : \n" + printnum);

		List<Integer> retEven = obj.retrieveEvenNumber(EvenNum, printnum);
		System.out.println("Printing Even Numbers Existing Number: \n" + retEven);
	}
}
