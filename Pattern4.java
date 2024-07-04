public class Pattern4 {
    public static void nTriangle(int n) {
        for(int j=1; j<=n; j++){
            for(int k =1;k<=j; k++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
