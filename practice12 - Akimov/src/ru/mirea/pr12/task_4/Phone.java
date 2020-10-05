package ru.mirea.pr12.task_4;

public class Phone {
    final private String countryCode;
    final private String operatorCode;
    final private String prefix;
    final private String num;
    final private String regex = "^((\\+\\d{11})|(\\d{11}))$";

    public Phone(String string) {
        if (string.matches(regex)) {
            if (string.length() == 12) {
                countryCode = String.valueOf(string.charAt(1));
                operatorCode = string.substring(2, 5);
                prefix = string.substring(5, 8);
                num = string.substring(8, 12);
                return;
            }
            countryCode = String.valueOf((Integer.parseInt(String.valueOf(string.charAt(0))) - 1));
            operatorCode = string.substring(1, 4);
            prefix = string.substring(4, 7);
            num = string.substring(7, 11);
            return;
        }
        throw new IllegalStateException("Неправильно введены исходные данные");
    }

    @Override
    public String toString(){
        return String.format(
                "+%s%s-%s-%s",
                countryCode, operatorCode, prefix, num);
    }
}
