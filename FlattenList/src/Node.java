import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@AllArgsConstructor
public class Node {

	public String printNode() {
		return "Node [value=" + value + ", prev=" + prev + ", next=" + next
				+ ", child=" + child + "]";
	}

	@Getter @Setter int value;
	@Getter @Setter Node prev;
	@Getter @Setter Node next;
	@Getter @Setter Node child;
	
	public static void printList(Node head){
		while(head != null) {
			System.out.println( head.printNode() + " , ");
			head = head.next;
		}
	}
	

	
	/**
	 * Returns the last node of a link list.
	 * throws exception if the last node doesnt exist
	 * @param head
	 * @return
	 */
	public static Node findEnd(Node head){
		if ( head == null) {
			 throw new RuntimeException(" End doesnt exist for a non existent list");
		}
		while(head.next !=null)
			head = head.next;
		return head;
	}
	
	static int nodeVal = 0;
	// NonThreadSafe function, uses nodeVal to create ids for testing
	public static Node makeSample(int numNodes, int level) {
		if ( level <0 ) 
			throw new RuntimeException("Invalid Input");
	
		Node head = new Node(nodeVal++,null, null,null);
		Node end = head;
		for(int i=1;i<numNodes;i++){
			end.next = new Node(nodeVal++,null,null,null);
			end.next.prev = end;
			if(level !=0)
				end.child = makeSample(3, level -1); 
			end = end.next;
		}
		return head;
	}
}
