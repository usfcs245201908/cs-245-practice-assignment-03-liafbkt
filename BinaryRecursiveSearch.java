public class BinaryRecursiveSearch implements Practice03Search{
    public String searchName(){
        return "Binary Recursive Search";
    }
    public int search(int [] arr, int target){
        return search2(arr, target, 0, arr.length - 1);
    }

    int search2 (int [] a, int target, int low ,int high){

        if (low > high) {
            return -1;
        }
        int mid = ( high + low)/2;
        if ( a [mid] == target){
            return mid;
        }
        if ( target > a [mid]){
            return search2 ( a, target, mid + 1, high);
        }
        else{
            return search2 ( a, target, low,mid - 1);
        }
    }
}
