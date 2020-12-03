public class sorting012 {
    public static void main(String[] args) {
        int[] a = {1,2,1,0,1,2};
        sort012(a, 6);
        for(int i=0;i<6;i++){
            System.out.println(a[i]);
        }
    }
    public static void sort012(int a[], int n){
        // code here 
        int i,c0,c1,c2;
        c0=c1=c2=0;
        for( i=0;i<a.length;i++){
            if(a[i]==0){
                c0++;
            }
            else if(a[i]==1)
                c1++;
            else
                c2++;
        }
        for( i=0;i<c0;i++){
            a[i]=0;
        }
        for(;i<c1+c0;i++){
            a[i]=1;
        }
        for(;i<c0+c1+c2;i++){
            a[i]=2;
        }
    }
}
