package com.example.timoc_000.dungeondelve;

/**
 * Created by timoc_000 on 15/05/2015.
 */
public class CharacterClass {
    String _id;
    String _description;
    int _minArmourLevel;

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public int getMinArmourLevel() {
        return _minArmourLevel;
    }

    public void setMinArmourLevel(int minArmourLevel) {
        this._minArmourLevel = minArmourLevel;
    }
}
