package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.entity.Title;
import test.mapper.Common;

import java.util.List;

@Service
public class CommonService {
    @Autowired
    public Common commonmapper;

    public List<Title> titleinfo(){
        return commonmapper.titleinfor();
    }

}
