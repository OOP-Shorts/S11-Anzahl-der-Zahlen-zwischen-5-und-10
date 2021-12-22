public class NumBetween5And10 {

    /*
        Schreiben Sie eine Methode, die einen int-Wert übergeben bekommt und einen boolean-Wert zurückgibt, abhängig
        davon, ob die übergebene Zahl zwischen 5 und 10 liegt (5 und 10 eingeschlossen)
     */
    public static boolean intNumBetween5And10(int value) {
        return false;
    }

    public static void main(String[] args) {
        int testValueOne = 10;
        int testValueTwo = 2;
        boolean testOne = intNumBetween5And10(testValueOne);
        boolean testTwo = intNumBetween5And10(testValueTwo);

        if(testOne && !testTwo) {
            System.out.print("Correct!");
        } else {
            System.out.println("Your method does not recognise the interval correctly.");
        }
    }
}
