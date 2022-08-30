public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int intNumber = 843;
        byte byteNumber = 17;
        short shortNumber = 19245;
        long longNumber = 9_434_643_516_844L;
        float floatNumber = 15.1002F;
        double doubleNumber = 144.13654888888;
        System.out.println("Значение переменной intNumber с типом int равно " + intNumber);
        System.out.println("Значение переменной byteNumber с типом byte равно " + byteNumber);
        System.out.println("Значение переменной shortNumber с типом short равно " + shortNumber);
        System.out.println("Значение переменной longNumber с типом long равно " + longNumber);
        System.out.println("Значение переменной floatNumber с типом float равно " + floatNumber);
        System.out.println("Значение переменной doubleNumber с типом double равно " + doubleNumber);

        //Задача 2
        float number1 = 27.12F;
        long number2 = 987_678_965_549L;
        double number3 = 2.786;
        boolean boolValue = false;
        char number4 = 569;
        short number5 = -159;
        int number6 = 27897;
        byte number7 = 67;

        //Задача 3
        System.out.println("\nЗадача 3");
        short studentsLyudmilaPavlovna = 23;
        short studentsAnnaSergeevna = 27;
        short studentsEkaterinaAndreevna = 30;
        int paperCount = 480;

        int studentsTotal = studentsLyudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna;
        System.out.println("На каждого ученика рассчитано " + paperCount / studentsTotal + " листов бумаги.");

        //Задача 4
        System.out.println("\nЗадача 4");
        short bottles = 16;
        byte minutes = 2;
        int capacity = bottles / minutes;
        System.out.println("За 20 минут машина произвела бутылок " + capacity * 20 + " штук.");
        System.out.println("За сутки машина произвела бутылок " + capacity * 24 * 60 + " штук.");
        System.out.println("За 3 дня машина произвела бутылок " + capacity * 3 * 24 * 60 + " штук.");
        System.out.println("За 1 месяц машина произвела бутылок " + capacity * 30 * 24 * 60 + " штук.");

        //Задача 5
        System.out.println("\nЗадача 5");
        short whitePaint = 2;
        short brownPaint = 4;
        short paintTotal = 120;
        int paintForOneClassroom = whitePaint + brownPaint;
        int classrooms = paintTotal / paintForOneClassroom;
        System.out.println("В школе, где " + classrooms + " классов, нужно " + classrooms * whitePaint +
                " банок белой краски и " + classrooms * brownPaint + " банок коричневой краски");

        //Задача 6
        System.out.println("\nЗадача 6");
        short bananas = 5;
        short oneBananaWeight = 80;
        short milk = 200;
        short milk100mlWeight = 105;
        short icecream = 2;
        short oneIcecreamWeight = 100;
        short eggs = 4;
        short oneEggWeight = 70;

        int bananasWeight = bananas * oneBananaWeight;
        int milkWeight = milk * milk100mlWeight / 100;
        int icecreamWeight = icecream * oneIcecreamWeight;
        int eggsWeight = eggs * oneEggWeight;

        int breakfastWeight = bananasWeight + milkWeight + icecreamWeight + eggsWeight;
        float breakfastWeightKg = (float) breakfastWeight / 1000;

        System.out.println("Общий вес спорт-завтрака: " + breakfastWeightKg + " кг.");

        //Задача 7
        System.out.println("\nЗадача 7");
        short weightLooseMin = 250;
        short weightLooseMax = 500;
        short needToLose = 7000;

        int daysMax = needToLose / weightLooseMin;
        int daysMin = needToLose / weightLooseMax;
        float daysAverage = (float) needToLose / ((weightLooseMax + weightLooseMin) / 2F);

        System.out.println("Если терять по " + weightLooseMin + " грамм/день, потребуется " + daysMax + " дней.");
        System.out.println("Если терять по " + weightLooseMax + " грамм/день, потребуется " + daysMin + " дней.");
        System.out.println("В среднем на похудение потребуется " + daysAverage + " дней.");

        //Задача 8
        System.out.println("\nЗадача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        float newSalaryMasha = salaryMasha * 1.1F;
        float newSalaryDenis = salaryDenis * 1.1F;
        float newSalaryKristina = salaryKristina * 1.1F;

        float SalaryDifferenceMasha = (newSalaryMasha - salaryMasha) * 12;
        float SalaryDifferenceDenis = (newSalaryDenis - salaryDenis) * 12;
        float SalaryDifferenceKristina = (newSalaryKristina - salaryKristina) * 12;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + SalaryDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + SalaryDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + SalaryDifferenceKristina + " рублей");
    }
}