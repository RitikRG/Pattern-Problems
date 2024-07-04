public class Pattern16 {
    public static void alphaRamp(int n) {
        int c=65;
        for(int i =1; i<=n; i++){
            for(int j= 1; j<=i; j++){
                System.out.print((char)c+" ");
            }
            c++;
            System.out.println();
        }
    }
}
