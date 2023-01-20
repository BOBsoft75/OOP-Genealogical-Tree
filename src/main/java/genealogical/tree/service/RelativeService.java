package genealogical.tree.service;

import genealogical.tree.data.Relative;

import java.util.ArrayList;
import java.util.List;

public class RelativeService {
    public List<String> getHumanRelation(List<Relative> list, String name) {
        List<String> relativeList = new ArrayList<>();
        for (Relative relative : list) {
            if (relative.getName().equals(name) || relative.getRelativeName().equals(name)) {
                relativeList.add(relative.getName());
            }
        }
        if (relativeList.isEmpty()) {
            relativeList.add("not found");
        }
        return relativeList;
    }
}
