public class Account {
    private String iban;
    private double balance;
    private Person person;

    public Account(String iban, double balance, Person person) {
        this.iban = iban;
        this.balance = balance;
        this.person = person;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "IBAN: " + iban + " / " + balance;
    }

}
