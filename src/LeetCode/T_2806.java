package LeetCode;

public class T_2806 {

    public static void main(String[] args) {

        accountBalanceAfterPurchase(9);
    }

    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int a=purchaseAmount%10;
        if(a>=5){
            purchaseAmount=purchaseAmount-a+10;
        }else {
            purchaseAmount-=a;
        }
        return 100-purchaseAmount;
    }
}
