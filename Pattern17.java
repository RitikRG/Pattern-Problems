public class Pattern17 {
    public static void alphaHill(int n) {
        // rows
        for(int i=1; i<=n; i++){
            int c=65;
            // spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // Letters-left
            for(int j=1; j<=i; j++){
                System.out.print((char)c+" ");
                c++;
            }
            // Letters-right
            c-=2;
            for(int j=i-1; j>0; j--){
                System.out.print((char)c+" ");
                c--;
            }
            System.out.println();
        }
    }
}
