import java.util.Arrays;
public class Main {


    public static void main(String[] args) {
        int[]dizi={99,-2,-2121,1,0};
        // Yukarıdaki diziyi küçükten büyüğe sıralamasını yapcaz.
        for (int i=0;i< dizi.length;i++){
            for (int k=i+1;k< dizi.length;k++){
                if (dizi[i]>dizi[k]){
                    int temp=dizi[i];
                    dizi[i]=dizi[k];
                    dizi[k]=temp;
                }
          }
        }
      System.out.println(Arrays.toString(dizi));





        int[]dizi2={1000221,22,-1,99,0,254};
        // Yukarıdaki diziyi büyükten küçüğe sıralama
         for (int m=0;m< dizi2.length;m++){
             for (int n=m+1;n< dizi2.length;n++){
                 if (dizi2[n]>dizi2[m]) {
                     int temp2 = dizi2[m];
                     dizi2[m] = dizi2[n];
                     dizi2[n] = temp2;
                 }}}
        System.out.println(Arrays.toString(dizi2));


    }
}