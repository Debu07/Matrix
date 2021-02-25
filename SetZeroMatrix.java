public class SetZeroMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,0,1,1},
                        {1,0,0,1},
                        {1,1,1,1},
                        {1,0,0,1}};
        setZeroes(matrix);
    }
    static void setZeroes(int matrix[][]){
        int col0=0;
        int r= matrix.length;
        int c= matrix[0].length;
        for(int i=0;i<r;i++){
            if(matrix[i][0]==0) col0=1;
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
                }
            }
        }
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=1;j--){
                if(matrix[i][0]==0||matrix[0][j]==0) matrix[i][j]=0;
                if(col0==0) matrix[i][0]=0;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
