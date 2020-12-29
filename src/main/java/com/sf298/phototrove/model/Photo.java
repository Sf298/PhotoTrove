package com.sf298.phototrove.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PHOTOS")
public class Photo {

    @Id
    private long id;

    @Column(name = "file", nullable = false, unique = true)
    private String file;

    @Column(name = "width", nullable = false)
    private int width;

    @Column(name = "height", nullable = false)
    private int height;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

}
