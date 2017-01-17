package com.spark.task;

import java.math.BigDecimal;

public class Invoker {

    public void compute( Command command )
    {
        command.calculate();
    }   
}