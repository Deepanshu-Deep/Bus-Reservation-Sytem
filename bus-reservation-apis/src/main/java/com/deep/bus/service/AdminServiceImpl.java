package com.deep.bus.service;

import com.deep.bus.exception.*;
import com.deep.bus.entities.*;
import com.deep.bus.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminDao aDao;



    @Override
    public Admin registerAdmin(Admin admin) throws AdminException {

        Pattern pattern = Pattern.compile("@masai", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(admin.getName());

        boolean matchfound = matcher.find();

        if(!matchfound) throw new AdminException("Admin name is consist @masai");

        return aDao.save(admin);
    }
}
