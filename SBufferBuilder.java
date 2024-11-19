public class SBufferBuilder {

    public static void main(String[] args) {
        String s = "Ola";
        s.concat("Hy");

        StringBuffer j = new StringBuffer();
        j.append(" Hello ");
        j.append(" World ");
        j.append(232);
        j.append('d');
        j.append(33.3333d);
        j.insert(6, " addedHere ");

        StringBuilder k = new StringBuilder("StringBuilder");
        k.append(" It's Working ");
        k.append(" Still Working:) ");
        k.insert(13, " Dam Stil :() ");

        System.out.println(s);
        System.out.println(j);
        System.out.println(k);

    }

}
