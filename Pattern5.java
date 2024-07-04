public class Pattern5 {
    public static void seeding(int n) {
        for(int j=0; j<n; j++){
            for(int k=0; k<(n-j); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
