enum Dept {
    CS("John","Block A"), IT("James","Block B"), CIVIL("Henderson","Block C"), ECE("Gopal","Block D");

    //If we r giving name then we should also add it into our contructor otherwise it will give error
    String head;
    String location;
    private Dept(String head,String loc) {
        this.head = head;
        this.location = loc;
    }
    public void display()
    {
        System.out.println(this.name() + " " + this.ordinal());
    }
}

public class EnumDemo {
    public static void main(String[] abs) {
        Dept d = Dept.CIVIL;
        d.display();
        /*
         * switch (d) {
         * case CS:
         * System.out.println("Head: John \nBlock: A");
         * break;
         * 
         * case CIVIL:
         * System.out.println("Head: Handrison \nBlock: B");
         * break;
         * 
         * case IT:
         * System.out.println("Head: James \nBlock: c");
         * break;
         * 
         * case ECE:
         * System.out.println("Head: Charlie \nBlock: C");
         * break;
         */
    }

}
