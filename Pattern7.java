public class Pattern7 {
    public static void nStarTriangle(int n) {
        // rows
        for(int i = 1; i<=n; i++){
            // Spaces
            for(int j = 1; j<=n-i; j++){
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
