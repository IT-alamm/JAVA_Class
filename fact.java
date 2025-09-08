public class fact {
    public static int printFact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = printFact(n-1);
        int fn = n*fnm1;
        return fn;
    }

    public static void printInc(int n){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.println(n);

    }
    public static void printDec(int n){
        if(n==0){
            return ;
        }
        System.out.println(n +" ");
        printDec(n-1);
    }

    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = printFact(n);
        System.out.println(ans);
        printInc(n);
        printDec( n);
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
    
}
