package models;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String id;
    private String name;
    private List<Modality> modalities;

    public Event(){
        this("", new ArrayList<>());
    }

    public Event(String name, List<Modality> modalities) {
        this.name = name;
        this.modalities = modalities;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Modality> getModalities() {
        return modalities;
    }
    public void setModalities(List<Modality> modalities) {
        this.modalities = modalities;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
