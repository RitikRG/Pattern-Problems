public class Pattern13 {
    public static void nNumberTriangle(int n) {
        int k =1;
        // rows
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
