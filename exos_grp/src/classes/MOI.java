public class MOI {
    public Menu MENU = new Menu();
     public BankAccount bankAccount = new BankAccount("BRED",0);
     public Carburant carburant = Carburant.DIESEL;
     public Voiture voiture = new Voiture("Renault Talisman",30,60,carburant);
     public User user = new User("nono",bankAccount,voiture);
}
