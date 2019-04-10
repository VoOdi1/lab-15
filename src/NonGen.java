
public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getob() {
        return ob;
    }

    void showТype() {
        System.out.println("Oбъeкт оЬ относится к типу " +
                ob.getClass().getName());
    }

}
