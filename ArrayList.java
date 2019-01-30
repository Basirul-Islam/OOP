package list;

import java.util.Scanner; 
import static java.nio.file.Files.delete;
import java.util.*;
public class arrayList {
    
  public int s;  
  public  int size;
  String[] arr; 
  Scanner sc = new Scanner(System.in);
    arrayList()
    {
        s = 0;
        size = 1;
        //Scanner sc = new Scanner(System.in);
        arr = new String[size];
    }
    
    public void enlarge (){       
        String[] newArr = new String [size*2];

        for(int i=0;i<s;i++)
        {
                newArr [i] = arr [i];
        }

        arr = newArr;
        //

        size = size * 2;
    }
    public void shrink(){
       String[] newArr = new String [size/2];

        size = size/2;
        for(int i=0;i<s;i++)
        {
                newArr [i] = arr[i];
        }

        arr = newArr;
        //delete [] a;
  
    }
    public void print(){

        for(int i=0;i<s;i++) 
            System.out.print(arr[i] + "  ");
        System.out.println();
        

    }
    public void add(String s1){
        //String s1;
        s++;
        if(s>size)
        {
                System.out.println("Your system has been enlarged");
                enlarge();
                //System.out.println("Enter the String");
                //s1 = sc.nextLine();
                arr[s-1]=s1;

        }
        else
        {
                //System.out.println("Enter the String");
                //s1 = sc.nextLine();
                arr[s-1]=s1;
            System.out.println("s-1 " + (s-1));

        }
    }

    public void add(int index, String s1){
   

        if(index>size)
        {
                enlarge();
                System.out.println("Your system has been enlarged");
        }       

        
        s++;


        if(index<=s)
        {
                for(int i=s-1;i>=index;i--)
                {
                        arr[i]=arr[i-1];
                }

                arr[index-1]=s1;
        }
        else
        arr[index-1]=s1;
    }
    public void clear(){
    s = 0;
    size = 1;
    arr = null;
    
    }
    public boolean contains(String s1){
      for(int i =0;i<size;i++){
          if(arr[i] == s1) return true;
      }
     return false;
    } 
  
    public String getObject(int index){
      return arr[index-1];
    }
    public int getIndex(String s1){
     for(int i =0;i<size;i++){
          if(arr[i] == s1) return i+1;
      }
     return -1;
    }
    public void removeObject(int index){
     for(int i = index;i<size;i++){
         arr[i-1] = arr[i]; 
     }
    }
    public void setObject(int index,String s1){
        arr[index-1] = s1;
    }
    
    public int size(){
        return size;
    }
}
