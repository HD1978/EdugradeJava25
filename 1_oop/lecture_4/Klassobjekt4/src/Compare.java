public class Compare {

    void boklength (String firstbookTitle, int firstbookPages, String secondbookTitle, int secondbookPages) {

        if (firstbookPages > secondbookPages) {
            System.out.println("Boken " + firstbookTitle + " är längre än boken " + secondbookTitle + "!");
        }
        else
            System.out.println("Boken " + secondbookTitle + " är längre än boken " + firstbookTitle + "!");
    }
}
