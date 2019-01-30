/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class MainClasss {
     //@param args the command line arguments
     //ArrayList a1 = new ArrayList();
     Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
       menu();

    }
    public static void menu(){
        System.out.println("options: ");
        int choice;
        arrayList a1 = new arrayList();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(" 1.Add \n 2.Add at any index \n 3.Clear \n 4.Contains \n 5.GetObj \n 6.GetIndex \n 7.RemoveObj \n 8.SetObj \n 9.Size \n 10.print \n 11.exit");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter the String");
                String s1 = sc.nextLine();
                s1 = sc.nextLine();
                a1.add(s1);
            }
            else if(choice == 2){
                System.out.println("Enter the String");
                String s1 = sc.nextLine();
                System.out.println("Enter the index");
                int index = sc.nextInt();
                
                a1.add(index,s1);
            }
            else if(choice == 3){
                a1.clear();
            }
            else if(choice == 4){
                System.out.println("Enter the String");
                String s1 = sc.nextLine();
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
                int index = a1.getIndex(s1);
                if(index != -1) System.out.println("Returned index: " + index);
                else System.out.println("onj doesn't exist!!!");
            }
            else if(choice == 7){
                System.out.println("Enter the index");
                int index = sc.nextInt();
                a1.removeObject(index);
            }
            else if(choice == 8){
                System.out.println("Enter the String");
                String s1 = sc.nextLine();
                System.out.println("Enter the index");
                int index = sc.nextInt();
                a1.setObject(index, s1);
            }
            else if(choice == 9){
                System.out.println("Size: " + a1.size());
            }
            else if(choice == 10) a1.print();
            else if(choice == 11) break;
            else System.out.println("Wrong input!!!");
        }
    }
}
}
