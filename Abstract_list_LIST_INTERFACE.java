import java.util.*;

class Abstract_list_LIST_INTERFACE{
 public static void main(String[] Args)
 {
   AbstractList<String> list = new ArrayList<String>();
   
   list.add("1");
   list.add("2");
   list.add("3");
   list.add("4");
   list.add("5");
   list.add("6");
   list.add("7");
   list.add("8");
   list.add("9");
  
   System.out.println(list); 
   
   list.remove(3);
    System.out.println(list); 
   
   int lastIndex = list.lastIndexOf("A");
   System.out.println("LastIndex of A"+ lastIndex);
   
 
 }

}