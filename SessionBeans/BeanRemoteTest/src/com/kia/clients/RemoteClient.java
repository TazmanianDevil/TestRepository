package com.kia.clients;

import com.kia.MySessionBeanRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

/**
 * Created by Musin on 16.02.2015.
 */
public class RemoteClient {
    public static void main(String... args) {
        Properties props = new Properties();
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.impl.SerialInitContextFactory");
        props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
        props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
        try {
            Context ctx = new InitialContext(props);
            MySessionBeanRemote bean = (MySessionBeanRemote)ctx.lookup("MyKiaSessionBean");
            System.out.print(bean.getName());
        } catch (NamingException e) {
            e.printStackTrace();
        }

    }
}
