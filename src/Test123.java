public class Test123 {
public static void main(String[] args) {
String str1= new String("HELLO");
String str2 = new String("HELLO");
String str3=str2;
System.out.print(str1==str2);
System.out.print(str2.equals(str2));
System.out.print(str3==str2);
}
}