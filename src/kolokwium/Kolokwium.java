package kolokwium;

import java.lang.Exception; // poziom 1
import java.io.IOException; // poziom 2
import java.io.StreamCorruptedException;
import java.net.MalformedURLException; //poziom 3 

public class Kolokwium {

	//7.
	public float aMethod(float a, float b) { return 0;
	 } 
	//public float aMethod(float a, float b) { return 0.0F;}
	//public void aMethod(float c, float d) throws Exception { }
	//public int aMethod(float a, float b) { return 0.0F;}
	//public float aMethod(float a, float b) throws Exception { return 0.0F;}
	private float aMethod(int a, int b, int c) {return 0.0F; }
	
	//8.
	public final boolean equals(Object o) { return true;}
	
	 //17.
	 //protected final abstract double d();
	 //abstract final double hypCos();
	 protected final static native Integer method();
	 transient volatile static int i = 41;
	 //static i = 1;
	 
	 
	static public void main1(String args[])
	{
		//1.
		String xa = "100.0"; String ya = new String("100");
		 if (xa.equals(ya)) {System.out.println("Equal a");} 
		 
		 String xb = new String("100"); String yb = new String("100");
		 if (xb==yb) {System.out.println("Equal b");}
		 
		int xc = 100; float yc = 100.0F;
		 if (xc==yc) {System.out.println("Equal c");}
		 
		String xd = "100"; String yd = new String("100");
		 if (xd==yd) {System.out.println("Equal d");}
		 
		Integer xe = new Integer(100); Integer ye = new Integer(100);
		 if (xe==ye) {System.out.println("Equal e");} 
		 
		 
		 
		 
		 //2.
		/* String s = "er";
		 ObjectInputStream in = new ObjectInputStream();
		 try {
			 URL u = new URL(s); // s zdefiniowany wczeœniej
			 Object o = in.readObject(); // in jest odnoœnikiem do ObjectInputStream
			 System.out.println("Sukces");
			 }
			 catch(MalformedURLException e) {
			 System.out.println("Z³y URL");
			 }
			 catch(StreamCorruptedException e) {
			 System.out.println("Nieprawid³owa zawartoœæ");
			 }
			 catch(IOException e) {
			 System.out.println("Z³apany wyj¹tek we/wy");
			 }
			 catch(Exception e) {
			 System.out.println("Z³apany wyj¹tek ogólny");
			 }
			 finally {
			 System.out.println("Wykonanie bloku finally");
			 }
			 System.out.println("Kontynuacja..."); */
		 
		 //3.
		 String str1="abc";
		 String str2="def";
		 String str3=str1.concat(str2);
		 str1.concat(str2);
		 System.out.println(str1);
		 
		 //4.
		 String x = "XXX"; int y = 9; x += y; x=x+"A";
		 String x1 = "10"; int y1 = 9; x1 = x1 + y1;
		 String x3 = null; int y3 = (x3!=null)&&(x3.length()>0) ? x3.length():0;
		 //String x4; int y4 = 1; x4 = x4 + y4;z³a
		 //String x5 = "10"; int y5 = 9; x5 -= y5;z³a
		 
		 //14.
		 int []c[];
		 //int d[5][5];
		 //int a[5][];
		 //int a[-1][];
		 //int d[5][-5]; 
		 
		 //15.
		 String s = "abcde"; // 1.
		 String s1 = new String ("abcde"); // 2.
		 if (s==s1) // 3.
			 s1 = null; // 4.
		 else if (s1.equals(s)) // 5.
			 s = null; // 6. 
		 System.out.println("s: "+s+" s1: "+s1);
		 
		 //19.
		 int i = 0, j = 1;
		 if((i == 0) || (j/i == 1))System.out.print("a");
		 if((i != 0) | (j/(double)i == 1))System.out.print("b");
		 //if((i != 0) & (j/i == 1))System.out.print("c");
		 if((i != 0) & (j/(double)i == 1))System.out.print("d");
		 //if((i == 0) | (j/i == 1))System.out.print("e");
		 
		 //20.
		 byte b = 5;
		 short sh = 3;
		 //byte result = b * ++sh;
		 int result1 = b * ++sh; 
		 float result2 = b * ++sh; 
		 double result3 = b * ++sh; 
		 long result4 = b * ++sh; 
		 
	}
}
