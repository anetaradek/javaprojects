package BoxesAndShelfs;

public class boxesAndShelvesTester {
    public static void main(String[] args) {
        Box<Toy> toys = new Box<>();
        Box<Toy> toys2 = new Box<>();
        Box<Food> foods = new Box<>();
        Box<Food> foods2 = new Box<>();
        Box<? super Book> books = new Box<>();
        Box<? super Fantasy> fantasyBooks = new Box<>();

        Toy car = new Toy("Car");
        Toy doll = new Toy("Doll");
        Toy teddyBear = new Toy("Teddy");
        Toy puzzles = new Toy("Puzzles");
        toys.add(car);
        toys.add(doll);
        toys2.add(teddyBear);
        toys2.add(puzzles);

        Food chips = new Food("Chips");
        Food egg = new Food("Egg");
        Food bread = new Food("Bread");
        Food butter = new Food("Butter");
        foods.add(chips);
        foods.add(egg);
        foods2.add(bread);
        foods2.add(butter);


        Book anneOfGreenGables = new Book("Anne of Green Gables");
        Book goneWithTheWind = new Book ("Gone with the wind");
        Book realised = new Book("Realised");

        Fantasy harryPotter = new Fantasy("Harry Potter and the Chamber of Secrets");
        Fantasy theLordOfTheRings = new Fantasy("The Lord of the Rings");
        Fantasy theHobbit = new Fantasy("The Hobbit");

        books.add(anneOfGreenGables);
        books.add(harryPotter);
        books.add(goneWithTheWind);
        books.add(realised);

        fantasyBooks.add(harryPotter);
        fantasyBooks.add(theHobbit);
        fantasyBooks.add(theLordOfTheRings);

        Shelf<Box<Toy>> boxesWithToys = new Shelf<>();
        Shelf<Box <? super Fantasy>> boxesWithBooks = new Shelf<>();
        Shelf<Box<?>> boxesWithAnyItem = new Shelf<>();

        boxesWithToys.add(toys);
        boxesWithToys.add(toys2);
        boxesWithAnyItem.add(foods);
        boxesWithAnyItem.add(books);
        boxesWithBooks.add(books);
        boxesWithBooks.add(fantasyBooks);















    }
}
