package com.citylive.server.datastructure;

import com.citylive.server.datastructure.Position2D;
import java.util.List;

public interface SpatialDS<Id > {
    void addPos(Id id, Position2D pos);
    void updatePos(Id id, Position2D pos);
    List<Id> getInRange(Position2D pos, Double radius);
}
