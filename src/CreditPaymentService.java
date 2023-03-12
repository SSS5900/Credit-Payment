public class CreditPaymentService {

    public int calculate(int sum, int year, double percent){

        int month = year * 12;
        double monPer = percent / (100 * 12);
        int payment;

        // payment = (int) (sum * ((monPer * (Math.pow((1 + monPer), month))) / ((Math.pow((1 + monPer), month)) - 1)));

        payment = (int) (sum * (monPer / (1 - (Math.pow((1 + monPer), - month)))));

                return payment;


    }




}
