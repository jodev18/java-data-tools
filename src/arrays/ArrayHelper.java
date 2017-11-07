package arrays;

import java.util.List;

public class ArrayHelper {

    private List<String> list;
    private String[] array;

    private static final String DEFAULT_SEPARATOR = ",";

    public ArrayHelper(List<String> arrList){
        this.list = arrList;
    }

    public ArrayHelper(String[] items){
        this.array = items;
    }

    /**
     * Concatenate an array into a single string with a custom separator.
     * @param separator
     * @return
     */
    public String getAsSingleString(String separator){

        StringBuilder sb = new StringBuilder();

        if(list != null){

            int listSize = this.list.size();

            if(listSize > 0){
                for(int i=0;i<listSize;i++){
                    sb.append(this.list.get(i));

                    if((i+1) < listSize){
                        sb.append(separator);
                    }
                }
                return sb.toString();
            }
            else{
                return "";
            }

        }
        else{
            if(array != null){

                int arrSize = this.array.length;

                if(arrSize > 0){
                    for (int j=0;j<arrSize;j++){
                        sb.append(array[j]);

                        if((j+1) < arrSize){
                            sb.append(separator);
                        }
                    }

                    return sb.toString();
                }
                else{
                    return "";
                }
            }
            else{
                throw new NullPointerException("This object was not initialized.");
            }
        }
    }

    /**
     * Returns a list or array as a concatenated string
     * with the default separator.
     * @return
     */
    public String getAsSingleStringDefaultSeparator(){

        StringBuilder sb = new StringBuilder();

        if(list != null){

            int listSize = this.list.size();

            if(listSize > 0){
                for(int i=0;i<listSize;i++){
                    sb.append(this.list.get(i));

                    if((i+1) < listSize){
                        sb.append(DEFAULT_SEPARATOR);
                    }
                }

                return sb.toString();
            }
            else{
                return "";
            }
        }
        else{
            if(array != null){

                int arrLen = array.length;

                if(arrLen > 0){
                    for(int i=0;i<arrLen;i++){
                        sb.append(this.array[i]);

                        if((i+1) < arrLen){
                            sb.append(DEFAULT_SEPARATOR);
                        }
                    }
                    return sb.toString();
                }
                else{
                    return "";
                }

            }
            else{
                throw new NullPointerException("This object was not initialized.");
            }
        }
    }
}
