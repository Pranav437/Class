public class FamilyAssignment {
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

    public FamilyAssignment(String fatherName, String motherName, String sonName, String daughterName, double fatherSalary,
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
//
//    public String getFatherName() {
//        return FatherName;
//    }
//
//    public void setFatherName(String fatherName) {
//        FatherName = fatherName;
//    }
//public String getMotherName(){
//        return MotherName;
//}
//public void setMotherName(String motherName){
//        MotherName = motherName;
//}
//public String getSonName(){
//        return SonName;
//}
//public void setSonName(String sonName){
//        SonName = sonName;
//}
//public String getDaughterName(){
//        return DaughterName;
//}
//public void setDaughterName(String daughterName){
//        DaughterName = daughterName;
//}
//public double getFatherSalary(){
//        return FatherSalary;
//}
//public void setFatherSalary(double fatherSalary){
//        FatherSalary = fatherSalary;
//}
//public double getMotherSalary(){
//        return MotherSalary;
//}
//public void setMotherSalary(double motherSalary){
//        MotherSalary = motherSalary;
//}
//public double getSonFee(){
//        return SonFee;
//}
//public void setSonFee(double sonFee){
//        SonFee = sonFee;
//}
//public double getDaughterFee(){
//        return DaughterFee;
//}
//public void setDaughterFee(double daughterFee){
//        DaughterFee = daughterFee;
//}

}
