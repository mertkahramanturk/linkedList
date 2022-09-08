package linkedList;

public class LinkedList_main {

	public static void main(String[] args) {
		BizimLL list = new BizimLL();
		list.basaEkle(0);
		list.basaEkle(4);
		list.basaEkle(6);
		list.listeyiYazdýr();
		
		System.out.println();
		
		list.sonaEkle(8);
		list.listeyiYazdýr();

	}

}
