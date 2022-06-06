package main;

import java.time.LocalDate;
import java.time.Period;

public class Task_17 {
//    private LocalDate parsePeselToDate(String pesel){
//        int month = Integer.parseInt(pesel.substring(2,4));
//        int day = Integer.parseInt(pesel.substring(4,6));
//        StringBuilder yearBuilder = new StringBuilder(pesel.substring(0, 2));
//        int year;
//        if(month>80){
//            yearBuilder.insert(0, "18");
//            month-=80;
//        }else if(month>=21 && month<=32){
//            yearBuilder.insert(0, "20");
//            month-=20;
//        }else{
//            yearBuilder.insert(0, "19");
//        }
//        year = Integer.parseInt(String.valueOf(yearBuilder));
//        return LocalDate.of(year, month, day);
//    }
//    public boolean checkLegalAge(String pesel){
//        LocalDate birthday = parsePeselToDate(pesel);
//        LocalDate today = LocalDate.now();
//        Period period = Period.between(birthday, today);
//        return period.getYears()>=18;
//    }
private byte PESEL[] = new byte[11];
    private boolean valid = false;

    public Task_17(String PESELNumber) {
        if (PESELNumber.length() != 11){
            valid = false;
        }
        else {
            for (int i = 0; i < 11; i++){
                PESEL[i] = Byte.parseByte(PESELNumber.substring(i, i+1));
            }
            //check if PESEL belongs to adult person
            if (checkSum() && checkMonth() && checkDay() && getBirthYear()>=18) {
                valid = true;
            }
            else {
                valid = false;
            }
        }
    }
    public int getBirthYear() {
        int year;
        int month;
        year = 10 * PESEL[0];
        year += PESEL[1];
        month = 10 * PESEL[2];
        month += PESEL[3];
        if (month > 80 && month < 93) {
            year += 1800;
        }
        else if (month > 0 && month < 13) {
            year += 1900;
        }
        else if (month > 20 && month < 33) {
            year += 2000;
        }
        else if (month > 40 && month < 53) {
            year += 2100;
        }
        else if (month > 60 && month < 73) {
            year += 2200;
        }
        return year;
    }

    public int getBirthMonth() {
        int month;
        month = 10 * PESEL[2];
        month += PESEL[3];
        if (month > 80 && month < 93) {
            month -= 80;
        }
        else if (month > 20 && month < 33) {
            month -= 20;
        }
        else if (month > 40 && month < 53) {
            month -= 40;
        }
        else if (month > 60 && month < 73) {
            month -= 60;
        }
        return month;
    }


    public int getBirthDay() {
        int day;
        day = 10 * PESEL[4];
        day += PESEL[5];
        return day;
    }

    public String getSex() {
        if (valid) {
            if (PESEL[9] % 2 == 1) {
                return "Mezczyzna";
            }
            else {
                return "Kobieta";
            }
        }
        else {
            return "---";
        }
    }

    private boolean checkSum() {
        int sum = 1 * PESEL[0] +
                3 * PESEL[1] +
                7 * PESEL[2] +
                9 * PESEL[3] +
                1 * PESEL[4] +
                3 * PESEL[5] +
                7 * PESEL[6] +
                9 * PESEL[7] +
                1 * PESEL[8] +
                3 * PESEL[9];
        sum %= 10;
        sum = 10 - sum;
        sum %= 10;

        if (sum == PESEL[10]) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean checkMonth() {
        int month = getBirthMonth();
        int day = getBirthDay();
        if (month > 0 && month < 13) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean checkDay() {
        int year = getBirthYear();
        int month = getBirthMonth();
        int day = getBirthDay();
        if ((day >0 && day < 32) &&
                (month == 1 || month == 3 || month == 5 ||
                        month == 7 || month == 8 || month == 10 ||
                        month == 12)) {
            return true;
        }
        else if ((day >0 && day < 31) &&
                (month == 4 || month == 6 || month == 9 ||
                        month == 11)) {
            return true;
        }
        else if ((day >0 && day < 30 && leapYear(year)) ||
                (day >0 && day < 29 && !leapYear(year))) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
