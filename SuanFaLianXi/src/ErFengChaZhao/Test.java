package ErFengChaZhao;

public class Test {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 6, 7, 8, 9, 10};
      Leftmost k2 = new Leftmost();
        System.out.println(k2.aaa(a, 4));
        System.out.println(k2.aaa(a, 3));
        System.out.println(k2.aaa(a, 8));
        System.out.println(k2.aaa(a, 7));
        System.out.println(k2.aaa(a, 2));
        System.out.println("---------------------------");
        System.out.println(k2.aaa(a, 23));
        System.out.println(k2.aaa(a, 22));
        System.out.println(k2.aaa(a, 24));
        System.out.println(k2.aaa(a, -1));
    }
}
