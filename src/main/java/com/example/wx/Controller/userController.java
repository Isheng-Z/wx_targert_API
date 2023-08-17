package com.example.wx.Controller;
import com.example.wx.Dao.UserDao;
import com.example.wx.Entity.User;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class userController {
    @Autowired
    UserDao userDao;
    // http://localhost:8080/insert?id=1&name=Carol
    @GetMapping("/insert")
    public User insert(@RequestParam("id")int id,
                       @RequestParam("name")String name){
        User student=new User();
        student.setUserID(id);
        student.setName(name);
        User save=userDao.save(student);
        return save;
    }
    @GetMapping("getAll")
    public List getAll(){
        List list=userDao.findAll();
        return list;
    }
}
