# 0's and 1's bifurcation


/**
 * 0's and 1's bifurcation
 */
public class Bifurcation {

    public static void main(String[] args) {
        int arr[] = {1,0,1,0,0,1,0,0,0,1,1,0};
        for(int a : arr ) System.out.print( a + " ");
        System.out.println();
        

        int slow = 0;
        int fast = slow +1;
        int n = arr.length-1;

        int count = 0;

        while(fast <= n){
            count++;
            if(arr[slow] == 0 && arr[fast] == 1){
                int t = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = t;
                fast++;
                slow++;
            }
            else if(arr[slow] == 0 && arr[fast] == 0){
                fast++;
            }
            else if(arr[slow] == 1 && arr[fast] == 1){
                slow++;
            }
            else{
                fast++;
                slow++;
            }
        }
        for(int a : arr ) System.out.print(a + " ");
        System.out.println();
        System.out.println("Count: " + count);
    }
}
