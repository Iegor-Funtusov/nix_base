package ua.com.alevel.nix.baseoperations.service;

import org.springframework.stereotype.Service;
import ua.com.alevel.nix.baseoperations.data.PrimitiveInputValue;
import ua.com.alevel.nix.baseoperations.util.BinaryUtil;

@Service
public class PrimitiveTypesServiceImpl implements PrimitiveTypesService {

    @Override
    public String convertPrimitiveTypeToBinary(PrimitiveInputValue primitiveInputValue) {
        return BinaryUtil.convertPrimitiveTypeToBinary(primitiveInputValue.getType(), primitiveInputValue.getValue());
    }
}
