package example.project.CodeClones;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {
        // TODO: complete this function to print the dot plot of two string arrays

        for (char charcter : sequence2){
            System.out.print("\t" + charcter);
        }

        System.out.print("\t\n");

        for (char charcterI : sequence1) {
            System.out.print(charcterI);
            for (char charcterJ : sequence2) {
                if (charcterI == charcterJ) {
                    System.out.print("\t" + "+");
                } else {
                    System.out.print("\t" + " ");
                }
            }
            System.out.print("\t\n");
        }
    }
}
