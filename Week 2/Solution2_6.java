package Bai2_6;
class Transaction {
    private final String transactionId;
    private final double amount;
    private final String timestamp;
    public Transaction(String transactionId, double amount, String timestamp) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.timestamp = timestamp;
    }
    public Transaction(Transaction other) {
        this.transactionId = other.transactionId;
        this.amount = other.amount;
        this.timestamp = other.timestamp;
    }
    public double getAmount() { return amount; }
}
class Account {
    private String accountId;
    private double balance;
    private Transaction[] history;
    private int count;
    public Account(String accountId, double balance, int capacity) {
        this.accountId = accountId;
        this.balance = balance;
        this.history = new Transaction[capacity];
        this.count = 0;
    }
    public void addTransaction(Transaction t) {
        if (count < history.length) {
            history[count++] = new Transaction(t);
        }
    }
    public Transaction[] getHistory() {
        Transaction[] safeCopy = new Transaction[count];
        for (int i = 0; i < count; i++) {
            safeCopy[i] = new Transaction(history[i]);
        }
        return safeCopy;
    }
    public static void main(String[] args) {
        Account acc = new Account("ACC123", 5000, 5);
        acc.addTransaction(new Transaction("T1", 100, "2026-06-01"));

        // Hacker tấn công
        Transaction[] hackedHistory = acc.getHistory();
        hackedHistory[0] = null;
        System.out.println("Dữ liệu gốc có bị ảnh hưởng không? Không hề!");
    }
}