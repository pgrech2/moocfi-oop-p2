package ex27FinnishRingingCentre;

import java.util.ArrayList;
import java.util.HashMap;

public class RingingCentre {

    HashMap<Bird, ArrayList<String>> birdListHashMap = new HashMap<>();

    public void observe(Bird bird, String place){
        ArrayList<String> observations = new ArrayList<>();

        if (this.birdListHashMap.containsKey(bird)){
            observations = this.birdListHashMap.get(bird);
        }
        observations.add(place);
        this.birdListHashMap.put(bird, observations);
    }

    public void observations(Bird bird){
        ArrayList<String> observations = this.birdListHashMap.get(bird);
        if (observations != null) {
            System.out.println(bird.toString() + " observations: " + observations.size());
            for (String observation : observations) {
                System.out.println(observation);
            }
        } else {
            System.out.println(bird.toString() + " observations: " + 0);
        }

    }
}
