package BinarySearch;

class SingleNumber{

    //SquareRoot number

    public static int square(int n){
        int start = 1;
        int end = n/2;
        int ans=1;

        while(start<end){
            int mid = start+(end-start)/2;
            long square = (long)mid*mid;

            if(square==n){
                return mid;
            }
            else if(square <n){

                //Because to return the possible floor value
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    //Nth root 
    public static int  nroot(int n, int m){

        int start = 1;
        int end = m;

        while(start<=end){
            int mid = start +(end-start)/2;

            double val = Math.pow(mid,n);

            if(val == m){
                return mid;
            }
            else if(val<m){
                start = mid+1;
                        }
            else{
                end = mid-1;
            }        
        }
        return -1;

    }
    //smallest divisor
    //Bruete
    //is based on a simple mathematical rule: you cannot multiply two numbers that are both greater than \(\sqrt{n}\) and get n
    public static int div(int n){
        if(n<=1){
            return -1;
        }

        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return i;
            }
        }
        return n;
    }

    //Binary Method
    /*Given an array of positive integers nums and a positive integer threshold, find the smallest positive integer divisor such that:
              1. You divide every number in nums by this divisor and round each result up to the nearest whole number.
              2. The sum of all those rounded results is less than or equal to threshold*/

        public static int divs(int[] nums, int k){

            int start =1;
            int end =0;

            for(int num : nums){
                end  = Math.max(end, num);
            }

            int ans = end;

            while(start<=end){
                int mid = start+(end-start)/2;

                int sum =0;
                for(int num : nums){
                    sum +=(num+mid-1)/mid;
                }

                if(sum<=k){
                    ans = mid;
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            return ans;
        }
            

  
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int ans =0;

        for(int num : arr){
            ans^=num;
        }

        System.out.println(ans);

        System.out.println(square(28));

        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println(divs(nums, threshold));
    }


}