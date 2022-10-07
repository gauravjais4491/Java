class Array {
    public void removeBadElements(int arr[], int n) {
        for (int i = 0; i <= n; i++) {
            if (arr[i] == -1) {
                arr[i] = -10;
                for (int j = i - 1; j >= 0; j++) {
                    if (arr[j] >= 0) {
                        arr[j] = -10;
                        break;
                    }
                }

            }
        }

        for (int i = 0; i < n; i++)
            if (arr[i] != -10) {
                System.out.println(arr[i] + " ");
            }
    }
   
}
class Three{
    public static void main(String[] args) {
        Array arr1=new Array();
        int arr[] = { 1, 2, 3, -1, -1, 4, 5, 6, -1, 0 };
        int N = (arr.length)/(arr[0]) ;
        arr1.removeBadElements(arr, N);
    }
}

