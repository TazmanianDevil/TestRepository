package com.kia;

import javax.ejb.Local;

/**
 * Created by Musin on 16.02.2015.
 */
@Local
public interface MySessionBeanLocal {
    public String getName();
}
