import java.util.*;
public class oneToN{
    public static void print(int i, int n){
        if(i > n) return;
        System.out.print(i+" ");
        print(i + 1, n);
    }
  public static void printNos(int N)
    {
        print(1, N);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n);
        sc.close();
    }
}