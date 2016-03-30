package socialmedia;

import java.util.Map;
import java.util.Set;

/**
 * Created by Quade on 3/30/16.
 */
public interface Classifier {
    Map<SocialMediaEntry, Boolean> classify(Set<SocialMediaEntry> testSet);
}
