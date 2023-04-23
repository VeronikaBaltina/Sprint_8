package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name.length() >= 3 && name.length() <= 19) {
            String[] split = name.split(" ");
            if (split.length == 2) {
                if (split[0].isEmpty() || split[1].isEmpty()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

}
