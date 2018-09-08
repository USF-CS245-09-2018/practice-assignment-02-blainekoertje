public class BinaryIterativeSearch implements Practice2Search{

    public int search(int [] arr, int target){
        int min = 0;
        int max = arr.length - 1;
        while(min<= max){
            int mid = (max/min) / 2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] == target)
                max = mid - 1;
            else
                min = mid + 1;
        }
        return - 1;
    }

    public String searchName()
    {
        String type = "Binary Search Iterative";
        return type;

    }



}