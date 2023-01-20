package genealogical.tree.service;

import genealogical.tree.data.Human;

import java.util.ArrayList;
import java.util.List;

public class HumanService {
    public List<Human> getHuman(List<Human> list, String name) {
        List<Human> humanList = new ArrayList<>();
        for (Human human : list) {
            if (human.getName().equals(name)) {
                humanList.add(human);
            }
        }
        if (humanList.isEmpty()) {
            humanList.add(new Human("not found"));
        }
        return humanList;
    }
}
