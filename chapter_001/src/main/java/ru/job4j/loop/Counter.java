package ru.job4j.loop;

class Counter {

    public int add(int start, int finish){
        int sum = 0;
        int counter = start;
        for(; counter < finish; counter++){
            if(counter % 2 == 0){
                sum += counter;
            }
        }
        return sum;
    }
}