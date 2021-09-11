
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList al= new MyArrayList();
		al.add(0,"dddd");
		al.add("asd1");
		al.add("asd2");
		al.add(2,"asd3");
		al.add("asd4");
		al.set(4, "asd4 수정");
		al.add(5,"asd5");
		al.add(8,"asd6");//no existing index
		for(int i=0;i<8;i++)//index 7,8 no data
			System.out.println(al.get(i));
		System.out.println("------------");
		for(int i=0;i<7;i++)//i 7 >> no data to delete
			System.out.println(al.remove(al.size()-1));
		System.out.println("==========");
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");
		al.add("8");
		al.add("9");
		al.add("10");
		al.add("11");
		al.add("12");
		for(int i=0;i<12;i++)
			System.out.println(al.get(i));
	}

}
