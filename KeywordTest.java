package Final.keyword;

public class KeywordTest {
    public static void main(String[] args) {
        final player abcd  = new player();
        abcd.Cricket();
        System.out.println("Number of runs is " + abcd.numberOfRuns());// return 2;

        player Rohitsharma = new RohitSharma();
        Rohitsharma.Cricket();
        System.out.println(" runs is  " + Rohitsharma.numberOfRuns());
    }
}
