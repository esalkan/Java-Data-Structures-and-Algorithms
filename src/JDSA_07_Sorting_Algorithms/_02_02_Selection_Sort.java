package JDSA_07_Sorting_Algorithms;

import java.util.Arrays;

public class _02_02_Selection_Sort {

    // Sıralama algoritmalarının gerçekleştirilmesi;
    // 1. Seçerek sıralama (Selection sort) algoritması:
    private static int[] arr={7,2,9,6,8,3,1,5}; // Dizi tanımlama

    // Swap fonksiyonunun görevi, dizinin i. ve j. elemanlarını yer değiştirmektir.
    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    // Seçerek sıralama (Selection sort) algoritması:
    // Bu algoritma, dizinin en küçük elemanını bulup, dizinin başına yerleştirir.
    // Dizinin kalan kısmı için bu işlemi tekrarlar.
    public static void selectionSort(int[] arr) {
        int i,j,min,temp;
        for(j=0; j < arr.length-1; j++){
            min=j;
            for(i=j+1; i < arr.length; i++)
                if(arr[i] < arr[min]) min=i;
            if(j!=min) swap(arr,j,min);
        }
    }

    // Sıralama algoritmalarının gerçekleştirilmesi;
    public static void main(String args[]){
        selectionSort(arr);
        System.out.println("Selection Sort: " + Arrays.toString(arr));
    }
}
