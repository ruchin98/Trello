package service;

import model.Listt;

import java.util.List;

public class ListtService {

    public void createListt(String listtId, String listtName, List<Listt> listtList) {
        Listt listt = new Listt();
        listt.setId(listtId);
        listt.setName(listtName);
        listtList.add(listt);

    }
}
