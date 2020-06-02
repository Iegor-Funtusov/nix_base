package ua.com.alevel.nix.baseoperations.util;

import ua.com.alevel.nix.baseoperations.data.BitwiseRequestData;
import ua.com.alevel.nix.baseoperations.data.BitwiseResponseData;

public class BitwiseUtil {

    public static BitwiseResponseData runNOTProcess(BitwiseRequestData data) {
        int result = ~(data.getInputLeftOperand());
        return runProcess(result, data);
    }

    public static BitwiseResponseData runANDProcess(BitwiseRequestData data) {
        int result = data.getInputLeftOperand() & data.getInputRightOperand();
        return runProcess(result, data);
    }

    public static BitwiseResponseData runORProcess(BitwiseRequestData data) {
        int result = data.getInputLeftOperand() | data.getInputRightOperand();
        return runProcess(result, data);
    }

    public static BitwiseResponseData runXORProcess(BitwiseRequestData data) {
        int result = data.getInputLeftOperand() ^ data.getInputRightOperand();
        return runProcess(result, data);
    }

    public static BitwiseResponseData runLeftShiftProcess(BitwiseRequestData data) {
        int result = data.getInputLeftOperand() << data.getInputRightOperand();
        return runProcess(result, data);
    }

    public static BitwiseResponseData runRightShiftProcess(BitwiseRequestData data) {
        int result = data.getInputLeftOperand() >> data.getInputRightOperand();
        return runProcess(result, data);
    }

    public static BitwiseResponseData runZeroFillRightShiftProcess(BitwiseRequestData data) {
        int result = data.getInputLeftOperand() >>> data.getInputRightOperand();
        return runProcess(result, data);
    }

    private static BitwiseResponseData runProcess(int result, BitwiseRequestData data) {
        BitwiseResponseData responseData = new BitwiseResponseData();
        responseData.setResultBinaryBitwiseProcess(BinaryUtil.convertNumberToBinary(result, Integer.class));
        responseData.setLeftBinaryOperand(BinaryUtil.convertNumberToBinary(data.getInputLeftOperand(), Integer.class));
        responseData.setRightBinaryOperand(BinaryUtil.convertNumberToBinary(data.getInputRightOperand(), Integer.class));
        responseData.setResultBitwiseOperation(result);
        return responseData;
    }
}
