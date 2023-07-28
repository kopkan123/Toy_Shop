public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "Конструктор лего", "Построй свой мир!");
        Toy toy2 = new Toy(2, "Медвежонок", "Лутший друг!");
        Toy toy3 = new Toy(3, "Машинка на радио управлении", "Гонка прямо в твоем доме!");
        toyStore.addNewToy(toy1);
        toyStore.addNewToy(toy2);
        toyStore.addNewToy(toy3);

        toyStore.setToyWeight(1, 30); 
        toyStore.setToyWeight(2, 40);
        toyStore.setToyWeight(3, 20);

        System.out.println("Все игрушки в магазине:");
        toyStore.displayToys();

        Toy winnerToy = toyStore.drawRandomToy();
        System.out.println("\nВы выйграли: " + winnerToy.getName());
    }
}
