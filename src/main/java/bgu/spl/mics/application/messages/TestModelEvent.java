package bgu.spl.mics.application.messages;

import bgu.spl.mics.Event;
import bgu.spl.mics.application.objects.Model;

public class TestModelEvent implements Event<Model.Results> {
    private Model model;

    public TestModelEvent(Model model) {
        this.model = model;
    }

    public Model getData() {
        return model;
    }
}
