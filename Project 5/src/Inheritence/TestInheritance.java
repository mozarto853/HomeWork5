package Inheritence;

public class TestInheritance {

	public static void main(String[] args) {
		Children child1 = new Children();
		child1.athletic();
		child1.heights();
		child1.age();
		
		Cousin child2 = new Cousin();
		child2.age();
		child2.weight();
		child2.sports();

	}

}
