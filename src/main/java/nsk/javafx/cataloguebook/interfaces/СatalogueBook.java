package nsk.javafx.cataloguebook.interfaces;

import javafx.collections.ObservableList;
import nsk.javafx.cataloguebook.objects.Person;

public interface –°atalogueBook {

    boolean add(Person person);

    boolean update(Person person);

    boolean delete(Person person);

    ObservableList<Person>findAll();

    ObservableList<Person>find(String text);

}
