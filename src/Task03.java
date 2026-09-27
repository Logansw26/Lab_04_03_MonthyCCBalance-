class Task03 {
    private static String[] args;

    static void main(String[] args) {
        Task03.args = args;

        // Starting credit card balance
        double balance = 5000;

        // Interest rate is 17%
        double interestRate = 0.17;

        // Calculate interest for the first month
        double interest1 = balance * interestRate / 12;

        // Add interest to the balance
        double balance1 = balance + interest1;

        // Calculate interest for the second month
        double interest2 = balance1 * interestRate / 12;

        // Add second month's interest to the balance
        double balance2 = balance1 + interest2;

        // Display the results
        System.out.println("Balance after one month: $" + balance1);

        System.out.println("Balance after two months: $" + balance2);
    }

}