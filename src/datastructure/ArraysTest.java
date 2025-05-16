package datastructure;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int[] myarr = { 100, 20, 40, 88, 99, 78 };
		int[] myarr2 = myarr; // 얕은복사
		int[] myarr3 = myarr.clone(); // 깊은복사 - 독립적인 배열을 생성
		System.out.println(myarr);
		System.out.println(myarr2);
		System.out.println(myarr3);
		System.out.println("myarr=>" + Arrays.toString(myarr));
	}

}
