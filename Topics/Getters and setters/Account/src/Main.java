class Account {

    private long balance;

    public void setBalance(long balance) {
        this.balance = balance;
    }
    public long getBalance() {
        return balance;
    }

    private String ownerName;
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName (String ownerName) {
        this.ownerName = ownerName;
    }
    private boolean locked;

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}