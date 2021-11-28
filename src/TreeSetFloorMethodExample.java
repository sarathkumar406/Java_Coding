import java.util.TreeSet;
public class TreeSetFloorMethodExample
{
   public static void main(String[] args)
   {
      try
      {
         TreeSet<Integer> ts = new TreeSet<Integer>();
         ts.add(50);
         ts.add(60);
         ts.add(70);
         ts.add(80);
         System.out.println("Given TreeSet: " + ts);
         // get floor value for 65 using floor() method
         int value = ts.floor(55);
         int valueCiel = ts.ceiling(80);
         int valueHigher = ts.higher(60);
         // print floor value
         System.out.println("Floor value for 65 is : " + value);
         System.out.println("Cieling value for 65 is : " + valueCiel);
         System.out.println("valueHigher value for 65 is : " + valueHigher);
      }
      catch(NullPointerException ex)
      {
        ex.printStackTrace();
      }
   }
}