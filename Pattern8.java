public class Pattern8 {
    public static void nStarTriangle(int n) {
        // row
        for(int i =1; i<=n; i++){
            // spaces 
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*(n-i+1)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
