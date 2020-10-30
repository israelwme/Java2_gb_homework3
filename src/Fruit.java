import java.util.*;

public class Fruit {
    private List<String> fruits;

    public Fruit() {
        this.fruits = new ArrayList<>();
    }

    public void add(String element) {
        fruits.add(element);
    }

    public Map<String, Integer> calculate() {
        Map<String, Integer> fruitsMap = new HashMap<>();

        for (String fruit: fruits) {
            if (fruitsMap.containsKey(fruit)) {
                fruitsMap.put(fruit, fruitsMap.get(fruit) + 1);
            } else {
                fruitsMap.put(fruit, 1);
            }
        }

        return fruitsMap;
    }

    public List<String> getUnique() {
        List<String> fruits = new ArrayList<>();

        for (Map.Entry<String, Integer> fruit : calculate().entrySet()) {
            if (fruit.getValue() == 1) {
                fruits.add(fruit.getKey());
            }
        }

        return fruits;
    }

    public int hashCode() {
        return Objects.hash(fruits);
    }

}