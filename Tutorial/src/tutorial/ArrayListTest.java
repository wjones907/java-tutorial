package tutorial;

import java.util.ArrayList;

public class ArrayListTest {
	
	static ArrayList<String> cars = new ArrayList<String>();

	public static void main (String[] args) {

		addItem();
		getItem();
		setItem();
		removeItem();
		getItemsSize();
		loopThroughItems();
		forEachLoopThroughItems();
		clearAllItems();
	}
	
	private static void addItem() {
		System.out.println("***** Add Items *****");
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");		
		
		System.out.println(cars);
	}
	
	private static void removeItem() {
		System.out.println("***** Remove Items *****");
		
		System.out.println("cars list = " + cars);
		
		cars.remove(1);

		System.out.println("cars list = " + cars);
	}
	
	private static void getItem() {
		System.out.println("***** Get Items *****");
		
		System.out.println("cars.get(1) = " + cars.get(1));
	}
	
	private static void setItem() {
		System.out.println("***** Set Items *****");
		
		cars.set(1, "Toyota");
		
		System.out.println("set.cars(1,Toyota), cars.get(1) = " + cars.get(1));
	}

	
	private static void getItemsSize() {
		System.out.println("***** Get Item Size *****");
		
		System.out.println("cars.size() = " + cars.size());
	}

	private static void loopThroughItems() {
		System.out.println("***** Loop Through Items *****");
		
		System.out.println("cars list = " + cars);
		
		for(int i=0; i < cars.size(); i++) {
			System.out.println("cars.get(i) = " + cars.get(i));
		}
		
	}

	private static void forEachLoopThroughItems() {
		System.out.println("***** ForEach Loop Through Items *****");
		
		System.out.println("cars list = " + cars);
		
		for (String i : cars) {
			System.out.println("String = " + i);
		}
		
	}
	private static void clearAllItems() {
		System.out.println("***** Clear All Items *****");
		
		System.out.println("cars list before clear = " + cars);
		
		cars.clear();
		
		System.out.println("cars list after clear = " + cars);
	}

	
	
	
	
	
	
}
