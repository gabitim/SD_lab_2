package interfaces;

/**
 * @author Timofti Gabriel
 */
public interface BankAccountBeanRemote {
    Boolean withdraw(Integer amount);
    void deposit(Integer amount);
    Integer getBalance();
}
