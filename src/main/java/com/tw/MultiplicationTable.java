package com.tw;

public class MultiplicationTable {
    public String buildMultiplicationTable(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {
        return null;
    }

    public Boolean isInRange(int number) {
        return null;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return null;
    }

    public String generateTable(int start, int end) {
        return null;
    }

    public String generateLine(int start, int row) {
        String lineTmp = "";
        String line = "";
        for(int i = start; i <= row; i++){
            lineTmp = generateSingleExpression(i, row);
            if(i < row){
                line = line.concat(lineTmp + "  ");
            } else {
                line = line.concat(lineTmp);
            }
        }
        return line;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        int result = multiplicand * multiplier;
        return multiplicand + "*" + multiplier + "=" + result;
    }
}
