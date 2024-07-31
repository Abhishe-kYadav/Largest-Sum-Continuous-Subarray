import java.util.*;
public class MaxSubArray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
       sum(arr);
    }
    static void sum(int arr[]){
       int maxsum=Integer.MIN_VALUE,cursum=0,start=0,end=0,s=0;
       for(int i=0;i<arr.length;i++){
          cursum=cursum+arr[i];
          if(maxsum<cursum){
              maxsum=cursum;
              start=s; 
              end=i;
            }
          
          if(cursum<0){
            cursum=0;
             s=i+1;  
          }
        }

        System.out.println(maxsum); 
        System.out.println("start index " + start); 
        System.out.println("end index " + end);  
    }
}
