public class SortedMatrixSearch {
    public static void main(String[] args) {

        int array[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int element=39;
        int index= findIndex(array,element);
        if(index==-1) System.out.println("Not found");
    }
    static int findIndex(int array[][],int element){
        int top=0,right=array[top].length-1;
        while(top<array.length && right>=0){
                if (element==array[top][right])
                {
                    System.out.println("("+top+","+right+")");
                    return 0;
                }
                else if(element>array[top][right]) top++;
                else right--;
        }
        return -1;
    }
}
