package genealogical.tree.controller;

import genealogical.tree.data.Human;
import genealogical.tree.data.Relative;
import genealogical.tree.data.Human;
import genealogical.tree.service.HumanService;
import genealogical.tree.service.RelativeService;

import java.util.List;


public class GenealogicalController {
    private HumanService humanService;
    private RelativeService relativeService;

    public GenealogicalController() {
        this.humanService = new HumanService();
        this.relativeService = new RelativeService();
    }

    public List<Human> getHuman(List<Human> list, String name) {
        return humanService.getHuman(list, name);
    }

    public List<String> getFilteredData(List<Relative> list, String name) {
        return relativeService.getHumanRelation(list, name);
    }
}
