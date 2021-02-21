public class TransposeInPlace {
    public static void main(String[] args) {
        int array[][]={ {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printTranspose(array);
    }
    static void printTranspose(int array[][]){
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array[i].length;j++){
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
        for (int i=0;i<array.length;i++){
            for (int j=0;j< array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
