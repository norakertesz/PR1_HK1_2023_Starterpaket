package Angabe02;

import java.util.Scanner;

public class PersonTest {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonenVerwaltung pv = new PersonenVerwaltung();
        int choice = 0;
        int id= 1;
        do {
            //Menue anbieten
            System.out.println("\n---Willkommen zu Aufgabe01---");
            System.out.println("1: neue Person hinzufuegen");
            System.out.println("2: Personendaten einer gewissen Person ausgeben");
            System.out.println("3: Eine gewisse Person entfernen");
            System.out.println("4: Exit -> Programm beenden\n");
            //Eingabe auffordern
            System.out.print("Bitte jetzt Zahl eingaben: ");
            choice = scanner.nextInt();

            if(choice==1) {
                System.out.print("Name der Person eingeben: ");
                String name = scanner.next();
                //Hinzufuegen - wobei wir die id immer fortlaufend erhoehen
                pv.fuegePersonHinzu(new Person(id, name));
                System.out.println("fuegePersonHinzu() -> Neue Person "+name+" mit ID: "+id+" wurde hinzugefuegt!");
                //ID nach jedem hinzufuegen erhohen
                id++;
            } else if (choice==2) {
                System.out.print("Welche Person soll ausgegeben werden, geben Sie bitte die ID an: ");
                int neueId = scanner.nextInt();
                //null abfangen und Informieren
                if (pv.lieferePersonMitId(neueId) == null) {
                    //Informieren
                    System.out.println("lieferePersonMitId() -> Eine Person mit dieser ID gibt es nicht");
                } else {
                    //Ausgeben der gefundenen Person
                    System.out.println("Person heisstt: " + pv.lieferePersonMitId(neueId).getName());
                }
            } else if (choice==3) {
                System.out.print("Welche Person soll entfernt werden, geben Sie bitte die ID an: ");
                int neueId = scanner.nextInt();
                //Entfernen der Person
                System.out.println("\nentfernePersonMitId() -> Person wird nun entfernt.");
                pv.entfernePersonMitId(neueId);
            } else if (choice==4) {
                System.out.println("\nProgramm wird Beendet - Ciao");
            } else {
                //alle anderen Eingaben abfangen
                System.out.print("Die Eingabe war leider Falsch bitte nur Zahlen zwischen 1-4 eingeben!");
                //Wert wieder zuruecksetzen
                choice = 0;
            }
        }while(choice!=4);
    }


    }





