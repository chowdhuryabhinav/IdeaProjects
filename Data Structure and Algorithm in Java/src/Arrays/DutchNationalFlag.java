package Arrays;

public class DutchNationalFlag {

    public void sortedArrayWith0s1s2sBetter(int a[]) {

        int low, mid, high;

        low = mid = 0;
        high = a.length - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    if (a[low] != a[mid]) {
                        int t = a[low];
                        a[low] = a[mid];
                        a[mid] = t;

                    }

                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:

                    if (a[mid] != a[high]) {
                        int t = a[mid];
                        a[mid] = a[high];
                        a[high] = t;
                    }

                    high--;

            }
        }

    }

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {

        DutchNationalFlag a = new DutchNationalFlag();
        int arr[] = {0, 1, 1, 0, 2, 2, 1, 0, 2};

        a.sortedArrayWith0s1s2sBetter(arr);

        a.printArray(arr);
    }

}
