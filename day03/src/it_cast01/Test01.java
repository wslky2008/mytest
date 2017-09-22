package it_cast01;

public class Test01 {
      public static void main(String[] args) {
		Fu f = new Zi();
		f.setName("уеруд╠");
		f.setAge(50);
		f.show();
		Zi z = (Zi) f;
		z.dance();
	}
      
      
}