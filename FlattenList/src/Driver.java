
public class Driver {

	public static void main(String args[]) {
		System.out.println("Hello world!");
		Node head = Node.makeSample(6, 0);
		Node.printList(head);
		ListFlatten.flatten(head);
		Node.printList(head);
		
	}
	

}
