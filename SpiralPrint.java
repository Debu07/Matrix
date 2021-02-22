public class SpiralPrint {
    public static void main(String[] args) {
        int array[][]={ {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int rows=4,columns=4;
        printSpiral(array,rows,columns);
    }
    static void printSpiral(int array[][],int R,int C){
        int top=0,left=0;
        int right=C-1,bottom=R-1;
        while (top<=bottom && left<=right){
            for (int i=left;i<=right;i++){
                System.out.print(array[top][i]+" ");
            }
            top++;
            for (int i=top;i<=bottom;i++){
                System.out.print(array[i][right]+" ");
            }
            right--;
            if (top<=bottom){
                for (int i=right;i>=left;i--){
                    System.out.print(array[bottom][i]+" ");
                }
                bottom--;
            }
            if (left<=right){
                for (int i=bottom;i>=top;i--){
                    System.out.print(array[i][left]+" ");
                }
                left++;
            }
        }

    }
}
