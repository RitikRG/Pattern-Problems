public class Pattern19 {
    public static void symmetry(int n) {
        // upper half
        for(int i=1; i<=n; i++){
            // Left
            for(int j=n-i; j>=0; j--){
                System.out.print("* ");
            }
            // spaces
            for(int j=0; j<2*(i-1); j++){
                System.out.print("  ");
            }
            // right
            for(int j=n-i; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower half 
        for(int i=n; i>0; i--){
                        // Left
            for(int j=n-i; j>=0; j--){
                System.out.print("* ");
            }
            // spaces
            for(int j=0; j<2*(i-1); j++){
                System.out.print("  ");
            }
            // right
            for(int j=n-i; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
