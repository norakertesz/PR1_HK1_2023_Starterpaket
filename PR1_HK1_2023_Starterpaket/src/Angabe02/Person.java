package Angabe02;

public class Person {

    private int id;
    private String name;
    private int alter;
    private double groesse;
    private String nachname;
    private String geburtstagsland;
    private String zwietname;
    private String haarefarbe;
    private boolean hatGlatze;
    private float schuhgroesse;
    private boolean hatBeziehung;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburtstagsland() {
        return geburtstagsland;
    }

    public void setGeburtstagsland(String geburtstagsland) {
        this.geburtstagsland = geburtstagsland;
    }

    public String getZwietname() {
        return zwietname;
    }

    public void setZwietname(String zwietname) {
        this.zwietname = zwietname;
    }

    public String getHaarefarbe() {
        return haarefarbe;
    }

    public void setHaarefarbe(String haarefarbe) {
        this.haarefarbe = haarefarbe;
    }

    public boolean isHatGlatze() {
        return hatGlatze;
    }

    public void setHatGlatze(boolean hatGlatze) {
        this.hatGlatze = hatGlatze;
    }

    public float getSchuhgroesse() {
        return schuhgroesse;
    }

    public void setSchuhgroesse(float schuhgroesse) {
        this.schuhgroesse = schuhgroesse;
    }

    public boolean isHatBeziehung() {
        return hatBeziehung;
    }

    public void setHatBeziehung(boolean hatBeziehung) {
        this.hatBeziehung = hatBeziehung;
    }
}

