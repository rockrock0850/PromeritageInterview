package com.promeritage.interview.main;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.promeritage.interview.base.BaseCar;
import com.promeritage.interview.model.Action;
import com.promeritage.interview.model.FashionCar;
import com.promeritage.interview.model.OldCar;
import com.promeritage.interview.model.Point;
import com.promeritage.interview.model.StringQueue;
import com.promeritage.interview.model.StringStack;
import com.promeritage.interview.utils.FontConstant;
import com.promeritage.interview.utils.ShareTool;
import com.promeritage.interview.utils.Constant.Status;

public class PromeritagInterView {
	private static void showCar(BaseCar car){
		System.out.println("Car: " + ReflectionToStringBuilder.toString(car, ToStringStyle.SHORT_PREFIX_STYLE));
	}
	
	private static void forLoop(){
		int result = 0;
		for(int x = 1; x < 101; x++){
//			System.out.println("result( "+ (result+x) +" ) = " + result + " + " + x);
			result = result + x;
		}
		System.out.println("ForLoop Result: " + result);
	}
	
	private static void doWhile(){
		int result = 0;
		int x = 1;
		do {
//			System.out.println("result( "+ (result+x) +" ) = " + result + " + " + x);
			result = result + x;
			x++;
		} while (x < 101);
		System.out.println("DoWhile Result: " + result);
	}
	
	private static void whill(){
		int result = 0;
		int x = 1;
		while(x < 101){
//			System.out.println("result( "+ (result+x) +" ) = " + result + " + " + x);
			result = result + x;
			x++;
		}
		System.out.println("While Result: " + result);
	}
	
	private static void 年紀(int age){
		if(age <= 20){
			System.out.println("青少年");
		}
		if(age > 20 && age <= 30){
			System.out.println("壯年");
		}
		if(age > 30 && age < 50){
			System.out.println("中年");
		}
		if(age >= 50){
			System.out.println("老年");
		}
	}
	
	private static void 年紀2(int age){
		String select = "";
		
		select = (age <= 20) ? "青少年" : select;

		select = (age > 20 && age <= 30) ? "壯年" : select;

		select = (age > 30 && age < 50) ? "中年" : select;

		select = (age >= 50) ? "老年" : select;
		
		System.out.println(select);
	}
	
	private static void stringBuffer1(StringBuffer sb){
		new Thread(new Runnable() {
			public void run() {
				for(int x = 0; x < 100; x++){
					sb.append("a");
					System.out.println("stringBuffer1: " + sb);
				}
			}
		}).start();
	}
	
	private static void stringBuffer2(StringBuffer sb){
		new Thread(new Runnable() {
			public void run() {
				for(int x = 0; x < 100; x++){
					sb.append("x");
					System.out.println("stringBuffer2: " + sb);
				}
			}
		}).start();
	}
	
	private static void stringBuilder1(StringBuilder sb){
		new Thread(new Runnable() {
			public void run() {
				for(int x = 0; x < 100; x++){
					sb.append("a");
					System.out.println("stringBuilder1: " + sb);
				}
			}
		}).start();
	}
	
	private static void stringBuilder2(StringBuilder sb){
		new Thread(new Runnable() {
			public void run() {
				for(int x = 0; x < 100; x++){
					sb.append("x");
					System.out.println("stringBuilder2: " + sb);
				}
			}
		}).start();
	}
	
	private static void GenericList(){
		AbstractList<String> list = new ArrayList<>();
		for (int x = 0; x < 100; x++) {
			list.add("x" + x);
		}
		System.out.println("List: " + ShareTool.toStringBuilder(list));
	}
	
	private static void EnumTest(Status status){
		System.out.println("code[" + status.getCode() + "]: message[" + status.getMessage() + "]");
	}
	
