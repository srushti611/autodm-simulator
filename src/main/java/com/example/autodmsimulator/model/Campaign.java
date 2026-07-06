package com.example.autodmsimulator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String triggerKeyword; 
    private String dmMessage;      
    private int triggerCount = 0;      
    private boolean active = true;

    public Campaign(String triggerKeyword, String dmMessage, boolean active) {
        this.triggerKeyword = triggerKeyword;
        this.dmMessage = dmMessage;
        this.active = active;
    }
}
