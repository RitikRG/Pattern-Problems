public class Pattern12 {
    public static void numberCrown(int n) {
        // rows
        for(int i=1; i<=n; i++){
            // left triangle 

            // Numbers 
            for(int j =1; j<=i; j++){
                System.out.print(j+" ");
            }
            // Spaces
            // for(int j=1; j<=(n-1); j++){
            //     System.out.print("  ");
            // }

            // Right triangle 

            // Spaces
            // for(int j=1; j<=(n-1); j++){
            //     System.out.print("  ");
            // }

            // Alternatively we can simply double the spaces
            for(int j=1; j<=2*(n-1); j++){
                System.out.print("  ");
            }
            // Numbers
            for(int j=i; j>0; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
