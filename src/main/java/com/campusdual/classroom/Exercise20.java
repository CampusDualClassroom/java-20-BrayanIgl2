package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {

        List<Person> personas = new ArrayList<>();
        personas.add(new Person("John","Smith"));
        personas.add(new Teacher("Maria","Montessori","Educacion"));
        personas.add(new PoliceOfficer("Jake","Peralta","B-99"));
        personas.add(new Doctor("Gregory","House","Nefrologia y infectologia"));

        return personas;
    }

    public static void showPeopleDetails(List<Person> stringList) {

        for (Person p : stringList){
            p.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
