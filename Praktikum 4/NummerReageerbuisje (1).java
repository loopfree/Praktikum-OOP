import java.util.Stack;
import java.util.*;

// ANDA TIDAK BOLEH MENAMBAH, MENGURANGI, ATAU MENGUBAH NAMA ATRIBUT KELAS
class NummerReageerbuisje {
  private Stack<Integer> contents;      // Isi dari NummerReageerbuisje
  private int capacity;                 // Kapasitas maksimal dari NummerReageerbuisje
  private int filledCap;                // Berapa banyak angka yang telah mengisi NummerReageerbuisje
  
  public NummerReageerbuisje() {
    // Default konstruktor dengan capacity = 3
      contents = new Stack<Integer>();
      capacity = 3;
      filledCap = 0;
  } 

  public NummerReageerbuisje(int cap) {
    // Modified konstruktor dengan capacity = cap
      contents = new Stack<Integer>();
      filledCap = 0;
      capacity = cap;
  }

  public int getCapacity() {
    // getter atribut capacity
      return capacity;
  }

  public int getFilledCap() {
    // getter atribut filledCap
      return filledCap;
  }

  public void receiveOneSubstance(int substance) {
    // NummerReageerbuisje menerima satu "substance" yaitu angka yang masuk
	  if(filledCap >= capacity) return;
      contents.push(substance);
      filledCap += 1;
  } 

  public void pour(NummerReageerbuisje other) {
    // NummerReageerbuisje menuangkan isi dari contents ke NummerReageerbuisje other hingga other penuh
    // Note: Angka yang dituangkan terlebih dahulu adalah angka yang paling atas posisinya
      for(int i = other.filledCap; i < other.capacity; ++i) {
		  if(filledCap <= 0) {
			  break;
		  }
          other.receiveOneSubstance(contents.pop());
		  filledCap -= 1;
      }
  }

  public void pourAllContents() {
    // NummerReageerbuisje ditumpahkan sepenuhnya, sehigga contents kosong
    // Melakukan println untuk setiap elemen yang tumpah berurut dari yang paling awal tumpah
      while(contents.size() > 0) {
          int temp = contents.pop();
          System.out.println(temp);
      }
  }

  public void stirSwirl() {
    // contents dari NummerReageerbuisje menjadi terbalik urutannya
      Stack<Integer> reverse = new Stack<Integer>();
      while(contents.size() > 0) {
          reverse.push(contents.pop());
      }
      contents = reverse;
  }

  public void centrifuge() {
    // contents dari NummerReageerbuisje diurutkan berdasarkan nilai angkanya, 
    // dengan yang terbesar di paling bawah dan yang terkecil di paling atas
      ArrayList<Integer> temp = new ArrayList<Integer>();
      while(contents.size() > 0) {
          temp.add(contents.pop());
      }

      Collections.sort(temp);

      for(int i = temp.size() - 1; i >= 0; --i) {
          contents.push(temp.get(i));
      }
  }
}