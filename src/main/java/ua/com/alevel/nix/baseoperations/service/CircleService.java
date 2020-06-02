package ua.com.alevel.nix.baseoperations.service;

import ua.com.alevel.nix.baseoperations.data.CircleVersusMath;
import ua.com.alevel.nix.baseoperations.data.RangeData;

public interface CircleService {

    CircleVersusMath runSum(RangeData data);
    Long convertStringToNumberAndFindSum(String value);
}
