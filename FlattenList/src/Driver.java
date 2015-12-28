
public class Driver {

	public static void main(String args[]) {
		System.out.println("Hello world!");
		simpleTest1();
		simpleTest2();
	}
	
	public static void simpleTest1() {
		Node head = NodeListGenerator.makeSample(6, 1);
		Node.printList(head);
		ListFlatten.flatten(head);
		Node.printList(head);
	}

	public static void simpleTest2() {
		Node head = NodeListGenerator.makeSampleOnlyLastNodeHasChild();
		Node.printList(head);
		ListFlatten.flatten(head);
		Node.printList(head);
	}

}
