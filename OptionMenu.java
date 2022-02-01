package ATMmachine;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class OptionMenu extends Account{

    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Integer> data=new HashMap<>();
    DecimalFormat money=new DecimalFormat("Rs #######0.###");
    public void getLogin() {
        int x=1;
        do{
            try{
                data.put(883953,883953);
                data.put(942500,942500);
                 System.out.println("Welcome to the ATM machine");
                 System.out.println("Enter your customer number");
                setCustomerNumber(sc.nextInt());

                 System.out.println("Eneter your pin number");
                  setpin(sc.nextInt());
            }
            catch(Exception e){
                System.out.println("Invalid characters.Enter number only");
                x=2;
            }
            int cn=getCustomernumber();
            int pn=getpin();
            if(data.containsKey(cn) && data.get(cn)==pn){
                getAccountType();
            }
            else {
                System.out.println("worng customer number or pin number");

            }
        } while(x==1);
    }
    public void getAccountType(){
        System.out.println("Select the Account you want to access");
        System.out.println("Saving Account");
        System.out.println("check Balance");
        System.out.println("exit");


    
   int selection=sc.nextInt();
   switch(selection){
       case 1:
       getSavingAccount();
       break;
       case 2:
       getCheckingAccount();
       case 3:
       System.out.println("Thank you for using Have a Good Day");
       break;
       default:
       System.out.println("Invalid selection");
       getAccountType();

   }
}
public void getCheckingAccount(){
    System.out.println("Checking Account");
    System.out.println("--> Check Balance");
    System.out.println("--> deposite");
    System.out.println("-->Exit");
    int selection=sc.nextInt();
    switch(selection){
        case 1:
        System.out.println("Balance: "+money.format(getbalance()));
        getAccountType();
        break;
    
        case 2:
        System.out.println("thank you");
        break;
        default:
        System.out.println("Invalid choice");
        getCheckingAccount();
    }
}
public void getSavingAccount(){
    System.out.println("Saving Account");
System.out.println("Welcome "+ getName());
System.out.println("--> Balance");
System.out.println("-->exit");
int selection=sc.nextInt();
switch(selection){
    case 1:
    System.out.println("Balance: "+money.format(getbalance()));
    getSavingAccount();
    break;
    case 2:
    System.out.println("bye bye "+ getName());
    getAccountType();
}


}
}
