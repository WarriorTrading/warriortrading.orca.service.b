package com.example;

import com.nirvana.lib.a.Order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Order order = new Order();
        order.setAmount(100000.45);
        order.setId(1001L);
        System.out.println(order);
    }
}
