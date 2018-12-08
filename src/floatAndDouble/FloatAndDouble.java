package floatAndDouble;

import java.math.BigDecimal;

public class FloatAndDouble {
    public static void main(String[] args) {
//        System.out.println(1.03-.42);
//        System.out.println(1.00-9*.10);

//            double funds=1.00;
//            int itemBought=0;
//        for (double price = .10; funds >= price ; price+=.10) {
//            funds-=price;
//            itemBought++;
//        }
//        System.out.println(itemBought+" items bought.");
//        System.out.println("Change: $ "+ funds);
//
//        final BigDecimal TEN_CENTS=new BigDecimal(".10");
//        int itemBought=0;
//        BigDecimal funds=new BigDecimal("1.00");
//        for(BigDecimal price=TEN_CENTS;
//                funds.compareTo(price)>=0;
//                price=price.add(TEN_CENTS)){
//            itemBought++;
//            funds=funds.subtract(price);
//        }
//        System.out.println(itemBought+" items bought.");

        int itemsBought=0;
        int funds=100;
        for (int price = 10; funds >=price ; price+=10) {
            itemsBought++;
            funds-=price;
        }
        System.out.println(itemsBought+" items bought.");
        System.out.println("Money left over: "+funds+" cents.");

    }
}
