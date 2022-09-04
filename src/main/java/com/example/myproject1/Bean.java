package com.example.myproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;


@RestController
@RequestMapping("/usertest")
public class Bean {
    static class Test{
        String value;

        public Test() {
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Test(String value) {
            this.value = value;
        }
    }
    final
    TestService testService;

    public Bean(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("{testt}")
    String test(@PathVariable String testt){
        return testt;
    }
//    @PostMapping
//    String test2(@RequestBody Test test){
//        return test.value;
//    }
    static class User {

        String userId;
        String name;
        String telNumber;
        String location;
        Boolean isInjected;
        Boolean isMijie;

        public User() {
        }


    public User(String userId, String name, String telNumber, String location, Boolean isInjected, Boolean isMijie) {
        this.userId = userId;
        this.name = name;
        this.telNumber = telNumber;
        this.location = location;
        this.isInjected = isInjected;
        this.isMijie = isMijie;
    }

    public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTelNumber() {
            return telNumber;
        }

        public void setTelNumber(String telNumber) {
            this.telNumber = telNumber;
        }


        public Boolean getIsInjected() {
            return isInjected;
        }

        public void setIsInjected(Boolean injected) {
            isInjected = injected;
        }

        public Boolean getIsMijie() {
            return isMijie;
        }

        public void setIsMijie(Boolean mijie) {
            isMijie = mijie;
        }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
    @PostMapping
    String test3(@RequestBody User user){
        return user.name;
    }
}
