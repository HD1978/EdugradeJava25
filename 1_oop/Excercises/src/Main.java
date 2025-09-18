//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Övningsuppgifter Grundläggande programmeringskoncept */
        // 1. Variabler och Datatyper //

        System.out.println("| --------------------------------- |");
        System.out.println("| Uppgifter 1.1 Deklarera variabler |");
        System.out.println("| --------------------------------- |");

        int age = 30;                   // age är ett heltal med värdet 30
        double height = 1.75;           // height är ett flyttal med värdet 1.75
        char initial = 'A';             // initial är ett enskilt tecken A
        String name = "Alice";          // name är en textsträng med värdet Alice (OBS! String med stort S)
        boolean isStudent = true;       // isStudent har värdet sant

        System.out.println();       // lägga till en tom rad

        System.out.println("| ------------------------------------------- |");
        System.out.println("| Uppgifter 1.2 Skriva ut variabler och värde |");
        System.out.println("| ------------------------------------------- |");

        System.out.println();       // lägga till en tom rad

        System.out.println("Variabeln age har värdet: " +age +", och är av typen: " +((Object)age).getClass().getName());

        System.out.println("Variabeln height har värdet: " +height +", och är av typen: " +((Object)height).getClass().getName());

        System.out.println("Variabeln initial har värdet: " +initial +", och är av typen: " +((Object)initial).getClass().getName());

        System.out.println("Variabeln name har värdet: " +name +", och är av typen: " +((Object)name).getClass().getName());

        System.out.println("Variabeln isStudent har värdet: " +isStudent +", och är av typen: "+((Object)isStudent).getClass().getName());

        System.out.println();

        // 2. Operatorer och Uttryck //
        System.out.println("| ------------------------------------ |");
        System.out.println("| Uppgifter 2.1 Aritmetiska operatorer |");
        System.out.println("| ------------------------------------ |");

        int sum = 10 + 20;
        System.out.println("Summan av 10 och 20 är: " +sum);

        int sub = 100 - 30;
        System.out.println("Skillnaden mellan 100 och 30 är: " +sub);

        int mult = 5 * 7;
        System.out.println("Produkten av 5 och 7 är: " +mult);

        int div = 20 / 4;
        System.out.println("Kvoten av 20 och 4 är: " +div);

        int rest = 10%3;
        System.out.println("Resten när 10 delas med 3 är: " +rest);

        System.out.println();

        System.out.println("| ------------------------- |");
        System.out.println("| Uppgifter 2.2 Jämföra tal |");
        System.out.println("| ------------------------- |");
        System.out.println();

        int a = 15;
        int b = 20;

        boolean isEqual = (a == b);
        System.out.println("a är " +a +" och b är " +b +". Är a och b lika? Svar: " +isEqual);
        boolean isGreater = (a > b);
        System.out.println("Är a störren än b? Svar: " +isGreater);
        boolean isLesserOrEqual = (a <= b);
        System.out.println("Är a mindre än eller lika med b? Svar: " +isLesserOrEqual);

        System.out.println();

        System.out.println("| -------------------------------- |");
        System.out.println("| Uppgifter 2.3 Logiska operatorer |");
        System.out.println("| -------------------------------- |");
        System.out.println();

        int x = 10;
        int y = 5;
        int z = 20;

        System.out.println("x = " +x +", y = " +y +", z = " +z);

        boolean andResult = (x > y) && (z > y);
        System.out.println("Är x större än y OCH z större än y? Svar: " +andResult);

        boolean orResult = (x > y) || (z < y);
        System.out.println("Är x större än y ELLER z mindre än y? Svar: " +orResult);

        boolean notResult = !(x > y);
        System.out.println("Vad blir resultatet om man VÄNDER på x större än y? Svar: " +notResult);

        System.out.println();
        System.out.println("| --------------------------------------------------------- |");
        System.out.println("| Uppgifter 2.4 Kombination av aritmetiska och jämförelseop |");
        System.out.println("| --------------------------------------------------------- |");
        System.out.println();

        int d = 10;
        int e = 5;
        int f = 2;
        int g = 20;

        boolean _isGreater = ((d + e) * f > g);
        System.out.println("Är påståendet (" +d +" + " +e +") * " +f +" > " +g +" korrekt? Svar: " +_isGreater);







    }
}