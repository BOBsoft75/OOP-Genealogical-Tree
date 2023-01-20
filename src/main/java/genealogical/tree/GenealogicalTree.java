package genealogical.tree;

import genealogical.tree.controller.GenealogicalController;
import genealogical.tree.data.Human;
import genealogical.tree.data.Relation;
import genealogical.tree.data.Relative;

import java.util.ArrayList;
import java.util.List;

public class GenealogicalTree {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Ivan", 47, "male"));
        humans.add(new Human("Olga", 44, "female"));
        humans.add(new Human("Petr", 28, "male"));
        humans.add(new Human("Maria", 25, "female"));
        humans.add(new Human("Ruslan", 4, "male"));
        humans.add(new Human("Marina", 12, "female"));
        humans.add(new Human("Robert", 122, "male"));
        humans.add(new Human("Elvira", 128, "female"));
        humans.add(new Human("Alsu", 74, "female"));
        humans.add(new Human("Sergey", 62, "male"));

        List<Relative> relatives = new ArrayList<>();
        relatives.add(new Relative("Ivan", Relation.HUSBAND, "Olga"));
        relatives.add(new Relative("Maria", Relation.WIFE, "Petr"));
        relatives.add(new Relative("Ruslan", Relation.SON, "Olga"));
        relatives.add(new Relative("Marina", Relation.DAUGHTER, "Maria"));
        relatives.add(new Relative("Robert", Relation.HUSBAND, "Elvira"));
        relatives.add(new Relative("Elvira", Relation.GRANDMA, "Ivan"));
        relatives.add(new Relative("Alsu", Relation.GRANDDUCH, "Elvira"));
        relatives.add(new Relative("Sergey", Relation.GRANDSON, "Robert"));

        GenealogicalController genealogicalController = new GenealogicalController();

        System.out.println("Search of Petr: " + genealogicalController.getHuman(humans, "Petr"));
        System.out.println("Petr's relatives: " + genealogicalController.getFilteredData(relatives, "Petr"));

        System.out.println("Search of Olga: " + genealogicalController.getHuman(humans, "Olga"));
        System.out.println("Olga's relatives: " + genealogicalController.getFilteredData(relatives, "Olga"));
        System.out.println("Olga's relatives: " + genealogicalController.getFilteredData(relatives, "Olga"));
    }
}
