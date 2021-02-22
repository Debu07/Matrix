public class RotationClockWise {
    public static void main(String[] args) {

        int array[][]={ {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int rows=4,columns=4;
        rotateMatrix(array,rows,columns);
    }
    static void rotateMatrix(int array[][],int r,int c){
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("STEP-I: Transpose.");
        for(int i=0;i<c;i++){
            for(int j=i+1;j<r;j++){
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("STEP-II: Interchange Columns");

        for (int i=0;i<r;i++){
            int left=0,right=c-1;
            while(left<right){
                int temp=array[i][right];
                array[i][right]=array[i][left];
                array[i][left]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
