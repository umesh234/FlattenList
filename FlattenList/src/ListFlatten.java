
public class ListFlatten {

	/** 
	 * Flatten's a given multi level list and returns its head
	 * @param head head of list to flatten
	 */
	public static Node flatten(Node head) {
		if( head ==null)
			return head;
		
		Node start = head;
		Node end = findEnd(head); //TODO: write findEnd - finds end of given list
		while(start != end){
			
			//if child exists append it to end of list
			if(start.child != null) {
				end.next = start.child;
				start.child = null ; 
				end = findEnd(end);
			}
			start = start.next;
		}
		return head;
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
}
