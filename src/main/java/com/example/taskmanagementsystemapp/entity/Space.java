package com.example.taskmanagementsystemapp.entity;

import com.example.taskmanagementsystemapp.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Space extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @ManyToOne(optional = false)
    private Workspace workspace;

    @Column(nullable = false)
    private String initialLetter;

    @ManyToOne
    private Icon icon;

    @OneToOne
    private Attachment avatar;

    @ManyToOne
    private User owner;

    @Column(nullable = false)
    private String accessType;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<User> memberList;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<ClickApp> clickAppList;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<View> viewList;



}
