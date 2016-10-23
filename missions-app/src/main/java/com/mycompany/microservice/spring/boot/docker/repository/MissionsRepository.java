/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.microservice.spring.boot.docker.repository;

import com.mycompany.microservice.spring.boot.docker.model.Mission;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MissionsRepository extends MongoRepository<Mission, String> {

}
