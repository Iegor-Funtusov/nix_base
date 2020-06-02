package ua.com.alevel.nix.baseoperations.util;

public class BinaryUtil {

    public static String convertStringToBinary(String text) {
        byte[] bytes = text.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        return binary.toString();
    }

    public static String convertPrimitiveTypeToBinary(String primitiveType, String value) {
        switch (primitiveType) {
            case "byteType" : return convertNumberToBinary(Byte.parseByte(value), Byte.class);
            case "shortType" : return convertNumberToBinary(Short.parseShort(value), Short.class);
            case "intType" : return convertNumberToBinary(Integer.parseInt(value), Integer.class);
            case "longType" : return convertNumberToBinary(Long.parseLong(value), Long.class);
            case "floatType" : return convertNumberToBinary(Float.parseFloat(value), Integer.class);
            case "doubleType" : return convertNumberToBinary(Double.parseDouble(value), Long.class);
            case "charType" : return convertStringToBinary(value);
            case "booleanType" : return convertNumberToBinary(Boolean.compare(Boolean.parseBoolean(value), false), Integer.class);
        }
        return "0";
    }

    public static String convertNumberToBinary(Number value, Class<? extends Number> number) {

        if (number.isAssignableFrom(Byte.class)) {
            return String.format("%8s", Integer.toBinaryString(value.byteValue() & 0xFF)).replace(' ', '0');
        }
        if (number.isAssignableFrom(Short.class)) {
            return String.format("%16s", Integer.toBinaryString(value.shortValue() & 0xFFFF)).replace(' ', '0');
        }
        if (number.isAssignableFrom(Integer.class)) {
            return String.format("%32s", Integer.toBinaryString(value.intValue())).replace(' ', '0');
        }
        if (number.isAssignableFrom(Long.class)) {
            return String.format("%64s", Long.toBinaryString(value.longValue())).replace(' ', '0');
        }
        if (number.isAssignableFrom(Float.class)) {
            return String.format("%32s", Integer.toBinaryString(Float.floatToIntBits(value.floatValue()))).replace(' ', '0');
        }
        if (number.isAssignableFrom(Double.class)) {
            return String.format("%64s", Long.toBinaryString(Double.doubleToLongBits(value.doubleValue()))).replace(' ', '0');
        }

        return "0";
    }

    public static Number convertBinaryToNumber(String value, Class<? extends Number> number) {

        if (number.isAssignableFrom(Byte.class)) {
            return Byte.parseByte(value, 2);
        }

        if (number.isAssignableFrom(Short.class)) {
            return Short.parseShort(value, 2);
        }
        if (number.isAssignableFrom(Integer.class)) {
            return Integer.parseInt(value, 2);
        }
        if (number.isAssignableFrom(Long.class)) {
            return Long.parseLong(value, 2);
        }

        return 0;
    }
}
