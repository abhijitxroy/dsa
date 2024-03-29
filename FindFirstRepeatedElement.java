#Find first repeated elements from Array

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given: an array of N+1 integers that contains elements in the range [1, N].
// Find: any repeating number.
class Test {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 1, 4, 7, 8, 5 };

    int result = getRepeatedElementWithExtraMem(arr);
        if (result == 0) {
            System.out.println("No Repeated Element");
        } else {
            System.out.println("First Repeated Element: " + result);
        }

    }  
    private static int getRepeatedElementWithExtraMemorySpace(int[] arr) { // O(n)
            Map<Integer, Integer> map = new HashMap<>();
    
            for (int i : arr) {
                if (map.containsKey(i)) {
                    return i;
                } else {
                    map.put(i, 1);
                }
            }
            return 0;
        }
