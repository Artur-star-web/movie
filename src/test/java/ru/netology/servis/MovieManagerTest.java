package ru.netology.servis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void testAddAndFindAll() {

        MovieManager manager = new MovieManager();


        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");

        String[] expected = {"Бладшот", "Вперёд"};
        Assertions.assertArrayEquals(expected, manager.findAll());

    }

    @Test
    public void testFindLastWithDefaultLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель 'Белград'");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");

        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель 'Белград'", "Вперёд"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void testFindLastWithCustomLimit() {
        MovieManager manager = new MovieManager(3);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель 'Белград'");
        manager.addMovie("Джентльмены");

        String[] expected = {"Джентльмены", "Отель 'Белград'", "Вперёд"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
}
