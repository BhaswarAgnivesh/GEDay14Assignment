public class MergeSort {
    public static void main(String[] args) {
        String[] arr = {"ping", "bonk", "hurray", "yahoo", "boo"};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted List: " + java.util.Arrays.toString(arr));
    }
    private static void mergeSort(String[] a, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }
     private static void merge(String[] a, int lo, int mid, int hi) {
        String[] temp = java.util.Arrays.copyOf(a, a.length);

        int i = lo;      // ptr for left
        int j = mid + 1; // ptr for right
        int k = lo;      // ptr for arr

        while (i <= mid && j <= hi) {
            if (temp[i].compareTo(temp[j]) <= 0) {
                a[k++] = temp[i++];
            } else {
                a[k++] = temp[j++];
            }
        }
        while (i <= mid) a[k++] = temp[i++];
        while (j <= hi) a[k++] = temp[j++];
    }
}