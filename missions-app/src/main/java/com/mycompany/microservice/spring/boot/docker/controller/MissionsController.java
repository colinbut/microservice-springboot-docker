/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.microservice.spring.boot.docker.controller;

import com.mycompany.microservice.spring.boot.docker.repository.MissionsRepository;
import com.mycompany.microservice.spring.boot.docker.model.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missions")
public class MissionsController {

    @Autowired
    private MissionsRepository missionsRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Mission create(@RequestBody Mission mission) {
        return missionsRepository.save(mission);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{missionId}")
    public Mission get(@PathVariable String missionId) {
        return missionsRepository.findOne(missionId);
    }

}
