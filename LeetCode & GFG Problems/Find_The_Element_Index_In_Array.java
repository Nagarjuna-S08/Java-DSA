class Find_The_Element_Index_In_Array{
    public static void main(String[] argv){
        int[] a={1,2,5,7,8,10,12,14,16,23,25,29,32,35,38,42};
        int target =0;

        FindIndex(a,target);
    }

    static void FindIndex(int[] a,int target){
        int str=0;
        int end=a.length-1;
        boolean flag=false;
        if(a[0] > target){
            System.out.println("Place The Element Before "+a[0]);
            flag=true;
        }
        while (str<=end && !flag) {
            int mid = str + (end-str)/2;

            if(a[mid]==target){
                flag=true;
                System.out.println("The Element In the Index of "+mid);
                break;
            }
            if(a[mid]>target){
                end=mid-1;
            }
            else{
                str=mid+1;
            }
        }
        if(!flag && str < a.length-1){
            System.out.println("The element between "+a[str-1]+" "+a[str]);
        }
        else if(!flag && str >= a.length-1){
            System.out.println("After the "+a[str-1]);
        }

    }
}