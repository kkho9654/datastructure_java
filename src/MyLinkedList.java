
public class MyLinkedList {
	private Node head,tail;
	private int size;
	public MyLinkedList() {
		head=null;
		tail=null;
		size=0;
	}

	private Node setNode(Object e) {
		Node p= new Node();
		p.setElement(e);
		return p;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		if(size==0) return true;
		else return false;
	}
	public Node get(int index) {
		if(index>size-1) {
			System.out.println("invalid index");
		}
		int i=0;
		Node p=head;
		if(index==0) return p;
		while(i<index) {
			p=p.getNext();
			i++;
		}
		return p;
	}
	public Object getElement(int index) {
		return get(index).element();
	}
	
	public void addFirst(Object e) {
		Node p=setNode(e);
		p.setNext(head);
		if(head!=null)
			head.setPrev(p);
		head=p;
		if(head.getNext()==null)
			tail=head;
		size++;
	}
	public void addLast(Object e) {
		Node p= setNode(e);
		p.setPrev(tail);
		if(tail!=null)
			tail.setNext(p);
		tail=p;
		if(tail.getPrev()==null)
			head=tail;
		size++;
	}

	public void add(int index,Object e) {
		if(index>size-1) {
			System.out.println("invalid index");
		}
		Node newNode=setNode(e);
		if(index==0) addFirst(e);
		if(index==size-1) addLast(e);

		Node pre=get(index).getPrev();
		Node nex=get(index);

		pre.setNext(newNode);
		newNode.setPrev(pre);
		nex.setPrev(newNode);
		newNode.setNext(nex);

		size++;
	}
	
	public Object removeFirst() {
		if(size==0) {
			System.out.println("no data to delete");
		}
		Node newHead=head.getNext();
		Node oldHead= head;
		head=newHead;
		head.setPrev(null);
		
		Object ret=oldHead.element();
		oldHead=null;

		size--;

		return ret;
	}
	public Object remove(int index) {
		if(index>size-1) {
			System.out.println("invalid index");
			return -1;
		}
		if(index==0) {
			return removeFirst();
		}
		if(index==size-1) {
			Node oldTail=tail;
			Node newTail=tail.getPrev();
			tail=newTail;
			tail.setNext(null);
			
			size--;
			return oldTail.element();
		}else {
			Node pre=get(index).getPrev();
			Node nex=get(index).getNext();

			pre.setNext(nex);
			nex.setPrev(pre);
			size--;
		}
		
		return get(index).element();
	}

}
