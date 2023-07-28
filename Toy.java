public class Toy {
    private int id;
    private String name;
    private String description;
    private int weight;

    public Toy(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.weight = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}