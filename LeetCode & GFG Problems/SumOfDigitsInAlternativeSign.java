class Solution {

    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
        System.out.println(alternateDigitSum(111));
        System.out.println(alternateDigitSum(886996));
        System.out.println(alternateDigitSum(10));
        System.out.println(alternateDigitSum(8521));
        System.out.println(alternateDigitSum(12231));
    }
    public static int alternateDigitSum(int n) {
        int sum=0;
        int i=2;
        int res=0;
        while(n>0){
            int rem = n%10;
            res=res*10+rem;
            n/=10;
        }
        System.out.println(res+" Result");
        while(res>0){
            int rem = res%10;
            System.out.println("Checking "+rem+" "+i);
            if((i%2==0)){
                sum+=rem;
            }
            else{
                sum-=rem;
            }
            res=res/10;
            i++;
        }

        return sum;
    }
}