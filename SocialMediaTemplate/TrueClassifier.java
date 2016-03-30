package socialmedia;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Quade on 3/30/16.
 */
public class TrueClassifier extends Experimenter implements Classifier {
    @Override
    public Map<SocialMediaEntry, Boolean> classify(Set<SocialMediaEntry> testSet) {
        Map<SocialMediaEntry, Boolean> results = new HashMap<>();

        for (SocialMediaEntry entry : testSet) {
            results.put(entry, true);
        }

        return results;
    }

    @Override
    protected Map<SocialMediaEntry, Boolean> classifyEntries(Set<SocialMediaEntry> trainingSet,
                                                           Set<SocialMediaEntry> testSet) {

        System.out.println("Running classifier...");

        // In a real use case, build a machine learning model from the training set,
        // then use it to classify the entries in the test set.
        Map<SocialMediaEntry, Boolean> results = classify(testSet);

        return results;
    }
}
