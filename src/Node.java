
public class Node {
	private Object e;
	private Node next,prev;
	public Node(){
		e=null;
		next=null;
		prev=null;
	}
	
	public Object element() {
		return e;
	}
	public void setElement(Object e) {
		this.e=e;
	}
	public void setPrev(Node n) {
		prev=n;
	}
	public Node getPrev() {
		return prev;
	}
	public void setNext(Node n) {
		next=n;
	}
	public Node getNext() {
		return next;
	}
}
