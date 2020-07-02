
public class InterestRateTaskImpl implements CalculatorTaskInterface {


    @Override
    public double calculateMonthlyPayment(double principalAmount, double rateOfInterestYearly,
        int tenure) {

      double monthlyPayment = principalAmount * (rateOfInterestYearly / 100) / 12;

      monthlyPayment = (double) Math.round(monthlyPayment * 100) / 100;

      return monthlyPayment;
    }

  

}
