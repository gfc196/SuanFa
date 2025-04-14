package ErFengChaZhao;

public class LeiRong2 {
    public static void main(String[] args) {

        /*  a:待查找的升序数组
        target:待查找的目标值

        找到则返回目标值的索引
        找不到则返回-1
        * */
    }
    public int aaa(int[] a, int target){
        int i = 0;
        int j = a.length;

        while(i < j - i){
            int m = (i+j) >>> 1;
            if(a[m] > target)
            {j = m;}
            else
            {i = m;}

        }
    if (a[i] == target){
        return i;
    }
    return -1;


    }
}
