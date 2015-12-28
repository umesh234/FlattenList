
public class NodeListGenerator {
	
	static int nodeVal = 0;
	// NonThreadSafe function, uses nodeVal to create ids for testing
	public static Node makeSample(int numNodes, int level) {
		if ( level <0 ) 
			throw new RuntimeException("Invalid Input");
	
		Node head = new Node(nodeVal++,null, null,null);
		if(level !=0)
			head.child = makeSample(3, level -1);
		Node end = head;
		for(int i=1;i<numNodes;i++){
			end.next = new Node(nodeVal++,null,null,null);
			end.next.prev = end;
			if(level !=0)
				end.next.child = makeSample(3, level -1); 
			end = end.next;
		}
		return head;
	}
	
	public static Node makeSampleOnlyLastNodeHasChild() {
		Node head = new Node(100,null, null,makeSample(3,2));
		return head;
	}
}
