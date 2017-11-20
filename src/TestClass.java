import algorithms.CodeGenerator;
import arrays.ArrayArithmetic;
import arrays.ArrayHelper;
import arrays.StringArrayConverter;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static void main(String[] args){

        String abcd = "1,2,3, hcjcvhgvjhv,kjbk,hjhbh, 5.5,9.6";

        StringArrayConverter sac = new StringArrayConverter(abcd, ",");

        System.out.println("PARSED VALUES");

        Integer[] arr = sac.getIntegerArray();
        Double[] darr = sac.getDoubleArray();

        for(int i=0;i<arr.length;i++){
            System.out.println(Integer.valueOf(i).toString() + ":" + arr[i].toString());
        }
        System.out.println("PARSED VALUES--Double");
        for(int i=0;i<darr.length;i++){
            System.out.println(Integer.valueOf(i).toString() + ":" + darr[i].toString());
        }

        System.out.println("ARRAY ARITHMETIC");

        ArrayArithmetic arrayArithmetic = new ArrayArithmetic(sac);

        System.out.println("Total: " + arrayArithmetic.getTotalSum());

        System.out.println("Total double: " + arrayArithmetic.getTotalSumDouble());

        testArrayToString();

        CodeGenerator c = new CodeGenerator();

        System.out.println("RAND STRING");

        System.out.println(c.getAuthCode());
    }

    private static void testArrayToString(){
        String[] values = {"Abbb", "Cccc", "Dddd"};

        List<String> vals = new ArrayList<>();

        vals.add("Eeee");
        vals.add("Ffff");
        vals.add("Gggg");

        System.out.println(new ArrayHelper(vals).getAsSingleStringDefaultSeparator());
    }

}
