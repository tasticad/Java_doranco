public class User {
    private String nom;
    private BankAccount bankAccount;
    private Voiture voiture;

    public User(String nom, BankAccount bankAccount, Voiture voiture)
    {
        this.nom = nom;
        this.bankAccount = bankAccount;
        this.voiture = voiture;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public String getNom() {
        return nom;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public Voiture getVoiture() {
        return voiture;
    }
}
