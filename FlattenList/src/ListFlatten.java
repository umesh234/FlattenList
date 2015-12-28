
public class ListFlatten {

	/** 
	 * Flatten's a given multi level list and returns its head
	 * @param head head of list to flatten
	 */
	public static Node flatten(Node head) {
		if( head ==null)
			return head;
		
		Node start = head;
		Node end = Node.findEnd(head); 
		while(start != end){
			
			//if child exists append it to end of list
			if(start.child != null) {
				end.next = start.child;
				start.child = null ; 
				end = Node.findEnd(end);
			}
			start = start.next;
		}
		return head;
	}

}
