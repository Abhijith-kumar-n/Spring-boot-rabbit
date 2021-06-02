package com.example.springbootrabbit.Publisher;

import com.example.springbootrabbit.config.*;
import com.example.springbootrabbit.config.*;
import com.example.springbootrabbit.Employee;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeePublish {
    @Autowired
    public RabbitTemplate rabbitTemplate;

    @PostMapping("/AddEmployee")
    public Employee getEmpDetails(@RequestBody Employee emp){

        rabbitTemplate.convertAndSend(rabbitmqConfig.EXCHANGE,rabbitmqConfig.ROUTING_KEY,emp);
        return emp;
    }

}
