package ua.com.alevel.nix.baseoperations.service;

import ua.com.alevel.nix.baseoperations.data.BitwiseRequestData;
import ua.com.alevel.nix.baseoperations.data.BitwiseResponseData;

public interface BitwiseService {

    BitwiseResponseData runProcess(BitwiseRequestData data);
}
