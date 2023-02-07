package com.techreturners;

public class RomanNumeralsConverter {
    public String convert(int number) {

        String romanNumeral = "";

        if ((number <= 0) || (number > 3000)) {
            throw new IllegalArgumentException(number + " is not in range (0,3000]");
        }

        //thousands position
        switch ((number / 1000)){
            case 1:
                romanNumeral += "M";
                break;
            case 2:
                romanNumeral += "MM";
                break;
            case 3:
                romanNumeral += "MMM";
                break;
        }

        //hundreds position
        switch ((number % 1000) / 100){
            case 1:
                romanNumeral += "C";
                break;
            case 2:
                romanNumeral += "CC";
                break;
            case 3:
                romanNumeral += "CCC";
                break;
            case 4:
                romanNumeral += "CD";
                break;
            case 5:
                romanNumeral += "D";
                break;
            case 6:
                romanNumeral += "DC";
                break;
            case 7:
                romanNumeral += "DCC";
                break;
            case 8:
                romanNumeral += "DCCC";
                break;
            case 9:
                romanNumeral += "CM";
                break;
        }

        //tens position
        switch ((number % 100) / 10){
            case 1:
                romanNumeral += "X";
                break;
            case 2:
                romanNumeral += "XX";
                break;
            case 3:
                romanNumeral += "XXX";
                break;
            case 4:
                romanNumeral += "XL";
                break;
            case 5:
                romanNumeral += "L";
                break;
            case 6:
                romanNumeral += "LX";
                break;
            case 7:
                romanNumeral += "LXX";
                break;
            case 8:
                romanNumeral += "LXXX";
                break;
            case 9:
                romanNumeral += "XC";
                break;
        }

        //units position
        switch(number % 10) {
            case 1:
                romanNumeral += "I";
                break;
            case 2:
                romanNumeral += "II";
                break;
            case 3:
                romanNumeral += "III";
                break;
            case 4:
                romanNumeral += "IV";
                break;
            case 5:
                romanNumeral += "V";
                break;
            case 6:
                romanNumeral += "VI";
                break;
            case 7:
                romanNumeral += "VII";
                break;
            case 8:
                romanNumeral += "VIII";
                break;
            case 9:
                romanNumeral += "IX";
                break;
        }
        return romanNumeral;
    }
}
