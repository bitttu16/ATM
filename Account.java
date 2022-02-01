package ATMmachine;
import java.util.*;
public class Account {
    private String customername="sahil";
    private int customernumber;
    private  double balance=1000; 
    private int pin;
    Scanner input=new Scanner(System.in);
    public void  setCustomerNumber(int customernumber){
        this.customernumber=customernumber;
        
    }
    public int getCustomernumber(){
        return customernumber;
    }
    public void setpin(int pin){
        this.pin=pin;
        
    }
    public int getpin(){
        return pin;
    }
    public void setBalance(double balance){
        this.balance=balance;
        


    }
    public double getbalance(){
        return balance;
    }
    public void setName(String name){
        this.customername=name;
    }
    public String getName(){
        return customername;
    }



    
}
