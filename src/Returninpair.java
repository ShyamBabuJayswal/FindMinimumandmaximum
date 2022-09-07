public class Returninpair {
    class pair{
        long first,second;
     public  pair(long first, long second){
         this.first=first;
         this.second=second;
     }}
     public pair minmax(long [] arr,long n){
       long max=arr[0];
      long  min=arr[0];
         for(int i=0;i<n;i++){
             if(arr[i]>max){
                max=arr[i+1];
             }
             if(arr[i]<min){
                 min=arr[i];
             }
         }
         return  new pair(max,min);
     }
    }

