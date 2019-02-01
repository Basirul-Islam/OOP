
package list;

/**
 *
 * @author Asus
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainClasss {
     
     Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        
       menu();

    }
    public static void menu(){
        System.out.println("options: ");
        int choice = 0;
        arrayList a1 = new arrayList();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            
            System.out.println(" 1.Add \n 2.print \n 3.Clear \n 4.Contains \n 5.GetObj \n 6.GetIndex \n 7.RemoveObj \n 8.SetObj \n 9.Size \n 10.exit ");
            try{
            choice = sc.nextInt();
            }catch (InputMismatchException exception) {
            
            System.out.println("Throws Exception...InputMismatch!!!");
            menu();
        }
            if(choice == 1){
                System.out.println("Enter the String");
                String s1 = sc.nextLine();
                s1 = sc.nextLine();
                a1.add(s1);
            }
            /*else if(choice == 2){
                System.out.println("Enter the String");
                String s1 = sc.nextLine();
                s1 = sc.nextLine();
                System.out.println("Enter the index");
                int index = sc.nextInt();
                
                a1.add(index,s1);
            }*/
            else if(choice == 2) a1.print();
            else if(choice == 3){
                a1.clear();
            }
            else if(choice == 4){
                System.out.println("Enter the String");
                String s1 = sc.nextLine();
                s1 = sc.nextLine();
                boolean x = a1.contains(s1);
                if(x == true) System.out.println("true");
                else System.out.println("false");
            }
            else if(choice == 5){
                System.out.println("Enter the index");
                int index = sc.nextInt();
                System.out.println("Returned Obj: " + a1.getObject(index));
                //a1.getObject(index);
            }
            else if(choice == 6){
                System.out.println("Enter the String");
                String s1 = sc.nextLine();
                s1 = sc.nextLine();
                int index = a1.getIndex(s1);
                
                if(index != -1) System.out.println("Returned index: " + index);
                else System.out.println("obj doesn't exist!!!");
            }
            else if(choice == 7){
                System.out.println("Enter the index");
                int index = sc.nextInt();
                a1.removeObject(index);
            }
            else if(choice == 8){
                System.out.println("Enter the String");
                String s1 = sc.nextLine();
                s1 = sc.nextLine();
                System.out.println("Enter the index");
                int index = sc.nextInt();
                a1.setObject(index, s1);
            }
            else if(choice == 9){
                System.out.println("Size: " + a1.size());
            }
            
            else if(choice == 10) break;
            
            else System.out.println("Wrong input!!!");
        }
        
    }
}
