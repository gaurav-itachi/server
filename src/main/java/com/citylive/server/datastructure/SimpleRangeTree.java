package com.citylive.server.datastructure;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Component
public class SimpleRangeTree<Id> implements SpatialDS< Id > {

    Map<Id, Position2D> map= new TreeMap<>();


    @Override
    public void addPos(Id id, Position2D pos) {
        map.put(id,pos);
    }

    @Override
    public void updatePos(Id id, Position2D pos) {
        map.put(id,pos);
    }

    @Override
    public List<Id> getInRange(Position2D pos, Double radius) {
        map.entrySet()
                .stream()
                .filter(k->{
            if(pos.distance(k.getValue())<radius){
                return true;
            }
            return false;
        })
                .map(k-> k.getKey()).collect(Collectors.toList());
        return null;
    }
}
