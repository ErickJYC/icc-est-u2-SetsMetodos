import controller.ContactoController;
import controller.Sets;

public class App {
    public static void main(String[] args) {
        runHastSet();
        runLinkedHashSet();
        runHastTree();
        runTreeSetConComparador();
        runTreeSetConComparadorAlfabetico();
        ContactoController contactoController = new ContactoController();
    }
    public static void runHastSet() {
        Sets sets = new Sets();
        System.out.println("---- HastSet ----");
        System.out.println(sets.construirHastSet());
    }
    public static void runLinkedHashSet() {
        Sets sets = new Sets();
        System.out.println("---- LinkedHashSet ----");
        System.out.println(sets.construirLinkedHashSet());
    }
    public static void runHastTree() {
        Sets sets = new Sets();
        System.out.println("---- HastTree ----");
        System.out.println(sets.construisTreeSet());
    }
    public static void runTreeSetConComparador() {
        Sets sets = new Sets();
        System.out.println("---- TreeSetConComparador ----");
        System.out.println(sets.construirTreeSetConComparador());
    }
    public static void runTreeSetConComparadorAlfabetico() {
        Sets sets = new Sets();
        System.out.println("---- TreeSetConComparadorAlfabetico ----");
        System.out.println(sets.construirTreeSetConComparadorAlfabeticamente());
    }
}
