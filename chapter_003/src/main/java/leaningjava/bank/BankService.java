package leaningjava.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        User user1 = findByPassport(user.getPassport());
        users.put(user, new ArrayList<Account>());

    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        users.get(user).add(account);
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (Map.Entry<User, List<Account>> value : users.entrySet()) {
            User user = value.getKey();
            if (user.getPassport().equals(passport)) {
                rsl = user;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account account1 = null;
        if (user != null) {
            List<Account> account = users.get(user);
            for (Account acc : account) {
                if (acc.getRequisite().equals(requisite)) {
                    account1 = acc;
                }
            }
        }
        return account1;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
       boolean rsl = false;
       Account account1 = findByRequisite(srcPassport,srcRequisite);
       Account account2 = findByRequisite(destPassport, dеstRequisite);
       if (account1.getBalance() >= amount && account1 != null){
           account1.setBalance(account1.getBalance() - amount);
           account2.setBalance(account2.getBalance() + amount);
           rsl = true;
       }
       return rsl;
    }

}
