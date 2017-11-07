package arrays;

import java.util.List;

public class ArrayUtils{

    private List<String> list;
    private String[] array;

    private static final String DEFAULT_SEPARATOR = ",";

    public ArrayUtils(List<String> arrList){
        this.list = arrList;
    }

    public ArrayUtils(String[] items){
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

            for(int i=0;i<listSize;i++){
                sb.append(this.list.get(i));

                if((i+1) < listSize){
                    sb.append(separator);
                }
            }

            return sb.toString();

        }
        else{
            if(array != null){

            }
            else{
                throw new NullPointerException("This object was not initialized.");
            }
        }
    }

    public String getAsSingleStringDefaultSeparator(){

        StringBuilder sb = new StringBuilder();

        if(list != null){

            int listSize = this.list.size();

            for(int i=0;i<listSize;i++){
                sb.append(this.list.get(i));

                if((i+1) < listSize){
                    sb.append(DEFAULT_SEPARATOR);
                }

                return sb.toString();
            }

        }
        else{
            if(array != null){

            }
            else{
                throw new NullPointerException("This object was not initialized.");
            }
        }
    }
}
