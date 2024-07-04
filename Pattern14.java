public class Pattern14 {
    public static void nLetterTriangle(int n) {
        // Rows
        for(int i = 1; i<=n; i++){
            int c=65;
            for(int j=1; j<=i; j++){
                System.out.print((char)c+" ");
                c++;
            }
            System.out.println();
        }

    }
}
