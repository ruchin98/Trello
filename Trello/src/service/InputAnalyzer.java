package service;

import model.Board;
import model.Card;
import model.Listt;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class InputAnalyzer {

    List<Board> boardList = new ArrayList<>();
    List<Listt> listtList = new ArrayList<>();
    List<User> userList = new ArrayList<>();
    List<Card> cardList = new ArrayList<>();

    public void analyzeInput(String input) {
        if(input.contains("BOARD CREATE")) {

        } else if(input.equals("SHOW")) {
            for(Board board : boardList) {
                System.out.println(board);
            }
        } else if(input.contains("SHOW")) {
            String[] splited = input.split("\\s+");
            String typeOfObject = splited[1];
            String objectId = splited[2];
            if("LIST".equals(typeOfObject)) {
                for(Listt listt : listtList) {
                    if(objectId.equals(listt.getId())) {
                        System.out.println(listt);
                    }
                }
            } else if("CARD".equals(typeOfObject)) {


            } else if("BOARD".equals(typeOfObject)) {

            }
        }
    }
}
