package com.zshrimp2.myhome.model;

import lombok.Data;
import org.springframework.validation.annotation.Validated;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@Validated
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 30,message = "Titles must be between 2 and 30 characters long.")
    private String title;


    private String content;
}
