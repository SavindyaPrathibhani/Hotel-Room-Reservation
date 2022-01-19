package db;

import model.*;

import java.util.ArrayList;

public class Database {
    public static ArrayList<MonthlyIncome> decemberTable = new ArrayList<MonthlyIncome>();
    public static ArrayList<AnnualIncome> table21 = new ArrayList<AnnualIncome>();
    public static ArrayList<MealPackage> mealsTable = new ArrayList<MealPackage>();
    public static ArrayList<Rooms> roomsTable = new ArrayList<>();
    public static ArrayList<Customers> customersTable = new ArrayList<>();

    static {
        decemberTable.add(
               new MonthlyIncome("Food Income",95000)
        );
        decemberTable.add(
                new MonthlyIncome("Room Income",200000)
        );
        decemberTable.add(
                new MonthlyIncome("Other Income",5000)
        );
        decemberTable.add(
                new MonthlyIncome("Total Revenue",300000)
        );
        decemberTable.add(
                new MonthlyIncome("",0)
        );
        decemberTable.add(
                new MonthlyIncome("Administrative",30000)
        );
        decemberTable.add(
                new MonthlyIncome("Utility bills",22000)
        );
        decemberTable.add(
                new MonthlyIncome("Salaries",200000)
        );
        decemberTable.add(
                new MonthlyIncome("Total Expenditure",252000)
        );
        decemberTable.add(
                new MonthlyIncome("",0)
        );
        decemberTable.add(
                new MonthlyIncome("Total Profit",48000)
        );
        table21.add(
                new AnnualIncome("Food Income",250000,129600,200000,160000,210047,190930,36547,125400,21800,99300,68000,60000)
        );
        table21.add(
                new AnnualIncome("Room Income",120000,129600,200000,130000,210007,190930,36547,125400,21800,99300,68000,60000)
        );
        table21.add(
                new AnnualIncome("Other Income",10000,9600,50000,30000,50047,60930,36547,85400,3800,5300,18000,10000)
        );
        table21.add(
                new AnnualIncome("Total Revenue",380000,229800,450000,310000,210047,190930,36547,225400,51800,109300,68000,130000)
        );
        table21.add(
                new AnnualIncome("",0,0,0,0,0,0,0,0,0,0,0,0)
        );
        table21.add(
                new AnnualIncome("Salaries",250000,139600,100000,360000,110047,190930,36547,125400,21800,93300,68000,25000)
        );
        table21.add(
                new AnnualIncome("Other",50000,119600,120000,360000,110047,190930,36547,525400,21500,13300,63200,25050)
        );
        table21.add(
                new AnnualIncome("Total Expenditure",250000,339600,200000,560000,310047,390930,66547,625400,41800,103300,128000,50050)
        );
        table21.add(
                new AnnualIncome("",0,0,0,0,0,0,0,0,0,0,0,0)
        );
        table21.add(
                new AnnualIncome("Profit/Loss",41000,48000,62500,67000,71000,10000,58610,6080,07666,-8756,58600,57460)
        );
        mealsTable.add(
                new MealPackage("Fried rice",1700)
        );
        mealsTable.add(
                new MealPackage("Rice & Curry",2800)
        );
        mealsTable.add(
                new MealPackage("Noodles",5500)
        );
        mealsTable.add(
                new MealPackage("Pasta",1000)
        );
        mealsTable.add(
                new MealPackage("BBQ",3500)
        );
        mealsTable.add(
                new MealPackage("chocolate larva cake",600)
        );
        mealsTable.add(
                new MealPackage("bread",500)
        );

        roomsTable.add(
                new Rooms("Single","single bed, attached bathroom",5,8000)
        );
        roomsTable.add(
                new Rooms("Double","double bed, a TV, and a small fridge.",10,12000)
        );
        roomsTable.add(
                new Rooms("Triple","Single bed and double bed, a TV, and a small fridge.",5,12000)
        );
        roomsTable.add(
                new Rooms("Quad","2 double beds, a TV, and a small fridge.",5,12000)
        );



    }
}
