package MaineCoine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String repeat = new String();
        float input;

        {
            System.out.println("hi, Welcome to the Currency Converter!");
            System.out.println("which currency You want to Convert ? 1.ILS to USD,2.USD to ILS , 3.ILS to ERU");
            System.out.println("Please enter a number 1-3");
            Scanner s1 = new Scanner(System.in);
            Scanner keyboard = new Scanner(System.in);
            Scanner in = new Scanner(System.in);

            {
                int choice = s1.nextInt();
                if (choice != 1 && choice != 2 && choice != 3) {
                    if (choice <= 3)
                        System.out.println("rong");
                    System.out.println("try agine");
                    while (repeat.equalsIgnoreCase("y"))

                        System.out.println("Would you like to square some numbers? Enter y/n ");
                    {
                        System.out.println("Please enter a number 1-3");
                        choice = s1.nextInt();
                        if (choice != 1 && choice != 2 && choice != 3) {
                            if (choice <= 3)
                                System.out.println("Would you like to continue? Enter y/n ");
                            repeat = keyboard.nextLine();
                        }

                    }
                    Coin UsdValue = CoinFactory.getConilnstance(Coins.USD);
                    Coin IlsValue = CoinFactory.getConilnstance(Coins.ILS);
                    Coin Eurvalu = CoinFactory.getConilnstance(Coins.EUR);
                    {
                        System.out.println("How much Money you want to convert ?");
                        input = s1.nextFloat();
                        {
                            switch (choice) {
                                case 1:
                                    System.out.println(input * UsdValue.getUsdValu());
                                    break;
                                case 2:
                                    System.out.println(input * IlsValue.getIlsValu());
                                    break;
                                case 3:
                                    System.out.println(input * Eurvalu.getEurvalue());
                                    break;

                            }
                            repeat = keyboard.nextLine();
                        }
                        while (repeat.equals("y")) ;

                        System.out.println("Would you like to continue? Enter y/n ");

                        if (choice == keyboard.nextInt()) {
                            System.out.println("ii");
                            return;
                        }
                        ;
                    }

                }


            }
        }
    }
}

