public class MyHeap {

  private static void pushDown(int[]data,int size,int index) {
    int swap = data[index];
    if (index >= size /2 ) {
      return;
    }
    else if (swap > data[2 * index]) {
      data[index] = data[2 * index];
      data[2 * index] = swap;
      pushDown(data,size,2 *index);
    }
    else if (swap > data[(2 * index) + 1]) {
      data[index] = data[(2 * index) + 1];
      data[(2 * index) + 1] = swap;
      pushDown(data,size,(2*index)+1);
    }
  }
  /*   - size  is the number of elements in the data array.
     - push the element at index i downward into the correct position. This will swap with the larger of the child nodes provided thatchild is larger. This stops when a leaf is reached, or neither child is larger. [ should be O(logn) ]
     - precondition: index is between 0 and size-1 inclusive
     - precondition: size is between 0 and data.length-1 inclusive.
  */
  private static void pushUp(int[]data,int index) {
    int swap = data[index];
    if (swap > data[(index-1)/2]) {
      data[index] = data[(index-1)/2];
      data[(index-1)/2] = swap;
      pushUp(data,(index-1)/2);
    }
  }
  /*   - push the element at index i up into the correct position. This will swap it with the parent node until the parent node is larger or the root is reached. [ should be O(logn) ]
     - precondition: index is between 0 and data.length-1 inclusive.
  */
  public static void heapify(int[] data) {
    for (int x = data.length -1; x > -1; x--) {
      pushUp(data,x);
    }
  }
  //  - convert the array into a valid heap. [ should be O(n) ]

  public static void heapsort(int[] data) {
    heapify(data);
    for (int x = 0; x < data.length-1; x++) {
      int y = data[x];
      data[data.length - x] = data[x];
      data[
    }
  }
  //  - sort the array by converting it into a heap then removing the largest value n-1 times. [ should be O(nlogn) ]

}
