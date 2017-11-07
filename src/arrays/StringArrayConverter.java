package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for converting an array of string numbers
 * into integer/double.
 */
public class StringArrayConverter {

    private String[] strArray;
    private String strArrayRaw;
    private String separator;

    private static final int FLOATING_TYPE = 99;
    private static final int INTEGER_TYPE = 100;

    private String NON_NUMERIC_VALUES_INT = "qwertyuiop[]asdfghjkl;'zxcvbnm,./" +
            "!@#$%^&*()_+-={}:\"<>?QWERTYUIOPASDFGHJKLZXCVBNM~`";

    private String NON_NUMERIC_VALUES_FLOATING = "qwertyuiop[]asdfghjkl;'zxcvbnm,/" +
            "!@#$%^&*()_+-={}:\"<>?QWERTYUIOPASDFGHJKLZXCVBNM~`";

    public StringArrayConverter(String array,String arraySeparator){
        this.strArrayRaw = array;
        this.separator = arraySeparator;
        this.strArray = this.strArrayRaw.split(this.separator);
    }

    public StringArrayConverter(String[] array){
        this.strArray = array;
    }
    /**
     * Returns an integer array of a specific string.
     * All incorrect values will be zero.
     *
     * All floating-point strings will be rounded off and stored as int.
     * @return
     */
    public Integer[] getIntegerArray(){

        List<Integer> intArray = new ArrayList<>();

        for(int i=0;i<strArray.length;i++){
            try{
                if(hasNonNumeric(strArray[i],FLOATING_TYPE) == -1){
                    intArray.add((int)(Math.round(Double.parseDouble(strArray[i]))));
                }
                else{
                    intArray.add(0);
                }
            }
            catch (NumberFormatException numEx){
                intArray.add(0);
            }
        }

        return intArray.toArray(new Integer[intArray.size()]);
    }
    /**
     * Returns an integer array of a specific string.
     * All incorrect values will be zero.
     * @return
     */
    public Double[] getDoubleArray(){

        List<Double> doubArray = new ArrayList<>();

        for(int i=0;i<strArray.length;i++){
            try{
                if(hasNonNumeric(strArray[i],FLOATING_TYPE) == -1){
                    doubArray.add(Double.parseDouble(strArray[i]));
                }
                else{
                    doubArray.add(0d);
                }
            }
            catch (NumberFormatException numEx){
                doubArray.add(0d);
            }
        }

        return doubArray.toArray(new Double[doubArray.size()]);
    }

    /** VALIDATION FUNCTIONS */

    /**
     * Returns the index of the string that has non-numeric value.
     * Returns -1 if there's no non-numeric int.
     * @param val
     * @return
     */
    private short hasNonNumeric(String val, int intFloatToggle){

        char[] valc = val.toCharArray();
        char[] nonInts = intFloatToggle == INTEGER_TYPE ? NON_NUMERIC_VALUES_INT.toCharArray()
                : NON_NUMERIC_VALUES_FLOATING.toCharArray();

        for(int i=0;i<valc.length;i++){

            char currChar = valc[i];

            for(int j=0;j<nonInts.length;j++){
                if(currChar == nonInts[j]){
                    return (short)i;
                }
            }
        }

        return -1;
    }
}
