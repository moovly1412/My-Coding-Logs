package com.web.order_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

   @GetMapping("/")
    public String index(org.springframework.ui.Model model) {
        model.addAttribute("allOrders", orderRepository.findAll());
        return "index";
    }

    @PostMapping("/save")
    public String saveOrder(@ModelAttribute Order order) {
        orderRepository.save(order);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteOrder(@PathVariable Long id) {
        orderRepository.deleteById(id);
        return "redirect:/";
    }
}