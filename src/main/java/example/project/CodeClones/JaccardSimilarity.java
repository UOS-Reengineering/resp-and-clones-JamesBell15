package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        Set<String> intersectionResult = new HashSet<>(set1);
        Set<String> unionResult = new HashSet<>(set1);

        intersectionResult.retainAll(set2);
        unionResult.addAll(set2);

        double intersectionSize = intersectionResult.size();
        double unionSize = unionResult.size();

        return (double) (intersectionSize/unionSize);
    }
}
