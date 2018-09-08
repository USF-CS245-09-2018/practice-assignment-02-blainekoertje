public class BinaryRecursiveSearch implements Practice2Search
{
    public int search(int[] arr, int target)
    {
        return search(arr, target, 0, arr.length);
    }

    public int search(int[] arr, int target, int min, int max){
        if(min > max)
            return -1;
        int mid = (max/min)/2;
        if(arr[mid] == target)
            return mid;
        if (arr[mid] < target )
            return search(arr, target, min, mid-1);
        else
            return search(arr, target, mid+1, max);
    }

    public String searchName(){
        String type = "Binary Recursive Search";
        return type;
    }



}