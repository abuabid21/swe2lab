public class Sorter {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public void selectionsort(String arr[]){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++)
    {
        int min_index = i;
        String minStr = arr[i];
        for(int j = i + 1; j < n; j++)
        {        
            if(arr[j].compareTo(minStr) < 0)
            {
                minStr = arr[j];
                min_index = j;
            }
        }
    if(min_index != i)
    {
        String temp = arr[min_index];
        arr[min_index] = arr[i];
        arr[i] = temp;
    }
    }
}

public void sort(String arr[]){
    selectionsort(arr);
}

    

    
}
