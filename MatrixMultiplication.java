public class MatrixMultiplication {
    public static void main(String[] args) {
        int r1=3,c1=3,r2=3,c2=3;
        int A[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int B[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int C[][]=new int[r1][c2];
        if(c1==r2){
            for(int i=0;i<C.length;i++){
                for(int j=0;j<C[i].length;j++){
                    int c_sum=0;
                    for (int k=0;k<c1;k++){
                        c_sum+=A[i][k]*B[k][j];
                    }
                    C[i][j]=c_sum;
                }
            }

            for (int i=0;i<C.length;i++){
                for(int j=0;j<C[i].length;j++){
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Matrix cannot be multiplied.");
        }
    }
}
