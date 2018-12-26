package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array){
        int unique = array.length;
        for(int out = 0; out < array.length; out++){
            String a = array[out];
            for (int in = out + 1; in < unique; in++){
                if(array[out].equals(array[in])){
                    array[in] = array[--unique];
                    in--;
                }
            }
        }

        array = Arrays.copyOf(array, unique);
        return  array;
    }

}
