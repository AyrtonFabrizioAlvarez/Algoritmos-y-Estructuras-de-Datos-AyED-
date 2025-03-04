/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

/**
 *
 * @author Cocalibur
 */
public class AreaEmpresa {
    private String id;
    private Integer delay;

    public AreaEmpresa(String id, Integer delay) {
        this.id = id;
        this.delay = delay;
    }
    
    //GETTERS

    public String getId() {
        return id;
    }

    public Integer getDelay() {
        return delay;
    }
    
    
    //SETTERS

    public void setId(String id) {
        this.id = id;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }
    
    
}
