public class smaller {
    public static void main(String[] args) {
        int[] num={26,5,2,28,17,13};
        int small = num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]<small){
                small = num[i];
            }
        
        }
        System.out.println("Smallest element in this array is:"+small);


}
}
