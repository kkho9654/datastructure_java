
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list=new MyLinkedList();
		
		list.addFirst("asd1");
		list.addLast("asd2");
		list.addLast("asd3");
		list.addLast("asd4");
		list.addLast("asd5");
		list.addLast("asd6");
		list.addLast("asd7");

		for(int i=0;i<list.size();i++) {
			System.out.println(list.getElement(i));
		}
		System.out.println("====================");
		
		list.add(3, "asd추가");
		list.removeFirst();
		list.remove(6);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.getElement(i));
		}
	}

}
