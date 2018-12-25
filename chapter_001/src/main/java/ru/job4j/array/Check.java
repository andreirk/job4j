package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        boolean first = data[0];
        for (int i = 0; i < data.length; i++){
            if(data[i] != first){
                return result;
            }
        }
        result = true;
        return result;
    }
}
