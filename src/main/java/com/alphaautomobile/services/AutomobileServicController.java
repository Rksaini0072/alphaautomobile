package com.alphaautomobile.services;

import com.alphaautomobile.beans.AutomobileServics;

import java.util.List;


public interface AutomobileServicController {
    public boolean addservic(AutomobileServics automobileServices);
    public List<AutomobileServics> getAllServics();
}
