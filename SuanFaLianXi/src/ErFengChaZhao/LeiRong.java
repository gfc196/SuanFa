package ErFengChaZhao;

import java.lang.annotation.Target;

public class LeiRong {
    public static void main(String[] args) {

        /*  a:待查找的升序数组
        target:待查找的目标值

        找到则返回目标值的索引
        找不到则返回-1
        * */
    }
    public int aaa(int[] a, int target){
        int i = 0;
        int j = a.length-1;//设置指针和初值

        while(i<=j){    //i-j范围有东西
            int m = (i+j) >>> 1;
            if(a[m] < target)   //目标值在右半边
            {i = m+1;}
            else if(a[m] > target)  //目标值在左半边
            {j = m-1;}
            else                  //找到了
            {return m;}

        }
        return -1;


    }
}
