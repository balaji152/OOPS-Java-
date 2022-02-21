import java.util.*;
public class Account {
    int cash = 10000;

    int total=0;
    public int getcash(int cash){

        return 0;
    }
    public int totalCashInBank(ArrayList<Integer> cashinbank){
        System.out.println(cashinbank);
        return total;

    }

    public static class Savingsaccount extends Account{
         ArrayList<Integer>al= new ArrayList<>();
        @Override
        public int getcash(int cash) {
            int deposit = 5000;
            int fixeddeposit = 1000;
            cash+=deposit+fixeddeposit;
            al.add(cash);

            //System.out.println("Total salary of labour is"+salary);
            return 0;

        }
    }
    public static class Currentaccount extends Account {
        ArrayList<Integer> al2=new ArrayList<>();
        @Override
        public int getcash(int cash) {
            int totalDeposits  = 5000;
            int creditLimit = 2000;
            cash+= totalDeposits + creditLimit; 
            al2.add(cash);
            //System.out.println("Total Salary of Manager is"+salary);


            return 0;


        }
    }





    public static void main(String[] args) {
        Savingsaccount obj=new Savingsaccount();
        Currentaccount obj2= new Currentaccount();
        Account obj3= new Account();
        obj.getcash(500);
        obj.getcash(200);
        obj.getcash(600);
        obj2.getcash(500);
        obj2.getcash(800);
        obj2.getcash(1000);
        ArrayList<Integer> Savingsaccount=obj.al;
        //System.out.println(obj.al);
        ArrayList<Integer>Currentaccount=obj2.al2;

        obj3.totalCashInBank(Savingsaccount);
        obj3.totalCashInBank(Currentaccount);







    }
}