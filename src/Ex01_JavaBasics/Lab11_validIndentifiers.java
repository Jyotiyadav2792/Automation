package Ex01_JavaBasics;

public class Lab11_validIndentifiers {
    public static void main(String[] args) {

            int _ = 65; //valid
            int $ = 65; //valid
            int year = 2025; //valid
            int I_want_to_be_an_automation_tester_rr_%%__ = 89; //invalid
        int I_want_to_be_an_automation_tester_rr$$= 100; //Valid
//System.out.println(_);
System.out.println($);
System.out.println(year + $);

        }
}
