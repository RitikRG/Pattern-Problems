public class Pattern18 {
    public static void alphaTriangle(int n) {
        for(int i=1; i<=n; i++){
            int c = 64+n;
            for(int j=1; j<=i; j++){
                System.out.print((char)c+" ");
                c--;
            }
            System.out.println();
        }
    }
}
