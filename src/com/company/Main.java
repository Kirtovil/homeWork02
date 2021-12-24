package com.company;

public class Main {

    public static void main(String[] args) {
        byte b = 1;
        short s = -3211;
        int i = 1122333;
        long l = 12221L;

        float f = 2.034f;
        double d = 1.21223411;

        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float bothBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("общий вес боксёров " + bothBoxerWeight + " кг.");

        float differenceWeight = (firstBoxerWeight - secondBoxerWeight) % bothBoxerWeight;
        System.out.println("Разница веса составляет " + differenceWeight + " кг.");

        int bananaWeightGr = 80;
        int milkWeightOneHundredGr = 105;
        int iceCreamWeightGr = 100;
        int egsWeightGr = 70;
        int breakfastWeightGr = bananaWeightGr * 5 + milkWeightOneHundredGr * 2 + iceCreamWeightGr * 2 +egsWeightGr * 4;
        System.out.println("вес завтрака в граммах = " + breakfastWeightGr);

        float kgBreakfastWeight = breakfastWeightGr / 1000f;
        System.out.println("вес завтрака в килограммах = " + kgBreakfastWeight);

        float lostWeight = 7f;
        float firstProgram = 0.250f;
        float secondProgram = 0.500f;
        int dayFirstProgram = (int) (lostWeight / firstProgram);
        int daySecondProgram = (int) (lostWeight / secondProgram);
        int middleDay = (dayFirstProgram + daySecondProgram) / 2;
        System.out.println("Для похудения спортсмену потребуется, в среднем " + middleDay + " день");

        int MashaMoney = 67_760;
        int DenMoney = 83_690;
        int KrisMoney = 76_230;
        int newMashaMoney = MashaMoney + (MashaMoney / 10);
        int newDenMoney = DenMoney + (DenMoney / 10);
        int newKrisMoney = KrisMoney + (KrisMoney / 10);
        int yearMashaMoneyUp = newMashaMoney * 12 - MashaMoney * 12;
        int yearDenMoneyUp = newDenMoney * 12 - DenMoney * 12;
        int yearKrisMoneyUp = newKrisMoney * 12 - KrisMoney * 12;
        System.out.println("Маша стала получать " + newMashaMoney + " руб. Её годовой зароботок вырос на " + yearMashaMoneyUp + " руб.");
        System.out.println("Денис стал получать " + newDenMoney + " руб. его годовой зароботок вырос на " + yearDenMoneyUp + " руб.");
        System.out.println("Кристина стала получать " + newKrisMoney + " руб. её годовой зароботок выорс на " + yearKrisMoneyUp + " руб");

    }
}
