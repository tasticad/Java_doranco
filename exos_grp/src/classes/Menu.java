import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Menu {

    public void menuPrincipal(User user)
    {
        //affichage rubrique centrale
        rubriqueCentrale();
        choixCentral(user,choice());


    }

    public void choixCentral(User user,int choice)
    {
        switch (choice()) {
            case 1:
                monnaie(user);
                break;
            case 2:
                cars(user.getVoiture());
                break;
        }
    }

    public void rubriqueCentrale()
    {
        String[] menu = {"gestion argent","gestion voiture"};
        for (int i = 0; i < menu.length;i++) {
            System.out.println((i+1)+":"+menu[i]);
        }
    }

    public void monnaie(User user)
    {
        //Choix d ajouter ou retirer
        System.out.println("1:Ajouter de l argent");
        System.out.println("2:Retirer de l argent");
        switch (choice())
        {
            case 1: addMonai(user);break;
            case 2: deleteMonai(user);break;
        }
    }

    public void addMonai(User user)
    {
        System.out.println("Combien voulez vous ajouter ? :");
        user.getBankAccount().addMontant(choice());
        //afficher le mouveau solde
        System.out.println("nouveau solde :"+user.getBankAccount().getSolde());
    }

    public void deleteMonai(User user)
    {
        System.out.println("Combien voulez vous retirer ? :");
        Scanner sc = new Scanner(System.in);
        int montant = sc.nextInt();
        if ( montant >= user.getBankAccount().getSolde())
        {
            //solde suffisant
            user.getBankAccount().deleteMontant(montant);
        }else
        {
            System.out.println("solde inssufisant");
        }
        //retour au menu
        menuPrincipal(user);
    }


    public void cars(Voiture voiture)
    {
        //verification du niveau de carburant
        if (voiture.getQtCarburant() < 50)
        {
            //en dessous de 50 pourcent -> plein
            System.out.println("1:plein a faire !");
        }else
        {
            //au dessus de 50 pourcent -> pas de plein
            System.out.println("2:carburant ok");
        }
    }

    public int choice() {
        //recuperation de saisie
        Scanner sc = new Scanner(System.in);
        //renvoi la valeur
        return sc.nextInt();
    }

}
