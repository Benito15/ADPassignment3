package ac.za.cput;

import java.util.Objects;

public class Person {

    private int id;
    private String name;

    public Person() {

    }

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

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj == null || obj.getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return name.equals(person.name);
    }

    public int hashCode()
    {

        return Objects.hash(name);
    }
//testing nvm
public int money(int a ,int b)
{
    return a + b;

}




}
