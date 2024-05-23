package Sorting;

public class selection {
    public static void main(String[] args) {
        int a[]={67,17,37,87,21};
        int l=a.length;

        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                int s=a[i];
                if(a[j]<s){
                    a[i]=a[j];
                    a[j]=s;
                }
            }
        }
        
        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
    }
}
