public class Main {
    public static void main(String[] args)

    {

        int price = 57;
        double SHIPPING_FEE = .02;

        if(price >= 100)

        {
            System.out.println("Your shipping cost is Free!");
        } else {

        System.out.println("Your shipping cost is " + price * SHIPPING_FEE);
    }

    }
}