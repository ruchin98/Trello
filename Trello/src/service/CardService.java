package service;

import model.Card;

import java.util.List;

public class CardService {

    public void createCard(String cardId, String cardName, List<Card> cardList) {
        Card card = new Card();
        card.setId(cardId);
        card.setName(cardName);
        cardList.add(card);
    }
}
