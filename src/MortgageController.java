
import java.util.HashMap;
import java.util.Map;

public class MortgageController {


  private CalculatorTaskInterface calculatePayment = new FixedRateCalculatorImpl();
        
        Map<String, Double> payment = new HashMap<>();
  
  public Map<String, Double> calculateInterest(double principal, double yearlyRate, int term) throws Exception {


    double fixedRate = calculatePayment.calculateMonthlyPayment(principal, yearlyRate, term);

        payment.put("fixedRate", fixedRate);

    calculatePayment = new InterestRateTaskImpl();

    double interestRate = calculatePayment.calculateMonthlyPayment(principal, yearlyRate, term);

        payment.put("interestRate", interestRate);

    return payment;
  }

  public static void main(String[] args) throws Exception {

    Map<String, Double> payment = new HashMap<>();

    MortgageDataReq req = new MortgageDataReq();
    req.displayData("gowri", "vellore", "savings", 20000, 5, 10);
    
    MortgageController mortgage = new MortgageController();
    payment = mortgage.calculateInterest(20000.0, 5.0, 10);

    System.out.println(payment);
    
  }


}