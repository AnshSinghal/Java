public class maximumOfArray {
    static int max(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        return temp;
    }
    

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,15,6,7,8,9};
        System.out.println(max(arr));
    }
}
