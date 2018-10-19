package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                // Week 5 Saved

                ArrayList<Item> cafe = new ArrayList<>();
                ArrayList<Double> tax = new ArrayList<>();
                Scanner input = new Scanner(System.in);
                Random rand = new Random();

                tax.add(6.00);
                tax.add(5.30);
                tax.add(5.75);
                tax.add(5.00);

                int taxRate = rand.nextInt(4)+1;

                String add = "";
                do {
                    System.out.println("Enter item name");
                    String item = input.nextLine();

                    System.out.println("Price");
                    double price = input.nextDouble();

                    System.out.println("Quantity");
                    int quantity = input.nextInt();

                    System.out.println("Taxable (True or false)?");
                    boolean taxable = input.nextBoolean();

                    cafe.add(new Item(item, price, quantity, taxable));

                    System.out.println("Add another item. Y(yes) or N(no)");
                    add = input.next();

                    input.nextLine();

                } while (add.equalsIgnoreCase("Y") || add.equalsIgnoreCase("yes"));

                System.out.println("\nMy current tax rate is: " + tax.get(taxRate));
                System.out.println("Item Name " + "\t\t" + "Quantity" + "\t\t" + "Price" + "\t\t" + "Cost" + "\t\t" + "Taxable");
                System.out.println("===================================================================================================================");


                double purchaseamount = 0;
                double Salestax=0, value = 0;
                double Total = 0;
                for (Item g : cafe) {
                    System.out.println(g.getName() + "\t\t\t" + g.getQuantity() + "\t\t\t\t" + String.format("%.2f", g.getPrice()) + "\t\t\t" + String.format("%.2f", g.getCost()) + "\t\t\t\t" + g.isTaxable());


                    purchaseamount += g.getCost();
                    if (g.isTaxable()){
                        Salestax = (g.getCost() * (tax.get(taxRate) / 100));
                        value += Salestax;
                    }
                    Total = purchaseamount + value;
                }

                System.out.println("\nSubtotal: $" + String.format("%.2f", purchaseamount));
                System.out.println("Tax Rate= " + tax.get(taxRate) + "%");
                System.out.println("Sales Tax: $" + String.format("%.2f", value++));

                System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                System.out.println("Total: $" + String.format("%.2f", Total));
            }

        }

