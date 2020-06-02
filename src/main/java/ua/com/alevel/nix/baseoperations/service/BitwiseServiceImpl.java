package ua.com.alevel.nix.baseoperations.service;

import org.springframework.stereotype.Service;

import ua.com.alevel.nix.baseoperations.data.BitwiseRequestData;
import ua.com.alevel.nix.baseoperations.data.BitwiseResponseData;
import ua.com.alevel.nix.baseoperations.util.BitwiseUtil;

@Service
public class BitwiseServiceImpl implements BitwiseService {

    @Override
    public BitwiseResponseData runProcess(BitwiseRequestData data) {

        switch (data.getTypeOperator()) {
            case "not" : return BitwiseUtil.runNOTProcess(data);
            case "and" : return BitwiseUtil.runANDProcess(data);
            case "or" : return BitwiseUtil.runORProcess(data);
            case "xor" : return BitwiseUtil.runXORProcess(data);
            case "leftShift" : return BitwiseUtil.runLeftShiftProcess(data);
            case "rightShift" : return BitwiseUtil.runRightShiftProcess(data);
            case "zeroFillRightShift" : return BitwiseUtil.runZeroFillRightShiftProcess(data);
        }
        return null;
    }
}
