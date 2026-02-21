
/*
 * equals(Object obj)
 * ------------------
 * Used to compare two objects.
 * Default: compares memory references.
 * Override it to compare object data (content comparison).
 */

class Person {
    int id;

    Person(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return this.id == p.id;
    }

    public static void main(String[] args) {
        Person p1 = new Person(10);
        Person p2 = new Person(10);
        System.out.println(p1.equals(p2)); // true
    }
}
