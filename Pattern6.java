public class Pattern6 {
    public static void nNumberTriangle(int n) {
        for(int j=0; j<n; j++){
            for(int k=1; k<=(n-j); k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