	private static void ObjectsEqualTest(){
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 1);
		Set<Point> pSet = new HashSet<>();
		pSet.add(p1);
		System.out.println("pSet contains p2: " + pSet.contains(p2));
	}
	
	private static void arrayListDemo(){
        List<String> list = new ArrayList<String>();
 
        list.add("Str1");
        list.add("Str2");
        list.add("Str3");
        list.add("Str4");
        list.add("Str5");
 
        System.out.print("顯示輸入：");
 
        //使用 List interface 中所提供的方法列出所有元素
        for(int i = 0 ;  i < list.size() ; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
 
        //使用 for each 列出所有元素
        System.out.println("使用 for each 列出所有元素：");
        for(String s : list){
            System.out.print(s + " ");
        }
        System.out.println();
 
        //使用 iterator 列出所有元素
        System.out.println("使用 iterator 列出所有元素：");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
	}
	
	private static void linkedListStackTest(){
        StringStack stack = new StringStack();

        stack.push("Str1");
        stack.push("Str2");
        stack.push("Str3");
        stack.push("Str4");
        stack.push("Str5");
 
        System.out.print("顯示輸入：");
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");    //利用 pop將元素印出來
        }
        System.out.println();
	}
	
	private static void linkedListQueueTest(){
		StringQueue queue = new StringQueue();

		queue.put("Str1");
		queue.put("Str2");
		queue.put("Str3");
		queue.put("Str4");
		queue.put("Str5");

        System.out.print("顯示輸入：");
		while (!queue.isEmpty()){
			System.out.print(queue.get() + " "); // 利用 get() 將元素印出
		}
		System.out.println();
	}
	
	private static void hashSetTest(){
		Set<String> set = new HashSet<String>();

		set.add("bad");
		set.add("godleon");
		set.add("good");
		set.add("godleon"); // 重複的元素，在 Set 中不會存兩份

		/*
		 * 請注意，實際上元素印出來的順序並非當初元素加入的順序
		 * 那是因為 Set 有自己一套的排序方式
		 */
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// 也是可以利用 for each 的方式將元素印出
		set.remove("good");
		for (String s : set){
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	private static void treeSetTest(){
		Set<String> set = new TreeSet<String>();
		 
        set.add("godleon");
        set.add("good");
        set.add("bad");
 
        /*
         * 由於存入字串，因此元素會以字典的順序加以排序
         * 若要修改排序方式，可實作 java.util.Comparator interface 後
         * 在 new TreeSet 時當作其 Constructor 的參數帶入
         */
        for(String s : set){
            System.out.print(s + " ");
        }
	}

	private static void enumSetTest() {
		
        EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain, FontConstant.Bold);// 建立 EnumSet 並設定其元素內容
        
        showEnumSet(enumSet);//顯示 Set 中內容
        
        showEnumSet(EnumSet.complementOf(enumSet));// 顯示 Set 中 Enumerate 的互補內容
 
        // 建立空的 EnumSet 再一一加入元素
        EnumSet<FontConstant> enumSetEmpty = EnumSet.noneOf(FontConstant.class);
        enumSetEmpty.add(FontConstant.Bold);
        enumSetEmpty.add(FontConstant.Italic);
        
        showEnumSet(enumSetEmpty);
	} 
 
    private static void showEnumSet(EnumSet<FontConstant> enumSet) {
        for(FontConstant constant : enumSet){
            System.out.print(constant + " ");
        }
    }

	private static void hashMapTest() {
		Map<String, String> map = new HashMap<String, String>();

		// 宣告 key
		String key1 = "leon";
		String key2 = "godleon";

		// 使用 put() 將資料存入 Map container 中
		map.put(key1, "leon 的資料");
		map.put(key2, "godleon 的資料");

		// 使用 get() 將資料從 Map container 取出
		System.out.println(map.get(key1));
		System.out.println(map.get(key2));		
	}  

	private static void hashMapTest2() {
		Map<String, String> map = new HashMap<String, String>();
        map.put("leon", "leon 的資料");
        map.put("godleon", "godleon 的資料");
        map.put("bill", "bill 的資料");
 
		/*
		 * 透過 values() 取得 Collection
		 * 再由 Collection 變出 Iterator
		 * 最後由 Iterator 列出所有元素
		 */
        Collection<String> collection = map.values();
        Iterator<String> iterator = collection.iterator();
        
        System.out.println("使用 iterator 列出所有元素：");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
 
        // 透過 for each 也是可以的
        System.out.println("使用 for each 列出所有元素：");
        for(String s : map.values()){
            System.out.println(s);
        }
	}

	private static void treeMapTest() {
		Map<String, String> map = new TreeMap<String, String>();
        map.put("godleon", "godleon 的資料");
        map.put("leon", "leon 的資料");
        map.put("bill", "bill 的資料");
 
        for(String s : map.values()){
            System.out.println(s);
        }
	}

	private static void enumMapTest() {
		// 加入的元素僅限於 Enumerated Type 中所限定的
        Map<Action, String> map = new EnumMap<Action, String>(Action.class);
        map.put(Action.TURN_LEFT, "向左轉");
        map.put(Action.TURN_RIGHT, "向右轉");
        map.put(Action.SHOOT, "射擊");
 
        for(Action action : Action.values()){
            System.out.println(map.get(action));	
        }
	}
	
	public static void main(String[] args) {
		FashionCar fashionCar = new FashionCar();
		fashionCar.setBrand("BMW");
		fashionCar.setDoors("5");
		fashionCar.setSunroof(true);
		showCar(fashionCar);
		
		OldCar oldCar = new OldCar();
		oldCar.setBrand("BENZ");
		oldCar.setDoors("5");
		oldCar.setSunroof(true);
		showCar(oldCar);

        System.out.println();
		
		forLoop();
		doWhile();
		whill();

        System.out.println();
		
		年紀(21);
		年紀2(99);

        System.out.println();
		
		StringBuffer sb = new StringBuffer("BEGIN:");
		stringBuffer1(sb);
		stringBuffer2(sb);
		
//		StringBuilder sb2 = new StringBuilder("BEGIN:");
//		stringBuilder1(sb2);
//		stringBuilder2(sb2);
		
		GenericList();

        System.out.println();
		
		EnumTest(Status.ENGLISH);
		EnumTest(Status.CHINESE);
		EnumTest(Status.JAPANESE);

        System.out.println();
		
		ObjectsEqualTest();

        System.out.println();
		
		arrayListDemo();

        System.out.println();
		
		linkedListStackTest();

        System.out.println();
        
        linkedListQueueTest();

        System.out.println();

        hashSetTest();
        
        System.out.println();

        treeSetTest();
        
        System.out.println();

        enumSetTest();
        
        System.out.println();

        hashMapTest();
        
        System.out.println();

        hashMapTest2();
        
        System.out.println();

        treeMapTest();
        
        System.out.println();

        enumMapTest();
        
        System.out.println();
	}
}
