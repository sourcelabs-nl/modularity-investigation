package nl.rabobank.c4.cleanexample.bankaccount;


public interface BankAccountComponent {

    BankAccount getBankaccount(String bankaccountNumber);

    void save(BankAccount bankAccount);
}
