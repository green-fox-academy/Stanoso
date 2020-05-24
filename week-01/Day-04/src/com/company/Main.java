package com.company;

import java.util.Scanner;

public class Main {

    private static Math math;

    public static void main(String[] args) {
        // HelloWorld and other pritouts
        System.out.println("HelloWorld");
        System.out.println("HelloMe");
        System.out.println("HumptyDumpty");
        System.out.println("HelloOthers");

        //IntroduceYourself
        System.out.println("Stanislav Dostál");
        System.out.println("42 years old");
        System.out.println("My height is 184 cm.");

        //TwoNumbers
        System.out.println(22 + 13);
        System.out.println(22 - 13);
        System.out.println(22 * 13);
        System.out.println(22. / 13);
        System.out.println(22 / 13);
        System.out.println(22 % 13);

        //CodingHours
        int attendeeCodeHours = 6;
        int daysPerWeek = 5;
        int weeks = 17;
        int result = attendeeCodeHours * daysPerWeek * weeks;
        System.out.println("An attendee spends " + result + " hours of coding per the semester");

        int averageWorkHours = 52;
        int totalAverageWorkHours = averageWorkHours * weeks;
        float result2 = (float) result / totalAverageWorkHours * 100;
        System.out.println("The percentage of coding hours against the average work hours is " + result2 + " %");

        //FavoriteNumber
        int favoriteNumber = 8;
        System.out.println("My favorite number is: " + favoriteNumber);

        //Swap
        int a = 123;
        int b = 526;
        a = 526;
        b = 123;

        System.out.println(a);
        System.out.println(b);

        //Bmi
        double massInKg = 81.2;
        double heightInM = 1.78;

        System.out.println("The BMI is: " + massInKg / (heightInM * heightInM));

        //DefineBasicInfo
        String jmeno = "Stanislav Dostál";
        int age = 42;
        double heigh = 1.84;
        boolean married = true;

        System.out.println("My name is " + jmeno + " I am " + age + " years old, I am " + heigh + " m tall and it is " + married + " I am married.");

        //Varaible Mutation - variables a, b are already used, I´ll use different names
        int k = 3;
        k += 10;
        System.out.println(k);

        int l = 100;
        l -= 7;
        System.out.println(l);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e = e * e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean fCompare = f1 > f2;
        System.out.println(fCompare);

        int g1 = 350;
        int g2 = 200;
        boolean gCompare = (g2 * g2) > g1;
        System.out.println(gCompare);

        int h = 135798745;
        boolean hDivisor = (h % 11) == 0;
        System.out.println(hDivisor);

        int i1 = 10;
        int i2 = 3;
        double x = math.pow(i2, 3);
        boolean iCompare = ((i1 > (i2 * i2)) && (i1 < x));
        System.out.println(iCompare);

        int j = 1521;
        boolean jDiv = (1521 % 3 == 0 || 1521 % 5 == 0);
        System.out.println(jDiv);

        //Cuboid
        int sa = 5;
        int sb = 10;
        int sc = 20;
        int surface = 2 * sa * sa + 2 * sb * sb + 2 * sc * sc;
        int volume = sa * sb * sc;
        System.out.println("Surface area: " + surface);
        System.out.println("Volume: " + volume);

        //SecondsInADay
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int timeInSec = (14 * 60 * 60 + 34 * 60 + 42);
        int dayInSec = (24 * 60 * 60);
        System.out.println("The remaining time is: " + (dayInSec - timeInSec) + " seconds.");

        //HelloUser

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello User, please type your name: ");
        String name = scanner.nextLine();
        System.out.println(name);


        //MileToKmConverter - Note: I am not sure I understand the assignment correctly.
        System.out.println("Please set the distance in miles: ");
        int miles = scanner.nextInt();
        int doubleMiles = miles*2;
        float resultKm = (float) (doubleMiles*1.6);
        System.out.println("Thank you, double of the set distance is " +doubleMiles + " miles, which is equal to " +resultKm + " km.");



        //AnimalsAndLegs
        System.out.println("We want to count all farmer´s animals legs.");
        System.out.println("Please set number of ducks: ");
        int duck = scanner.nextInt();
        System.out.println("Please set number of pigs: ");
        int pig = scanner.nextInt();
        int legs = (duck*2) + (pig*4);
        System.out.println("All animals have " + legs+ " legs in total.");


        //AverageOfInput
        System.out.println("Please set 5 numbers,you´ll get back the sum and the average."  + "\n" + "Number 1: ");
        int n1 = scanner.nextInt();
        System.out.println("Number 2:");
        int n2 = scanner.nextInt();
        System.out.println("Number 3:");
        int n3 = scanner.nextInt();
        System.out.println("Number 4:");
        int n4 = scanner.nextInt();
        System.out.println("Number 5:");
        int n5 = scanner.nextInt();
        int sum = n1 + n2 + n3 + n4 + n5;
        float average = (float) sum / 5;
        System.out.println("Sum: " + sum + ", Average: " +average);











    }
}
