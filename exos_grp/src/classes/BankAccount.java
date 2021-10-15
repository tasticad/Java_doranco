public class BankAccount {
    String name;
    int solde;

    public BankAccount(String name, int solde)
    {
        this.name = name;
        this.solde = solde;
    }

    public void addMontant(int montant)
    {
        this.solde += montant;
    }
    public void deleteMontant(int montant)
    {
        this.solde -= montant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public String getName() {
        return name;
    }

    public int getSolde() {
        return solde;
    }
}
