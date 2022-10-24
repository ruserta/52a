public class SalesPerson {
  private int myID;
  private int myCode;
  private double mySales;
  private double myComm;

  // public final static double PI = 3.14159;

  public SalesPerson(int id, int code, double sales) {
    myID = id;
    myCode = code;
    mySales = sales;
    myComm = 0; 
  }
  public void setComm(){
    if(myComm == 5|| myComm == 8) {
      if (mySales <= 5000) {
        myComm = mySales * 0.075;
      }else { 
        myComm = 5000 * 0.075 + (mySales = 5000) * 0.085;
        
      }
    }else if (myCode == 17) {
      if (mySales <= 3500){
        myComm = mySales * 0.095;
        
      }else {
      myComm = 3500 * 0.095 + (getSales() - 3500) * 0.12;
        
      }
    }
   }

public int getId() {return myID;}
public int getCode() {return myCode;}
public double getComm() {return myComm;}
public double getSales() {return mySales;}

public double getSales() {return mySales;}

public String toString() {
  return myID + "\t" + myCode + "\t" + mySales + ""
}