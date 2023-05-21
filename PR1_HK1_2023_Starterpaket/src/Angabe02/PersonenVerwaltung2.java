package Angabe02;

import java.util.ArrayList;

public class PersonenVerwaltung2 {

    private ArrayList<Person> personenList;

    public PersonenVerwaltung2(ArrayList<Person> personenList) {
        this.personenList = personenList;
    }

    public void addPerson(Person p) {
        personenList.add(p);
    }

    public void removePerson(Person p) {
        personenList.remove(p);
    }

    public Person personId(int id) {
        for (Person person : personenList) {
            if (person.getId()==id){
                return person;
            }

        }
        return null;
    }

    public void personRemoveId(int id){
        for(Person person:personenList){
            if(person.getId()==id){
                personenList.remove(person);
            }
        }

    }
}
