package src.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive{

    public class Size{
        public int height;
        public int weight;
    }

    private static int nextId = 0;
    private int id;
    protected int age;
    protected String name;
    private BloodGroup bloodGroup;

    protected Size size;

    private List<Human> children = new ArrayList<>();

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBloodGroup(BloodGroup code) {
        bloodGroup = code;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public String getPosition(){
        return "Человек";
    }

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public void removeChild(Human child) {
        children.remove(child);
    }

    public void printSize() {
        System.out.println("Рост: " + size.height + " Вес: " + size.weight);
    }

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }

    public void live() {}
}