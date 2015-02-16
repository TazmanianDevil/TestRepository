package com.kia;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Created by Musin on 16.02.2015.
 */
@Stateless(name = "MySessionBeanEJB", mappedName = "MyKiaSessionBean")
@Remote
@Local
public class MySessionBeanBean implements MySessionBeanLocal, MySessionBeanRemote{
    public MySessionBeanBean() {
    }
    public String getName() {
        return "I'm SessionBean";
    }
}
