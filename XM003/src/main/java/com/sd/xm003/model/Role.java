package com.sd.xm003.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

public class Role implements Serializable{
    private static final long serialVersionUID = -6140090613812307452L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "roleDesc")
    private String roledesc;
    @Transient
    private Integer selected;

    @Transient
    private Set<Resources>  resources;
    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return roleDesc
     */
    public String getRoledesc() {
        return roledesc;
    }

    /**
     * @param roledesc
     */
    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public Set<Resources> getResources() {
        return resources;
    }

    public void setResources(Set<Resources> resources) {
        this.resources = resources;
    }
}