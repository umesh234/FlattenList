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
	

	static int nodeVal = 0;
	public static Node makeSample(int numNodes, boolean createChildren) {
		Node head = new Node(nodeVal++,null, null,null);
		Node end = head;
		for(int i=1;i<numNodes;i++){
			end.next = new Node(nodeVal++,null,null,null);
			end.next.prev = end;
			if(createChildren)
				end.child = makeSample(3, false); 
			end = end.next;
		}
		return head;
	}
}
