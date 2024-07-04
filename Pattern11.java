public class Pattern11 {
    public static void nBinaryTriangle(int n) {
        // Lines
        for(int i=1; i<=n; i++){
            int k;
            if(i%2!=0){
                k=1;
            }else{
                k =0;
            }
            for(int j=1; j<=i; j++){
                System.out.print(k+" ");
                if(k==1){
                    k=0;
                }else{
                    k=1;
                }
            }
            System.out.println();
        }
    }
}
