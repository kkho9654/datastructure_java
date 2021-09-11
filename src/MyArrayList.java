
public class MyArrayList {
	final static int DEFAULT_CAPACITY=10; //초기 default 사이즈
	
	private int size;//실제 요소 개수
	private Object[] arr;
	
	MyArrayList(){
		size=0;
		arr= new Object[DEFAULT_CAPACITY];
	}
	MyArrayList(int capacity) {
		size=0;
		arr= new Object[capacity];
	}

	Object get(int i) {
		if(i<size&&i>=0)
			return arr[i];
		else {
			System.out.println("no data");
			return -1;
		}
	}
	Object set(int i,Object e) {
		if(i<size&&i>=0) {
			Object tmp=arr[i];
			arr[i]=e;
			return tmp;
		}else {
			System.out.println("invalid index");
			return -1;
		}
	}
	void add(int i,Object e) {
		if(size+1>arr.length) resize();
		if(i==0||(i<=size&&i>0)) {
			Object tmp[]= new Object[size-i];
			for(int j=0;j<size-i;j++) {//인덱스i 부터 끝까지 배열tmp에 임시 저장
				tmp[j]=arr[i+j];
			}
			
			arr[i]=e;
			
			for(int j=0;j<size-i;j++) {
				arr[j+i+1]=tmp[j];
			}
			size++;
		}else {
			System.out.println("no existing index");
		}
	}
	void add(Object e) {
		if(size+1>arr.length) resize();
		arr[size]=e;
		size++;
	}
	private void resize() {//doubling
		int doubling=2*arr.length;
		
		Object arr2[]=new Object[size];
		for(int i=0; i<size;i++) {
			arr2[i]=arr[i];
		}
		
		arr= new Object[doubling];
		for(int i=0; i<size;i++) {
			arr[i]=arr2[i];
		}
	}
	Object remove(int i) {
		if(size>0) {
			Object rt=arr[i];//리턴값저장
			Object[] tmp= new Object[size-i];
			for(int j=i+1;j<size;j++) {
				tmp[j-i]=arr[j];
			}
			for(int j=i+1;j<size;j++) {
				arr[j-1]=tmp[j-i];
				arr[size-1]=null;
			}
			size--;
			return rt;
		}else {
			System.out.println("no data to delete");
			return -1;
		}
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		if(size==0)
			return true;
		else {
			return false;
		}
	}
}
