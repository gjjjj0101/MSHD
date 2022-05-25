package com.mshd.system.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Code {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column
    public String place;
    @Column
    public String name;
}
