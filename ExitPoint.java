public class ExitPoint {
    public static void main(String[] args) {
        int array[][]={{0,0,1,0},
                        {1,0,0,0},
                        {0,0,0,0},
                        {1,0,1,0}};
        findExitPoint(array);
    }
    static void findExitPoint(int array[][]){
        int dir=0;  // east->0, south->1, west->2, north->3
        int i=0,j=0;
        while(true){
            dir=(dir+array[i][j])%4;
            if (dir==0) j++;
            if (dir==1) i++;
            if (dir==2) j--;
            if (dir==3) i--;
            if(i<0){
                i++;
                break;
            }
            else if (j<0){
                j++;
                break;
            }
            else if (i== array.length){
                i--;
                break;
            }
            else if(j==array[0].length){
                j--;
                break;
            }
        }

        System.out.print("array["+i+","+j+"]");
    }
}
