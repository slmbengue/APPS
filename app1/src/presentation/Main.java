package presentation;

import entity.Etudiant;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Declaration d'ue liste d'etudiants
        List<Etudiant> liste =new ArrayList<>();
        int N;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Donner le nombre d'etudiants");
            N = scanner.nextInt();
        }while(N<=0);
        System.out.println("Remplissage de la liste d'etudiants");
        for (int i = 0; i < N; i++){
            Etudiant et = new Etudiant();
            et.saisie();
            liste.add(et);
        }
        System.out.println("Affichage de la liste d'etudiants");
        for (int i = 0; i < liste.size(); i++) {
            liste.get(i).affiche();
        }
    }
}