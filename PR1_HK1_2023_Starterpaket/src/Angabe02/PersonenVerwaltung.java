package Angabe02;

public class PersonenVerwaltung {
    private Person[] personen; //Array des Typs Person, entkommentieren Sie die Zeile, wenn die Klasse Person erstellt wurde
    private int anzahlPersonen;

    public PersonenVerwaltung() {
        this.personen = new Person[10];
        this.anzahlPersonen = 0;
    }


    public void fuegePersonHinzu(Person p) {

        if (anzahlPersonen < personen.length) {
            personen[anzahlPersonen] = p;
            anzahlPersonen++;
        }

    }

    public Person lieferePersonMitId(int id) {
        for (int i = 0; i < personen.length; i++) {
            if (personen[i].getId() == id && personen[i] != null) {
                return personen[i];
            }

        }return null;
    }
    public void entfernePersonMitId(int id){
        for (int i = 0; i < personen.length; i++) {
            if(personen[i].getId() == id && personen[i] != null){
                personen[i]=null;
                break;
            }
        }

    }


}




