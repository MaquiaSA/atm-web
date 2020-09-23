package th.ac.ku.atm.service;

import org.springframework.stereotype.Service;
import th.ac.ku.atm.model.BankAccount;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {

    private ArrayList<BankAccount> bankAccountList;

    @PostConstruct
    public void postContruct() {
        bankAccountList = new ArrayList<>();
    }

    public void createBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public List<BankAccount> getBankAccounts() {
        return new ArrayList<>(this.bankAccountList);
    }

    public BankAccount findCustomer(int id) {
        for (BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getId() == id)
                return bankAccount;
        }
        return null;
    }

}