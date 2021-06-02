package com.example.springbootrabbit.Consumer;

import com.example.springbootrabbit.config.*;
import com.example.springbootrabbit.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConsume {


    @RabbitListener(queues=rabbitmqConfig.QUEUE)
    public void receivemsg(Employee emp){
        System.out.println("<Received msg> "+emp);
    }

}
