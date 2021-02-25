public class SearchInMatrix {
    public static void main(String[] args) {
        int array[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target=11;
        if (matrixBinarySearch(array,target)) System.out.println("Element Found");
        else System.out.println("Not Found");
    }
    static boolean matrixBinarySearch(int array[][],int target){
        int rows= array.length;;
        int columns=array[0].length;
        int low=0;
        int high=(rows*columns)-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(array[mid/columns][mid%columns]==target) {
                System.out.println("present at -> ("+mid/columns+","+mid%columns+")");
                return true;
            }
            else if(array[mid/columns][mid%columns]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}
