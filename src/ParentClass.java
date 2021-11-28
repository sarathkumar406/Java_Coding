import java.io.IOException;
class ParentClass 
{  
   void color()
   {
       System.out.println("Red");
   }  
}
class ChildClass extends ParentClass {
   //It throws a checked exception
   void color() throws IOException
   {
       System.out.println("White");
   }  
   public static void main(String args[]){  
       ParentClass obj = new ChildClass();  
       obj.color(); 
   } 
}