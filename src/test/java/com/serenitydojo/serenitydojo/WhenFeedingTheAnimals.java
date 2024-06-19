package com.serenitydojo.serenitydojo;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(CAT, false);

        Assert.assertEquals(TUNA, food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(HAMSTER, false);

        Assert.assertEquals(CABBAGE, food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(DOG, false);

        Assert.assertEquals(DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(CAT, true);

        Assert.assertEquals(SALMON, food);
    }

    @Test
    public void shouldFeedPremiumHamstersPremiumFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(HAMSTER, true);

        Assert.assertEquals(LETTUCE, food);
    }

    @Test
    public void shouldFeedPremiumDogsPremiumFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(DOG, true);

        Assert.assertEquals(DELUXE_DOG_FOOD, food);
    }
}
