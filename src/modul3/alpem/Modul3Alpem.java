package modul3.alpem;

import java.io.*;
import java.util.*;

public class Modul3Alpem {
    public static void main(String[] args) throws IOException {
        BufferedReader inpNama = new BufferedReader(new InputStreamReader(System.in));
        Scanner inp = new Scanner(System.in);
        int n,pil;
        
        System.out.print("Enter number of names you want to enter : ");
        n = inp.nextInt();
        String name[] = new String[n];
        
        System.out.println("Enter all the names : ");
        for(int i=0;i<n;i++){
            name[i] = inpNama.readLine();
        }
        
        System.out.println("\nChoose Sorting type : \n1. Bubble Sort\n2. Selection Sort");
        System.out.print("Answer = ");
        pil = inp.nextInt();
        
        switch (pil) {
            case 1:
                BubbleSort bs = new BubbleSort();
                System.out.print("\nBefore Sorting : ");
                for(int x=0;x<n-1;x++){
                    System.out.print(name[x]+", ");
                }   System.out.println(name[n-1]+"\n");
                bs.sorting(n,name);
                break;
            case 2:
                SelectionSort ss = new SelectionSort();
                System.out.print("\nBefore Sorting : ");
                for(int x=0;x<n-1;x++){
                    System.out.print(name[x]+", ");
                }   System.out.println(name[n-1]+"\n");
                ss.sorting(n,name);
                break;
            default:
                System.out.println("Pilihan Salah!!!\n");
                break;
        }
    }
}
