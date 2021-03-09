public class SHA_
{
   public static void main (String [] args)     
   {
      int t = 31;
      for(int i = 0; i<40; i++)
      {
         System.out.println("Rotate left " + i +" times");
         int r = rotateLeft (t, i);
         display (r);
      }
   }
   
   public static int rotateLeft(int v, int s)
   {
     for(int i = 0; i <s;i++)
     {
      v= (v*2) | ((v>>31) & 1);
     }
     return v;
   }
   
   public static void display(int v)
   {
      String d="";
      for(int i=0; i<32; i++) 
      {
         d = "" + (v & 1) +d;
         v = v >>> 1;
      }
      System.out.println(d);
   }
}