public class Pattern20 {
    public static void symmetry(int n) {
        // Upper half
        for(int i =1; i<=n; i++){
            // left
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // spaces
            for(int j=0; j<2*(n-i); j++){
                System.out.print("  ");
            }
            // right
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for(int i=n-1; i>0; i--){
            // left
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // spaces
            for(int j=0; j<2*(n-i); j++){
                System.out.print("  ");
            }
            // right
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
