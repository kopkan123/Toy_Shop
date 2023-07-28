import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    private List<Toy> toys;
    private Random random;

    public ToyStore() {
        toys = new ArrayList<>();
        random = new Random();
    }

    public void addNewToy(Toy toy) {
        toys.add(toy);
    }

    public void setToyWeight(int toyId, int weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public Toy drawRandomToy() {
        int totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        int randomNumber = random.nextInt(totalWeight) + 1;
        int accumulatedWeight = 0;

        for (Toy toy : toys) {
            accumulatedWeight += toy.getWeight();
            if (randomNumber <= accumulatedWeight) {
                return toy;
            }
        }

        return null;
    }

    public void displayToys() {
        for (Toy toy : toys) {
            System.out.println("ID: " + toy.getId() + ", Имя: " + toy.getName() +
                    ", Описание: " + toy.getDescription() + ", Вес: " + toy.getWeight());
        }
    }
}
