import java.util.Scanner;
public class Main {
    //CODE TO WRITE A SYSTEM FOR USERS TO PURCHASE DATA

    //FUNCTION TO RUN IF USER GETS TO LAST STAGE OF BUYING DATA
    static void completePurchase(){
        Scanner dataEnd = new Scanner(System.in);
        System.out.println("What should happen when your data finishes?\n1 Continue browsing from " +
                "airtime/160Mb extra\n2 Stop my data");
        byte finalChoice = dataEnd.nextByte();
        switch (finalChoice){
            case 1:
                System.out.println("You have successfully activated the data plan. You will be browsing " +
                        "from your airtime once your data finishes");
                break;
            case 2:
                System.out.println("You have successfully activated your data plan.");
                break;
            default:
                System.out.println("Wrong input. Quit and start again");

        }
    }
    //FUNCTION TO RUN IF USER GETS TO LAST STAGE OF BUYING DATA


    //FUNCTION TO RUN IF USER ENTERS CORRECT INPUT
    static void buyAirtime() {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("""
                1 My Offer
                2 Data Bundles
                3 1500 / 6GB / 7days
                4 Family Plan/Monthly+
                5 Everyday On
                6 Binge""");
        byte action1 = dataInput.nextByte();

        //CONDITION TO DETERMINE DATAPLAN
        switch (action1) {
            case 1:
                System.out.println("1. 1GB/N300/daily\n2. 2GB/N500/daily\n3. 6GB/N1500/7days" +
                        "\n4. 750MB/N500/14days\n5. 1.5GB/N1000/monthly" +
                        "\n6. 2GB/N1200/monthly\n7. 3GB/N1500/monthly");
                byte action2 = dataInput.nextByte();
//                byte action4 = dataInput.nextByte();
                switch (action2) {
                    case 1:
                        completePurchase();
                        break;
                    case 2:
                        completePurchase();
                        break;
                    case 3:
                        completePurchase();
                        break;
                    case 4:
                        completePurchase();
                        break;
                    case 5:
                        completePurchase();
                        break;
                    case 6:
                        completePurchase();
                        break;
                    case 7:
                        completePurchase();
                        break;
                    default:
                        System.out.println("Wrong input. Quit and start again");
                }
                break;
            case 2:
                System.out.println("1. Daily/Weekly bundles\n2. Weekly bundles\n3. Monthly bundles" +
                        "\n4. Data++\n5. Mega bundles\n6. Big Data Plans");
                byte action3 = dataInput.nextByte();
//                byte action4 = dataInput.nextByte();
                switch (action3) {
                    case 1:
                        System.out.println("Daily/Weekly Bundles\n1. N50/40MB/Daily\n2. N100/100MB/daily" +
                                "\n3. N200/200MB/3days\n4. N300/350MB/7days\n5. N500/750MB/14days" +
                                "\n6. N300/1GB/daily\n7. N500/2GB/daily");
                        byte action4 = dataInput.nextByte();
                        switch (action4) {
                            case 1:
                                completePurchase();
                                break;
                            case 2:
                                completePurchase();
                                break;
                            case 3:
                                completePurchase();
                                break;
                            case 4:
                                completePurchase();
                                break;
                            case 5:
                                completePurchase();
                                break;
                            case 6:
                                completePurchase();
                                break;
                            case 7:
                                completePurchase();
                                break;
                            default:
                                System.out.println("Wrong input. Quit and start again");
                        }
                        break;
                    case 2:
                        System.out.println("Weekly Bundles\n1. N300/350MB/7days\n2. N500/750MB/14days" +
                                "\n3. N1500/6GB/7days" + "\n4. N500/1GB/7days\n5. N100/All social/5days");
                        byte takeaction4 = dataInput.nextByte();
                        switch (takeaction4) {
                            case 1:
                                completePurchase();
                                break;
                            case 2:
                                completePurchase();
                                break;
                            case 3:
                                completePurchase();
                                break;
                            case 4:
                                completePurchase();
                                break;
                            case 5:
                                completePurchase();
                                break;
                            default:
                                System.out.println("Wrong input. Quit and start again");
                        }
                        break;
                    case 3:
                        System.out.println("Monthly Bundles\n1. N1000/1.5GB\n2. N1200/2GB" +
                                "\n3. N1500/3GB\n4. N2000/4.5GB\n5. N2500/6Gb" +
                                "\n6. N3000/10GB\n7. N4000/11GB\n8. N5000/20GB");
                      byte take_action = dataInput.nextByte();
                        switch (take_action) {
                            case 1:
                                completePurchase();
                                break;
                            case 2:
                                completePurchase();
                                break;
                            case 3:
                                completePurchase();
                                break;
                            case 4:
                                completePurchase();
                                break;
                            case 5:
                                completePurchase();
                                break;
                            case 6:
                                completePurchase();
                                break;
                            case 7:
                                completePurchase();
                                break;
                            case 8:
                                completePurchase();
                                break;
                            default:
                                System.out.println("Wrong input. Quit and start again");
                        }
                        break;
                    case 4:
                        System.out.println("1. N500/2.5GB/2days\n2. N3000/11GB/30 days\n3. N4000/15GB/30days" +
                                "\n4.N5000/22GB/30days");
                        byte action12 = dataInput.nextByte();
                        switch (action12) {
                            case 1:
                                completePurchase();
                                break;
                            case 2:
                                completePurchase();
                                break;
                            case 3:
                                completePurchase();
                                break;
                            case 4:
                                completePurchase();
                                break;
                            default:
                                System.out.println("Wrong input. Quit and start again");
                        }
                        break;
                    case 5:
                        System.out.println("30 day bundles\n1. N5,000/20GB\n2. N8,000/30GB\n3. N10,000/40GB" +
                                "\n4. N15,000/75GB\n5. N20,000/120GB");
                      byte action11 = dataInput.nextByte();
                        switch (action11) {
                            case 1:
                                completePurchase();
                                break;
                            case 2:
                                completePurchase();
                                break;
                            case 3:
                                completePurchase();
                                break;
                            case 4:
                                completePurchase();
                                break;
                            case 5:
                                completePurchase();
                                break;
                            default:
                                System.out.println("Wrong input. Quit and start again");
                        }
                        break;
                    case 6:
                        System.out.println("1. N30,000/240GB/30 days\n2. N36,000/280GB/30days" +
                                "\n3. N50,000/400GB/90days\n4. N60,000/500GB/120days\n5. N100,000/1TB/365days");
                        byte action10 = dataInput.nextByte();
                        switch (action10) {
                            case 1:
                                completePurchase();
                                break;
                            case 2:
                                completePurchase();
                                break;
                            case 3:
                                completePurchase();
                                break;
                            case 4:
                                completePurchase();
                                break;
                            case 5:
                                completePurchase();
                                break;
                            default:
                                System.out.println("Wrong input. Quit and start again");
                        }
                        break;
                    default:
                        System.out.println("Wrong input. Quit and start again");
                }
                break;
            case 3:
                completePurchase();
                break;
            case 4:
                System.out.println("Family plans/Monthly+\n1. Family plans+\n2. Family data plan" +
                        "\n3. Booster plan");
                byte action6 = dataInput.nextByte();
                byte action5 = dataInput.nextByte();
                switch (action6) {
                    case 1:
                        System.out.println("Family Plans+\n1. N3,000 for 10GB + 100MINS & 100 SMS" +
                                "\n2. N5,000 for 20GB +300MINS & 100SMS" +
                                "\n3. N10,000 for 50GB + 750MINS & 100SMS");
                        switch (action5) {
                            case 1:
                                completePurchase();
                                break;
                            case 2:
                                completePurchase();
                                break;
                            case 3:
                                completePurchase();
                                break;
                            default:
                                System.out.println("Wrong input. Quit and start again");
                        }
                        break;
                    case 2:
                        switch (action5) {
                            case 1:
                                completePurchase();
                                break;
                            case 2:
                                completePurchase();
                                break;
                            case 3:
                                completePurchase();
                                break;
                            default:
                                System.out.println("Wrong input. Quit and start again");
                        }
                        break;
                    case 3:
                        System.out.println("1. N2000 for 8GB\n2. N4000 for 18GB");
                        switch (action5) {
                            case 1:
                                completePurchase();
                                break;
                            case 2:
                                completePurchase();
                                break;
                            case 3:
                                completePurchase();
                                break;
                            default:
                                System.out.println("Wrong input. Quit and start again");
                        }
                        break;
                    default:
                        System.out.println("Wrong input. Quit and start again");

                }
                break;
            case 5:
                System.out.println("1. N3000/15GB/30days\n2. N6000/45GB/30days\n3. N60/200MB/daily" +
                        "\n4. N120/450MB/daily");
                byte action7 = dataInput.nextByte();
                switch (action7){
                    case 1:
                        completePurchase();
                        break;
                    case 2:
                        completePurchase();
                        break;
                    case 3:
                        completePurchase();
                        break;
                    case 4:
                        completePurchase();
                        break;
                    default:
                        System.out.println("Wrong input. Quit and start again");
                }
                break;
            case 6:
                System.out.println("1. N300/1GB/daily\n2. N500/2GB/daily\n3. N1500/6GB/7days");
                byte action8 = dataInput.nextByte();
                switch (action8){
                    case 1:
                        completePurchase();
                        break;
                    case 2:
                        completePurchase();
                        break;
                    case 3:
                        completePurchase();
                        break;
                    default:
                        System.out.println("Wrong input. Quit and start again");
                }
                break;
            default:
                System.out.println("Wrong input. Quit and start again");
        }
    }
    //FUNCTION TO RUN IF USER ENTERS CORRECT INPUT END


    //MAIN CODE
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter *123# to start the system");
        String code1 = input.nextLine();

        //CONDITION TO DETERMINE THE FLOW OF LOGIC
        switch (code1){
            case "*123#":
                System.out.println("Select a network\n1 for Airtel\n2 for MTN\n3 for Glo\n4 for 9mobile");
                byte network = input.nextByte();
                switch (network){
                    case 1:
                        System.out.println("You are about to buy Airtel data");
                        buyAirtime();
                        System.out.println("You just bought Airtel data");
                        break;
                    case 2:
                        System.out.println("You are about to buy MTN data");
                        buyAirtime();
                        System.out.println("You just bought MTN data");
                        break;
                    case 3:
                        System.out.println("You are about to buy Glo data");
                        buyAirtime();
                        System.out.println("You just bought Glo data");
                        break;
                    case 4:
                        System.out.println("You are about to buy 9mobile data");
                        buyAirtime();
                        System.out.println("You just bought 9mobile data");
                        break;
                    default:
                        System.out.println("Wrong input. Start again");
                }
                break;
            default:
                System.out.println("Error. Try again");
        }
    }
}