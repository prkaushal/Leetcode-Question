public class KadanesAlgorithm {
    
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,18,-5,4};
        int n = arr.length;
        int maxSum = sum3(arr, n);
        System.out.println("the maximum subarray is " + maxSum);

    }


    //  Given an integer array arr, find the contiguous subarray (containing at least one number) which
    // has the largest sum and returns its sum and prints the subarray.

    // brute force solution
    static int sum(int arr[] , int n){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i< n; i++){
            for(int j = i; j<n; j++){
                int sum = 0;
                for(int k= i; k<j; k++){
                    sum =+ sum + arr[k];
                }
                 max = Math.max(max, sum);
            }
        }
        return max;
    }


    //  in the above solution we were using 3 for loop and that was incrasing the time complexity by so much.
    // better solution for this problem 

    static int sum2(int arr[], int n){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i< n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
            sum += arr[j];
                
            max = Math.max(max, sum);
            }
        }
        return max;

    }


    // optimal solution to solve the problem 
    // in this solution we are using only 1 loop 

    static int sum3(int arr[] , int n){

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i< n; i++){
            sum += arr[i];

            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return max;
    }
}
