package com.deep.bus.service;

import com.deep.bus.exception.*;
import com.deep.bus.entities.*;

public interface AdminService {

    public Admin registerAdmin(Admin admin) throws AdminException;
}
