package 컬렉션;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

import 배열기본.Print;

public class 컬렉션구분 {

	public static void main(String[] args) {
		// 중복제거된 컬렉션 ==> Set
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add(1000);
		System.out.println(bag);
		//bag - 주소가 들어가 있음.
		//hashset에 toString()가 들어있어서 주소말고 hashset에 들어있는 값들을 String으로 들어감
		
		ArrayList list = new ArrayList();
		list.add("코딩수업"); //object <-- String
		list.add(2);
		System.out.println(list);
		String s = (String)list.get(0); //String <-- object
		int time = (int)list.get(1);
		System.out.println(time+1);
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("홍길동");
		name.add("김길동");
		String s2 = name.get(0);
		
		ArrayList<Integer> food = new ArrayList<Integer>();
		food.add(18000);
		food.add(12000);
		int in = food.get(0);
		food.add(0,10000); //오버로딩(다형성)
		System.out.println(food);//자바에서는 입력형태가 다르면 메서드이름을 동일하게 써도 된다.
		
		boolean result =  food.contains(12000);
		System.out.println(result);
		int in2 = food.indexOf(12000);
		System.out.println(in2);
		boolean result2= food.isEmpty();
		System.out.println(result2);
		int in3 = food.lastIndexOf(10000);
		System.out.println(in3);
		food.set(0, 11000);
		System.out.println(food);
		Object[] arr2 =food.toArray();
		System.out.println(arr2.length);
		System.out.println(Arrays.toString(arr2));
		food.clear();
		System.out.println(food);
			}

}
