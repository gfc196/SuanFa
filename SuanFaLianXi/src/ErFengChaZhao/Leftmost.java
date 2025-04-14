package ErFengChaZhao;

public class Leftmost {
    public static void main(String[] args) {

    }
    public static int  aaa(int[] a, int target){
        int i = 0;
        int j = a.length-1;
        int candidate = -1;
        while(i <= j){
            int m = (i+j) >>> 1;
            if(a[m] < target) {
                i = m+1;
            }
            else if(a[m] > target) {
                j = m-1;
            }
            else {
                //记录候选位置
                candidate = m;
                j = m - 1;
            }

        }
        return candidate;
    }


    //a 待查找的升序数组
    //target 待查找的目标值

    //returns ：返回 >= target 的最靠左的索引
    public static int  bbb(int[] a, int target){
        int i = 0;
        int j = a.length-1;
        int candidate = -1;
        while(i <= j){
            int m = (i+j) >>> 1;
          if(target <= a[m]){
              j = m-1;
          }
          else {
              i = m+1;
          }

        }
        return i;
        //最右返回i - 1   返回 =< target 的最靠右的索引
    }
}
