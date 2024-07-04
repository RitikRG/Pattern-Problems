public class Pattern9 {
    public static void nStarDiamond(int n) {
        // upper triangle rows
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower triangle rows
        for(int i=n; i>0; i--){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
