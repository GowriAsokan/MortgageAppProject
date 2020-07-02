public class MortgageDataReq implements ProcessTaskInterface {

  String name;
  String address;
  String type;
  int tenure;
  double principalAmount;
  double rateOfInterest;

  @Override
  public void displayData(String name, String address, String type, int tenure,
      double principalAmount, double rateOfInterest) {

    System.out.println("Name:"+name+" "+ "Address:"+" "+address+" "+"Type:"+type);
    System.out.println("Tenure:"+" "+tenure+"PrincipalAmount:"+" "+principalAmount+"InterestRate:"+" "+rateOfInterest);
    
  }


}