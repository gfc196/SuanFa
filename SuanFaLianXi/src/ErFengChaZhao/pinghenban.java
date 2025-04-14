package ErFengChaZhao;

public class pinghenban {
    public static void main(String[] args) {

    }
    public static int aaa (int[] a, int target){
     int i = 0;
     int j = a.length;
     while (1 < j - i){
         int m = (i + j) >>> 1;
         if(target < a[m]){
             j = m;
         }
         else {
             i = m;
         }
     }
     if(a[i] == target){
         return i;
     }
     return -1;
    }
}
