package modul3.alpem;

public class SelectionSort {    
    void sorting(int n, String name[]){
        int jml = n;
        String temp,mess;
        
        for(int x=0;x<jml-1;x++){
            System.out.println("Iteration "+(x+1)+":");
            for(int a=0;a<jml-1;a++)
                System.out.print(name[a]+", ");
            System.out.print(name[jml-1]);
            System.out.print("\t\tIs "+name[x]+" in right position?\n");
            
            boolean tukar=false;
            int index=0;
            String min = name[x];
            mess="\t\tStill\n";
            for(int y=x+1;y<jml;y++){
                if(min.compareTo(name[y])>0){
                    tukar = true;
                    index = y;
                    min = name[y];
                }
            }
            
            if(tukar==true){
                mess="\t\t"+name[x]+" swap with "+name[index]+"\n";
                temp = name[x];
                name[x] = name[index];
                name[index] = temp;
            }
            
            for(int y=0;y<jml-1;y++)
                System.out.print(name[y]+", ");
            System.out.print(name[jml-1]);
            System.out.print(mess);
            System.out.println("");
        }
        
        System.out.print("Names in Sorted Order : ");
        for(int x=0;x<jml-1;x++){
            System.out.print(name[x]+", ");
        }
        System.out.print(name[jml-1]+"\n");
    }
}
