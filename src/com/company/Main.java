package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String findBy, illness = "";
        Integer first = 0, second = 0;
        PatientsArray arCars;

        findBy = JOptionPane.showInputDialog("Введіть тип пошуку").trim();

        if (findBy.equals("діагноз") || findBy.equals("Діагноз")) {
            illness = JOptionPane.showInputDialog("Введіть діагноз").trim();
            if (illness.isEmpty())
                JOptionPane.showMessageDialog(null, "Діагноз не задано");
        } else if (findBy.equals("номер картки") || findBy.equals("Номер картки")) {
            first = Integer.parseInt(JOptionPane.showInputDialog("Введіть початковий номер медичної карти"));
            second = Integer.parseInt(JOptionPane.showInputDialog("Введіть кінцевий номер медичної карти"));
            if (first <= 0 || second <= 0)
                JOptionPane.showMessageDialog(null, "Номер картки не задано");
        }

        arCars = new PatientsArray(5);
        arCars.Insert("Кашель", 28, "Петро", "dsd", 22222222);
        arCars.Insert("Ангіна", 21, "Василь", "dsd", 1111111);
        arCars.Insert("Діарея", 21, "Іван", "dsd", 33333333);
        arCars.Insert("Алергія", 32, "Денис", "dsd", 44444444);
        arCars.Insert("Вітрянка", 23, "Влад", "sfs", 55555555);
        if (!illness.isEmpty()) {
            arCars.findByIllness(illness);
        } else if (first > 0 && second > 0) {
            arCars.findByCardNumber(first, second);
        } else {
            JOptionPane.showMessageDialog(null, "Нічого не задано");
        }
        arCars.DispFind();
    }
}
