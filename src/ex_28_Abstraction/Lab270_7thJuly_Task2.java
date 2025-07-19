package ex_28_Abstraction;

public class Lab270_7thJuly_Task2 {
    public static void main(String[] args) {
SBI sbi = new SBI();
sbi.getInterestRate();
HDFC hdfc = new HDFC();
hdfc.getInterestRate();
    }
}
abstract class Bank
{
    abstract void getInterestRate();
}
class SBI extends Bank
{
    void getInterestRate()
    {
        System.out.println("SBI Interest Rate: 6.5");
    }
}
class HDFC extends Bank{
    void getInterestRate()
    {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}