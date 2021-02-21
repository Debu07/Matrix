public class Transpose {
    public static void main(String[] args) {
        int array[][]={ {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        printTranspose(array);
    }
    static int r=4,c=4;
    static void printTranspose(int array[][]){
        int temp[][]=new int[r][c];
        for (int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                temp[i][j]=array[j][i];
            }
        }
        for (int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }

    }
}
