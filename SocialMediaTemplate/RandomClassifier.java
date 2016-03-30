package socialmedia;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * Created by Quade on 3/30/16.
 */
public class RandomClassifier extends Experimenter implements Classifier {
    @Override
    public Map<SocialMediaEntry, Boolean> classify(Set<SocialMediaEntry> testSet) {
        Map<SocialMediaEntry, Boolean> results = new HashMap<>();
        Random rand = new Random();

        for (SocialMediaEntry entry : testSet) {
            int num = rand.nextInt(2);

            if (num == 1) {
                results.put(entry, true);
            } else {
                results.put(entry, false);
            }
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
