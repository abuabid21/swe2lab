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
public void sort(int ar[]){
    insetrionSort(ar);
}


public void insetrionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    

    
}
}