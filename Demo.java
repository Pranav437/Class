public class Demo {
    private String FatherName;
    private String MotherName;
    private String SonName;
    private String DaughterName;
    private double FatherSalary;
    private double MotherSalary;
    private double SonFee;
    private double DaughterFee;
    private double TotalSalary;
    private int grocery = 500;
    private double TotalFee;
    double TotalSavings;

    public Demo(String fatherName, String motherName, String sonName, String daughterName, double fatherSalary,
                            double motherSalary){
        this.FatherName = fatherName;
        this.MotherName = motherName;
        this.SonName = sonName;
        this.DaughterName = daughterName;
    }
    public void displayNames (){
        System.out.println("FatherName: " +FatherName);
        System.out.println("MotherName: " +MotherName);
        System.out.println("SonName: " +SonName);
        System.out.println("DaughterName: " +DaughterName);

    }
    public double getTotalSalary(){
        return TotalSalary;
    }
    public void setTotalSalary(double totalSalary){
        TotalSalary = totalSalary;
    }
    public double getSonFee(){
        return getSonFee();
    }
    public void setSonFee(double sonFee){
        this.SonFee = sonFee;
    }
    public double getDaughterFee(){
        return DaughterFee;
    }
    public void setDaughterFee(double daughterFee){
        this.DaughterFee = daughterFee;
    }
    public double getTotalFee(){
        TotalFee = SonFee + DaughterFee;
        return TotalFee;
    }
    public double getTotalSavings(){

        TotalSavings = TotalSalary - (grocery+TotalFee);
        return TotalSavings;
    }
    public void checkSavings(){
        if (TotalSavings>1000){
            System.out.println("Congrats " +FatherName +" you saved $" +TotalSavings);
        }
        else {
            System.out.println("Dear " +FatherName +" please try to save next month");
        }
    }

}
