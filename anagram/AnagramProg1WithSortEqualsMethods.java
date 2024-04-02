/** 
  https://javaconceptoftheday.com/anagram-program-in-java/

  1. Anagram Program In Java Using sort() and equals() Methods
*/

package anagram;

import java.util.Arrays;

/**
 * AnagramProg1 - Using sort() and equals() Methods
 */
public class AnagramProg1WithSortEqualsMethods {

    // private static String[] arr = {"CAT", "ACT" , "TAC", "TCA" ,"ATC" , "CTA"};

    public static void main(String[] args) {
        boolean result = isAnagram("Mother In Law", "Hitler Woman");
        System.out.println("isAnagram: "+ result);
    }

    private static boolean isAnagram(String str1, String str2){
        
        if(str1.length() != 0 &&  str2.length() != 0){

            str1 = str1.trim().replaceAll("\\s", "").toLowerCase();
            str2 = str2.trim().replaceAll("\\s", "").toLowerCase();

            if(str1.equals(str2)) return true;

            if(str1.length() != str2.length()){
                return false;
            }
            else{
                char[] sArr1 = str1.toCharArray();
                char[] sArr2 = str2.toCharArray();

                // sort and check equality
                Arrays.sort(sArr1);
                Arrays.sort(sArr2);

                return Arrays.equals(sArr1, sArr2);
            }
        }
        return false;
    }
}
