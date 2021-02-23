public class WavePrint {
    public static void main(String[] args) {
        int array[][]={ {1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                          {13,14,15,16}};
        printWave(array);
    }
    static void printWave(int array[][]){
        int left=0;
        while(left< array.length){
            if(left%2==0){
                for(int i=0;i< array.length;i++){
                    System.out.print(array[i][left]+" ");
                }
                System.out.print("| ");
            }
            else{
                for(int i=array.length-1;i>=0;i--){
                    System.out.print(array[i][left]+" ");
                }
                System.out.print("| ");
            }
            left++;
        }
    }
}
