package ErFengChaZhao;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Testjavacharu {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int target = 5;
        int i = Arrays.binarySearch(a, target);
        System.out.println(i);

        //-2 = -插入点 - 1

        if(i < 0){
            int insertIndex = Math.abs(i + 1);
            int[] b = new int[a.length + 1];
            System.arraycopy(a, 0, b, 0, insertIndex);
            b[insertIndex] = target;
            System.arraycopy(a, insertIndex, b, insertIndex + 1, a.length - insertIndex);
            System.out.println(Arrays.toString(b));
        }
    }

}
