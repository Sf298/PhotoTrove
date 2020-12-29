package com.sf298.phototrove.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "CHANGES")
public class Change {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Id
    private long id;

    @Column(name = "photo_id", nullable = false)
    private long photoId;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "params")
    private String params;

    public void setParamsList(List<?> params) {
        this.params = gson.toJson(params);
    }

    public List<?> getParamsList() {
        return gson.fromJson(params, ArrayList.class);
    }
}
