package arrays;

public class ArrayArithmetic {

    private Integer[] intArray;
    private Double[] doubArray;
    private StringArrayConverter convObject;

    public ArrayArithmetic(Integer[] array){
        this.intArray = array;
    }

    public ArrayArithmetic(Double[] array){
        this.doubArray = array;
    }

    public ArrayArithmetic(StringArrayConverter sacObject){
        this.convObject = sacObject;
    }

    /**
     * All decimal values will get rounded up
     * totaled. Data loss ensues if you have
     * floating-point values in your dataset.
     *
     * Use getTotalSumDouble() if you have
     * floating-point values.
     *
     * @return
     */
    public Long getTotalSum(){

        Long totalValue = 0l;

        if(intArray != null){
            for(int i=0;i < intArray.length; i++){
                totalValue += intArray[i];
            }

            return totalValue;
        }
        else if(doubArray != null){

            for(int i=0;i < doubArray.length;i++){
                totalValue += doubArray[i].longValue();
            }

            return totalValue;
        }
        else if(this.convObject != null){
            //Initialize the int array
            this.intArray = convObject.getIntegerArray();
            return getTotalSum();
        }
        else{
            throw new NullPointerException("Object not initialized");
        }
    }


    /**
     * Returns the total sum
     * @return
     */
    public Double getTotalSumDouble(){

        Double dTotal = 0d;

        if(doubArray != null){

            for(int i=0;i<doubArray.length;i++){
                dTotal += doubArray[i];
            }

            return dTotal;
        }
        else if(this.convObject != null){
            this.doubArray = convObject.getDoubleArray();
            return getTotalSumDouble();
        }
        else{
            throw new NullPointerException("Object not initialized.");
        }
    }

}
