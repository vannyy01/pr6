package com.company;

public class PatientsArray {
    private Patient[] arrPatients;// змінна массиву, що зберегає об'єкти
    private Patient[] arrFind; // результати пошуку
    private int nElems; // лічильник елементів масиву

    // Конструктор класу arrayCar
    public PatientsArray(int max) {
        arrPatients = new Patient[max];
        nElems = 0;

        arrFind = new Patient[max];

    }

    // МЕТОД
    //заповнення полів поточного об'єкта масива
    public void Insert(String illness, int age, String name, String secondName, Integer number) {
        if (nElems < arrPatients.length) {
            arrPatients[nElems] = new Patient();
            arrPatients[nElems].setIllness(illness);
            arrPatients[nElems].setAge(age);
            arrPatients[nElems].setName(name);
            arrPatients[nElems].setSecondName(secondName);
            arrPatients[nElems].setNumber(number);
        } else
            System.out.println("Масив повністю заповнен");
        nElems++; // лічильник збільшується на одиницю
    }

    public void Display() {
        for (Patient i : arrPatients) {
            if (i == null) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }

    public void findByIllness(String illness) {
        boolean fl = false;
        boolean fl2 = true;
        int numFin = 0;
        if (illness.charAt(0) != " ".charAt(0)) {
            fl2 = false;
        }
        System.out.println("Знайти паціента - " + illness);
        try {
            for (int i = 0; i < arrPatients.length; i++) {
                fl = false;
                if (arrPatients[i].getIllness().equals(illness)) {
                    arrFind[numFin] = arrPatients[i];
                    numFin++;
                    fl = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Houston we have problems! " + e);
        }

    }


    public void findByCardNumber(Integer firstNumber, Integer secondNumber) {
        boolean fl = false;
        boolean fl2 = true;
        int numFin = 0;

        if (firstNumber == 0 & secondNumber == 0) {
            fl2 = false;
        }
        System.out.println("Знайти номер картки у проміжку - " + firstNumber + " " + secondNumber + " \n \n");
        try {
            for (int i = 0; i < arrPatients.length; i++) {
                if (arrPatients[i].checkNumber(firstNumber, secondNumber)) {
                    arrFind[numFin] = arrPatients[i];
                    numFin++;
                    fl = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Houston we have problems! " + e);
        }

    }

    public void DispFind() {
        System.out.println("\n Друк з файлу arrFin \n");
        for (Patient i : arrFind) {
            if (i == null) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }

}
