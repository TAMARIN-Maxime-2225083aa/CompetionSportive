public class Main {
    public static void main(String[] args) {
        Amateur amat1 = new Amateur("Tamarin","Max");
        Amateur amat2 = new Amateur("Hospital","Jules");
        Amateur amat3 = new Amateur("Rouge","Gab");
        Amateur amat4 = new Amateur("Diop","Sook");

        Competiteur comp1 = new Competiteur("n Comp1","p Comp1");
        Competiteur comp2 = new Competiteur("n Comp2","p Comp2");
        Competiteur comp3 = new Competiteur("n Comp3","p Comp3");
        Competiteur comp4 = new Competiteur("n Comp4","p Comp4");

        Competition compet1 = new Competition(amat1,amat2,amat3,amat4,comp1,comp2,comp3,comp4);
        System.out.println(compet1.getAmateurs());

        amat2.setScore(10);
        amat4.setScore(10);

        comp2.setScore(10);
        comp4.setScore(10);
        comp1.setScore(5);

        System.out.println(compet1.getComptetiteurs());
        System.out.println("\n\n");
        System.out.println(compet1.toString());
    }
}