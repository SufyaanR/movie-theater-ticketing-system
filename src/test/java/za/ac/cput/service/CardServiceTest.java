package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Card;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CardFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CardServiceTest {

    @Autowired
    private CardService service;


    private static Card card = CardFactory.createCard("2536 4563 2536 5436", "854", "Frederic Loewe");

    @Test
    void create() {
        Card created = service.create(card);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void read() {
        Card read = service.read(card.getCardNumber());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        Card newCard = new Card.CardBuilder().copy(card).setCardNumber("5426 6354 3645 3684")
                .build();
        Card updated = service.update(newCard);
        assertNotNull(updated);
        System.out.println(updated);
    }



    //@Disabled
    @Test
    void getAll() {
        System.out.println(service.getAll());

    }
}