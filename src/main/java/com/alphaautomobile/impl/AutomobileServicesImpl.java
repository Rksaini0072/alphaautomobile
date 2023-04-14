package com.alphaautomobile.impl;

import com.alphaautomobile.beans.AutomobileServics;
import com.alphaautomobile.services.AutomobileServicController;

import java.util.ArrayList;
import java.util.List;

public class AutomobileServicesImpl implements AutomobileServicController {
    private List<AutomobileServics> servicsList = new ArrayList<>();
    @Override
    public boolean addservic(AutomobileServics automobileServices) {
        System.out.println("add services method is getting called");
        servicsList.add(automobileServices);
        System.out.println("service added successfully");

        return true;
    }

    @Override
    public List<AutomobileServics> getAllServics() {
        System.out.println("add services method is getting called");

        return servicsList;
    }
    public void displayServices(){
        System.out.println("displaying services");
        for (AutomobileServics automobileServics : servicsList){
            System.out.println(automobileServics.toString());
        }
    }
}
