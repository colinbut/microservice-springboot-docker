/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.microservice.spring.boot.docker.controller;

import com.mycompany.microservice.spring.boot.docker.repository.RewardRepository;
import com.mycompany.microservice.spring.boot.docker.model.Reward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rewards")
public class RewardsController {

    @Autowired
    private RewardRepository rewardRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Reward create(@RequestBody Reward reward) {
        return rewardRepository.save(reward);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{rewardId}")
    public Reward get(@PathVariable String rewardId) {
        return rewardRepository.findOne(rewardId);
    }

}
