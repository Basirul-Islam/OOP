/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Bashir
 */
import java.util.*;
import java.util.Scanner; 
public class Bank {

    private String BankName;
    
    ArrayList <Account> accountList = new ArrayList<Account>();
    ArrayList userNameList = new ArrayList();
    Map<String,Account> map=new HashMap<String,Account>();
    Account a1,a2,a3,a4,a5;
    public Bank(String BankName){
        this.BankName = BankName;
        
    }

    
    public void AddOnArrayList()
    {
         a1 = new Account("30923",1000.00,"DU","764XXXX"); 
         a2 = new Account("30ccx23",16600.00,"DU","7454XXXX"); 
         a3 = new Account("cxcx23",133540.00,"DU","7574XXXX"); 
         a4 = new Account("3vcb23",10340.00,"DU","684XXXX");
         a5 = new Account("3hfdh23",145400.00,"DU","7904XXXX");
        
        accountList.add(a1);
        accountList.add(a2);
        accountList.add(a3);
        accountList.add(a4); 
        accountList.add(a5);
        
        AccountsOnline();
    }
    public boolean checkUserName(String userName){
        char[] stringToCharArray = userName.toCharArray();
        for(int i =0;i<stringToCharArray.length;i++){
            if(i==0 && stringToCharArray[i] == ' ' ) {
                userNameList.add(userName);
                return true;
            }
            if(i>0 && stringToCharArray[i] == ' ' && userNameList.contains(userName) ){
                System.out.println("Invalid user name!!!");
                return false;
            }
            else {
                userNameList.add(userName);
                return true;
            }
          
        }
        return true;
    }
    public void AccountsOnline()
    {
       Scanner sc = new Scanner(System.in); 
        System.out.println("Insert valid USerName ");
            //Adding elements to map  
        for(int i=0;i<5;i++)
        {
            String userName = sc.nextLine();
            if(checkUserName(userName)== true)
            map.put(userName,accountList.get(i));
        }

        }
    public Account SelectAccountforOperation(String userName){
        return map.get(userName);
    }
    public Account clear()
    {
        return null;
    }
    
    
    public void operation(){
      
        a1.deposit(6734.8978);
        a1.withdraw(634.432);
    }
    
}
