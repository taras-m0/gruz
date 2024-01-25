package com.example.gruz2;

import com.nimbusds.jose.shaded.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GruzService {
    @Autowired
    private GruzRepozitory repo;

    public List<Gruz> listAll(String keyword) {
        if (keyword != null) {
            return repo.search(keyword);
        }
        return repo.findAll();
    }

    public void save(Gruz gruz) {
        repo.save(gruz);
    }

    public Gruz get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public String statJSON(){
        Gson gson = new Gson();
        return gson.toJson( repo.dateGroup());
    }

    public List<GruzStatistic> stat(){ return repo.dateGroup(); }
}