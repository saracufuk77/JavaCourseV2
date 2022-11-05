/*package Day49.SaturdayProject.UfukSaturdayPTask1;

import Day41.Java.Transaction;

import javax.swing.*;
import java.util.HashMap;

public class transaction {
    public static double totalUSDAmount;
    public static HashMap<String,Integer> stock=new HashMap<>();
    private double transactionAmount;

    public static void addFunds(double amount){
        totalUSDAmount +=amount;
    }

    public static void processTransaction(TransactionType type, Product product, int qty){
        Transaction transaction=new Transaction();
        switch (type){
            case BUY:
                transaction.transactionAmount=product.getBuyPrice()*qty;
                transaction.buyProduct(product,qty);
                break;
            case SELL:
                transaction.transactionAmount=product.getSellPrice()Price()*qty;
                transaction.sellProduct(product,qty);
                break;
        }
    }
    private void buyProduct(Product product, int qty){
        if(qty<=0) System.out.println("Wrong Amount");
        else {
            if (transactionAmount > totalUSDAmount) {
                System.out.println("your purchase amount is " + transactionAmount);
                System.out.println("your avaliable balance is " + totalUSDAmount);
                System.out.println("not enough funds to cover your purchase");
            } else {
                totalUSDAmount -= transactionAmount;
                stock.put(product.getProductname(), stock.getOrDefault(product.getProductname(), 0) + qty);
            }
        }
    }

    private void sellProduct(Product product,int qty){
        if(qty<=0) System.out.println("wrong amount");
        else {
            if(stock.get(product.getProductname())==null || qty > stock.get(product.getProductname())){
                System.out.println("your stock for "+product.getProductname()+" is "+
                        (stock.get(product.getProductname())==null ? 0 : stock.get(product.getProductname())));
            }else {
                totalUSDAmount+=transactionAmount;
                stock.computeIfPresent(product.getProductname(),(k,v)->v-qty);
            }
        }
    }
    public static void print(){
        System.out.println("Total funds $ "+totalUSDAmount+"\nstock= "+stock);
    }
}
*/