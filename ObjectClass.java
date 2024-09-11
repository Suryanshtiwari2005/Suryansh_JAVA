//parent class of all the class in java even user defined class

class MyObject {
    public String toString() {
        return "My Object";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }
    // we cannot overRide wait() & notify() as they are final methods
}

public class ObjectClass {
    public static void main(String[] args) {
        /*
         * Object o1 = new Object();
         * Object o2 = o1;
         * System.out.println(o1.equals(o2));
         * System.out.println(o1.hashCode()); //Created using address of Object
         */
        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();
        System.out.println(o1.equals(o2));

    }
}
