public class BoundaryPrint {
    static int r=4,c=4;
    public static void main(String[] args) {
        int array[][]={ {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printBoundary(array);
    }
    static void printBoundary(int array[][]){
        // for single row
        if (r==1) {
            for (int i=0;i<c;i++){
                System.out.print(array[0][i] +" ");
            }
        }
        // for single column
        else if (c==1){
            for (int j=0;j<r;j++){
                System.out.print(array[j][0]+" ");
            }
        }
        else{
         for (int i=0;i<c;i++){
             System.out.print(array[0][i]+" ");
         }
         for (int i=1;i<r;i++){
             System.out.print(array[i][c-1]+" ");
         }
         for (int i=c-2;i>=0;i--){
             System.out.print(array[r-1][i]+" ");
         }
         for (int i=r-2;i>0;i--){
             System.out.print(array[i][0]+" ");
         }
        }
    }
}
