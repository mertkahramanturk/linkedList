package linkedList;

public class BizimLL {
	
	Eleman bas;
	Eleman son;
	
	public void bizimLL() {
		
		bas = null;
		son = null;
	}
	
	public void basaEkle(int sayi) {
		
		Eleman yeniEleman = new Eleman(sayi);
		
		if(doluMu()) {
			
			//liste dolu
			yeniEleman.siradaki = bas;
			bas = yeniEleman;
			
		}else {
			
			//liste boþ
			bas = yeniEleman;
			son = yeniEleman;
			
		}
	}
	public void sonaEkle(int sayi) {
		Eleman yeniEleman = new Eleman(sayi);
if(doluMu()) {
			
			//liste dolu
			son.siradaki = yeniEleman;
			son = yeniEleman;
			
		}else {
			
			//liste boþ
		bas = yeniEleman;
		son = yeniEleman;
			
		}
		
	}
	public void indekseEkle( int sayi, int indeks) {
		Eleman yeniEleman = new Eleman(sayi);
if(doluMu()) {
		if( indeks == 0) {
			// baþa eklemekle ayný
			yeniEleman.siradaki = bas;
			bas = yeniEleman;
		}
			
			
		}else {
			
			//ortada bir yere ekleme
			Eleman isaretci1 = null;
			Eleman isaretci2 = bas;
			int mevcutIndeks = 0;
			while(isaretci2 != null && mevcutIndeks <indeks ) {
				
			}
				isaretci1 = isaretci2;
				
				isaretci2 = isaretci2.siradaki;
				mevcutIndeks++;
			}
			
			
		}
	
	public void listeyiYazdýr() {
		Eleman isaretci = bas;
		while(isaretci != null) {
			System.out.print(isaretci.sayi+ "  ");
			isaretci = isaretci.siradaki;
		}
	}
	public boolean doluMu(){
		
		if (bas != null)
		{
			return true;
		} else 
		{
		return false;
		}
	}
}
