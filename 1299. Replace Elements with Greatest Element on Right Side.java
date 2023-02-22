public int[] replaceElements(int[] arr) {
          
    int max = -1; // All elements in the input range are positive. Otherwise, it can be modified slightly
    
    for (int i = arr.length - 1; i >= 0; i--)
    {
        int temp = arr[i];
        arr[i] = max; 
        max = Math.max(max, temp);
    }
    return arr;
}




