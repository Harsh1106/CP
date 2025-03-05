public class CountTotalNumberofColoredCells{
    public static long coloredCells(int n){
        return 1 + (long) 2 * n * (n - 1);
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(coloredCells(n));
    }
}