package com.example.test.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stretDetails")
public class streetDetail {

    @EmbeddedId
    private streetDetailId id;
    @ManyToOne
    @MapsId("streetId")
    @JoinColumn(name = "street_id", referencedColumnName = "id", nullable = false)
    @JsonBackReference
    private Product product;
}
