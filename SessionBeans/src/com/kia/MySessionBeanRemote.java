package com.kia;

import javax.ejb.Remote;

/**
 * Created by Musin on 16.02.2015.
 */
@Remote
public interface MySessionBeanRemote {
    public String getName();
}
