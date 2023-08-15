package com.tw;

public class MultiplicationTable {
    public String buildMultiplicationTable(int start, int end) {
        String multiplicationTable = "";
        if(isValid(start, end)) {
            multiplicationTable = generateTable(start, end);
            return multiplicationTable;
        } else {
            return null;
        }
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String result = "";
        for(int i = start; i <= end; i++){
            String s = System.lineSeparator();
            result = result.concat(generateLine(start, i));
            if(i < end) {
                result = result.concat(s);
            }
        }
        return result;
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
