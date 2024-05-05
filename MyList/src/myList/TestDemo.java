package myList;

public class TestDemo {

	public static void main(String[] args) {
		ListNode ln1 = new ListNode(0, null);
		ListNode ln2 = new ListNode(0, null);
		ListNode ln3 = new ListNode(0, null);
		
		ln1.next = ln2;
		ln2.next = ln3;
		
		
	}

}
