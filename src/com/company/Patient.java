package com.company;

public class Patient {


    private String illness = "";// Марка автомобіля


    private Integer number = 0;// Кольор автомобіля
    private String name = "";// Коробка передач
    private String secondName = "";// Коробка передач
    private int age = 0;// тип палива
    private String age2 = ""; // тип палива у форматі String

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        if (number < 100000000)
            this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getSecondNameName() {
        return secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAge2() {
        return age2;
    }

    public void setAge(int age) {
        age2 = age + "  ";
        this.age = age;
    }


    public boolean checkNumber(Integer firstNumber, Integer secondNumber) {
        return getNumber() >= firstNumber && getNumber() <= secondNumber;
    }

    @Override
    public String toString() {
        return " [Діагноз = " + illness + ", Номер картки = " + number + ", Ім'я = "
                + name + ", Прізвище = " + secondName + ", Вік = " + age + " ]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        boolean r1 = false;
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Patient))
            return false;
        Patient other = (Patient) obj;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number)) {
            r1 = false;
            return false;
        } else
            r1 = true;
        return r1;
    }

}
