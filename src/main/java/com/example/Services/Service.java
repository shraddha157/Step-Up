package com.example.Services;

import com.example.dbo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private ItemRepository itemRepository;

}
