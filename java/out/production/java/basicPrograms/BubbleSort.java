package out.production.java.basicPrograms;

public class BubbleSort {




      static   void bubbleSort(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        // swap temp and arr[i]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
        }

        // Prints the array
        static  void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver method to test above
        public static void main(String args[])
        {

            int arr[] = { 22,44,11,33,556,33,2,44 };
            bubbleSort(arr);
            System.out.println("Sorted array");
            printArray(arr);
        }


    }

