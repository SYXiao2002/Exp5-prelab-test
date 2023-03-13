import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    static float Q1_Ic= 1.4F;      //mA
    static float Q2_IR2= 907F;     //µA
    static float Q3_IR2= 915F;     //µA
    static float Q4_Io= 5.7F;      //mA
    static float Q5_Io= 6.7F;      //mA
    static float Q6_Io= 7.0F;      //mA
    static float Q7_Ic= 9.5F;      //mA
    static float Q8_Ic= 3.7F;      //mA
    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
        Q6();
        Q7();
        Q8();
        Q9();
        Q10();
        Q11();
        Q12();
        Q13();
    }

    public static void Q1() {
        float ans=255*25/Q1_Ic/1000+2560;
        ans=ans/1000;
        BigDecimal decimalValue = new BigDecimal(ans);
        decimalValue = decimalValue.setScale(3, RoundingMode.HALF_UP);
        float roundedValue = decimalValue.floatValue();
        System.out.println("[10pt]Q1: input impedance Rin is "+roundedValue+ " MΩ");
    }

    public static void Q2() {
        float ans=(18F-0.6F)/Q2_IR2*1000;
        BigDecimal decimalValue = new BigDecimal(ans);
        decimalValue = decimalValue.setScale(3, RoundingMode.HALF_UP);
        float roundedValue = decimalValue.floatValue();
        System.out.println("[10pt]Q2: the value of R2 is "+roundedValue+ " kΩ");
    }

    public static void Q3() {
        float ans= (float) (250F * Math.log(Q3_IR2/100F));
        BigDecimal decimalValue = new BigDecimal(ans);
        decimalValue = decimalValue.setScale(3, RoundingMode.HALF_UP);
        float roundedValue = decimalValue.floatValue();
        System.out.println("[10pt]Q3: the value of R3 is "+roundedValue+ " Ω");
    }

    public static void Q4() {
        float ans= (18-0.6f)/Q4_Io;
        BigDecimal decimalValue = new BigDecimal(ans);
        decimalValue = decimalValue.setScale(3, RoundingMode.HALF_UP);
        float roundedValue = decimalValue.floatValue();
        System.out.println("[5pt]Q4: the value of R2 is "+roundedValue+ " kΩ");
    }

    public static void Q5() {
        float ans = 255*25/256F/Q5_Io;
        ans=ans*10000/(10000+ans);
        BigDecimal decimalValue = new BigDecimal(ans);
        decimalValue = decimalValue.setScale(3, RoundingMode.HALF_UP);
        float roundedValue = decimalValue.floatValue();
        System.out.println("[10pt]Q5: the output impedance Rout is "+roundedValue+ " Ω");
    }

    public static void Q6() {
        float ans = 150F/Q6_Io;
        ans=ans*10/(10+ans);
        BigDecimal decimalValue = new BigDecimal(ans);
        decimalValue = decimalValue.setScale(3, RoundingMode.HALF_UP);
        float roundedValue = decimalValue.floatValue();
        System.out.println("[10pt]Q6: the output impedance Rout is "+roundedValue+ " kΩ");
    }

    public static void Q7() {
        float ans = (-1)*Q7_Ic/25*(1*150F/Q7_Ic)/(1+150F/Q7_Ic)*1000;
        BigDecimal decimalValue = new BigDecimal(ans);
        decimalValue = decimalValue.setScale(2, RoundingMode.HALF_UP);
        float roundedValue = decimalValue.floatValue();
        System.out.println("[10pt]Q7: the voltage gain AV is "+roundedValue+ "");
    }
    public static void Q8() {
        float ans = 255*25/Q8_Ic/1000;
        ans=2560f/(2560f+ans);
        BigDecimal decimalValue = new BigDecimal(ans);
        decimalValue = decimalValue.setScale(4, RoundingMode.HALF_UP);
        float roundedValue = decimalValue.floatValue();
        System.out.println("[5pt]Q8: the voltage gain AV is "+roundedValue+ "");
    }
    public static void Q9() {
        BigDecimal decimalValue = new BigDecimal(68.235f);
        decimalValue = decimalValue.setScale(3, RoundingMode.HALF_UP);
        float roundedValue = decimalValue.floatValue();
        System.out.println("[5pt]Q9:  the value of R2 is "+roundedValue+ " kΩ");
    }
    public static void Q10() {
        System.out.println("[10pt]Q10: the differential gain AVd is 1500");
    }
    public static void Q11() {
        System.out.println("[5pt]Q11: " +
                "\n\t\tStage 1\t\tset the DC bias for all stages\n" +
                "\t\tStage 2/4\tprovide high voltage gain\n" +
                "\t\tStage 3\t\t‘match’ the gain stages to avoid loading effects\n" +
                "\t\tStage 5\t\tprovide low output resistance\n");
    }

    public static void Q12() {
        System.out.println("[5pt]Q12: high Ri, low Ro, low Av" );
    }
    public static void Q13() {
        System.out.println("[5pt]Q12: high Ro, high Av" );
    }


}