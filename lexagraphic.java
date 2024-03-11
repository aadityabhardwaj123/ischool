import java.util.Scanner;

public class lexagraphic {

 //    public static String getSmallestAndLargest(String s, int k) {
//     String smallest = "";
//     String largest = "";
//     smallest = largest = s.substring(0, k);
// 
//     for (int i=1; i<s.length()-k+1; i++) {
//         String substr = s.substring(i, i+k);
//         if (smallest.compareTo(substr) > 0)
//             smallest = substr;
//         if (largest.compareTo(substr) < 0)
//             largest = substr;
//     }
// 
//     return smallest + "\n" + largest;
// }
//         
//         // Complete the function
//         // 'smallest' must be the lexicographically smallest substring of length 'k'
//         // 'largest' must be the lexicographically largest substring of length 'k'
//          
//         
// 
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String s = scan.next();
//         int k = scan.nextInt();
//         scan.close();
//       
//         System.out.println(getSmallestAndLargest(s, k));
//     }

public static void main(String[] argh)
{
   Scanner sc = new Scanner(System.in);
    String s1 = "always";
   int k = sc.nextInt();
   String smallest = "";
   String largest = "";
   
   smallest = largest = s1.substring(0,k);
   
   for(int i=1; i < s1.length()-k+1 ; i++)
   {

           String substr =  s1.substring(i, i+k);
          if(smallest.compareTo(substr) > 0)
          {
            smallest = substr;
          }
          if(largest.compareTo(substr) < 0)
          {
            largest = substr;
          }
   }
   
    System.out.println(largest+"  "+smallest);
   
}



}