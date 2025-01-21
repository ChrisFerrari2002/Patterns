package Dependency_Injections_Test;

import Dependency_Injections.Chef;
import Dependency_Injections.Fish;
import Dependency_Injections.Food;
import Dependency_Injections.Omelette;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ChefTest {
    @Test
    void testOmelette() {
        Omelette omelette = new Omelette();
        assertDoesNotThrow(omelette::prepareFood);
    }

    @Test
    void testFish() {
        Fish fish = new Fish();
        assertDoesNotThrow(fish::prepareFood);
    }

    @Test
    void testOmeletteChef() {
        Omelette mockFood = mock(Omelette.class);
        Chef chef = new Chef(mockFood);

        chef.cook();

        InOrder inOrder = inOrder(mockFood);
        inOrder.verify(mockFood).text();
        inOrder.verify(mockFood).prepareFood();
        verify(mockFood, times(1)).prepareFood();
    }

    @Test
    void testFishChef() {
        Fish mockFish = mock(Fish.class);
        Chef chef = new Chef(mockFish);

        chef.cook();

        verify(mockFish, times(1)).prepareFood();
    }

    @Test
    void testChefCompletedCooking() {
        Food foodMock = mock(Food.class);

        // Assegno un comportamento al metodo del mock
        when(foodMock.prepareFood()).thenReturn(true);

        Chef chef = new Chef(foodMock);
        chef.cook();
        assertTrue(chef.isHasFinished());

        // Verifica il numero totale di invocazioni del mock
        verify(foodMock, times(1)).text();
        verify(foodMock, times(1)).prepareFood();

        // Verifica l'ordine di invocazioni del mock
        InOrder inOrder = inOrder(foodMock);
        inOrder.verify(foodMock).text();
        inOrder.verify(foodMock).prepareFood();
    }

    @Test
    void testChefPay() {
        Chef chefMock = mock(Chef.class);
        chefMock.getPay(10, "Hai ricevuto");

        InOrder inOrder = inOrder(chefMock);
        inOrder.verify(chefMock).getPay(anyInt(), anyString());
    }


}
