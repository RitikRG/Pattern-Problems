public class Pattern15 {
    public static void nLetterTriangle(int n) {
        // Rows
        for(int i=n; i>0; i--){
            int c=65;
            for(int j=1; j<=i; j++){
                System.out.print((char)c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
