package modul3.alpem;

public class BubbleSort {
    void sorting(int n, String name[]){
        int jml = n;
        String mess,temp;
        
        for(int a=0;a<jml;a++){
            System.out.println("Iteration "+(a+1)+":");
            for(int x=0;x<jml-1;x++)
                System.out.print(name[x]+", ");
            System.out.print(name[jml-1]);
            
            System.out.print("\t\tCompare "+name[0]+" with "+name[1]+"\n");
            for(int b=0;b<jml-1;b++){
                mess = "\t\tStill\n";
                if(name[b].compareTo(name[b+1])>0){
                    mess = "\t\t"+name[b]+" swap with "+name[b+1]+"\n";
                    temp = name[b];
                    name[b] = name[b+1];
                    name[b+1] = temp;
                }
                
                if(b<jml-(a+1)){
                    for(int c=0;c<jml-1;c++)
                        System.out.print(name[c]+", ");
                    System.out.print(name[jml-1]);
                    System.out.print(mess);
                }
            }
            System.out.println("");
        }
        
        System.out.print("Names in Sorted Order : ");
        for(int x=0;x<jml-1;x++){
            System.out.print(name[x]+", ");
        }
        System.out.print(name[jml-1]+"\n");
    }
}