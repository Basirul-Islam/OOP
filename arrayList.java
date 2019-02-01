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
        s = -1;
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
        int index;
        if(arr == null) System.out.println("NULL");
        else{
        try{
        for(int i=0;i<=size;i++){
            if(arr[i]!=null){
                index = i+1;
            System.out.println("Index: " + index + "    String: " + arr[i] + "  ");
            }
        }
        System.out.println();
        }catch(Exception e){
            
        }
        } 

    }
    public void add(String s1){
        
        try{
        s++;
        //arr[s] = null;
        if(s>=size)
        {              
                enlarge();
                arr[s]=s1;
        }
        else
        {             
                arr[s]=s1;
        }
        }catch(NullPointerException exception){
            //System.out.println("NullPointerException!!!");
            s = -1;
            size = 1;
            arr = new String[size];
            add(s1);
        }
    }

    public void add(int index, String s1){
   

        while(index>size)
        {
                enlarge();
                System.out.println("Your system has been enlarged");            
        }       
        s=index-1;
        if(index<=s)
        {
                for(int i=s;i>=index;i--)
                {
                        arr[i]=arr[i-1];
                }

                arr[index-1]=s1;
        }
        else
        arr[index-1]=s1;
    }
    public void clear(){
    s = -1;
    size = 1;
    arr = null;
    
    }
    public boolean contains(String s1){
      for(int i =0;i<size;i++){
          if(s1.equals(arr[i])) 
          //System.out.println("i am here");
          return true;
      }
     return false;
    } 
  
    public String getObject(int index){
        try{
      return arr[index-1];
        } catch (Exception exception) {
            return "ArrayIndexOutofBoundsException";
        }
    }
    public int getIndex(String s1){
     for(int i =0;i<size;i++){
          if(s1.equals(arr[i])) {
          //System.out.println("hjhhvh");
          return i+1;
          }
      }
     return -1;
    }
    public void removeObject(int index){
       /* s = s-1;
     for(int i = index;i<size;i++){
         arr[i-1] = arr[i]; 
         
       
     }*/
       arr[index-1] = null;
       s--;
    }
    public void setObject(int index,String s1){
        if(arr[index-1]==null)s++;
        arr[index-1] = s1;
    }
    
    public int size(){
        return s+1;
    }
}