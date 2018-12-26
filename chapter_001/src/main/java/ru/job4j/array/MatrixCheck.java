package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int size = data.length;
        Check checker = new Check();
        boolean[] firstDiag = new boolean[size];
        boolean[] secondDiag = new boolean[size];

        for (int j = 0; j < size; j++ ) {
            for(int i = 0; i < size; i++){
                if(j == i){
                    firstDiag[i] = data[j][i];
                }
                if(i == (size - 1 - j) ){
                    secondDiag[j] = data[j][j];
                }
            }
        }

        boolean firstResult = checker.mono(firstDiag);
        boolean secondResult = checker.mono(secondDiag);

        result = firstResult && secondResult;

        return result;
    }
}