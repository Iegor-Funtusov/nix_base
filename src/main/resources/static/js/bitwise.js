function runNotBitwiseProcess(typeOperator) {
    let data =
        {
            inputLeftOperand: Number.parseInt(document.getElementById("inputLeftNotOperand").value),
            inputRightOperand: Number.parseInt(document.getElementById("inputRightNotOperand").value),
            typeOperator: typeOperator
        };
    runBitwiseProcess(typeOperator, data);
}

function runAndBitwiseProcess(typeOperator) {
    let data =
        {
            inputLeftOperand: Number.parseInt(document.getElementById("inputLeftAndOperand").value),
            inputRightOperand: Number.parseInt(document.getElementById("inputRightAndOperand").value),
            typeOperator: typeOperator
        };
    runBitwiseProcess(typeOperator, data);
}

function runOrBitwiseProcess(typeOperator) {
    let data =
        {
            inputLeftOperand: Number.parseInt(document.getElementById("inputLeftOrOperand").value),
            inputRightOperand: Number.parseInt(document.getElementById("inputRightOrOperand").value),
            typeOperator: typeOperator
        };
    runBitwiseProcess(typeOperator, data);
}

function runXorBitwiseProcess(typeOperator) {
    let data =
        {
            inputLeftOperand: Number.parseInt(document.getElementById("inputLeftXorOperand").value),
            inputRightOperand: Number.parseInt(document.getElementById("inputRightXorOperand").value),
            typeOperator: typeOperator
        };
    runBitwiseProcess(typeOperator, data);
}

function runLeftShiftBitwiseProcess(typeOperator) {
    let data =
        {
            inputLeftOperand: Number.parseInt(document.getElementById("inputLeftLeftShiftOperand").value),
            inputRightOperand: Number.parseInt(document.getElementById("inputRightLeftShiftOperand").value),
            typeOperator: typeOperator
        };
    runBitwiseProcess(typeOperator, data);
}

function runRightShiftBitwiseProcess(typeOperator) {
    let data =
        {
            inputLeftOperand: Number.parseInt(document.getElementById("inputLeftRightShiftOperand").value),
            inputRightOperand: Number.parseInt(document.getElementById("inputRightRightShiftOperand").value),
            typeOperator: typeOperator
        };
    runBitwiseProcess(typeOperator, data);
}

function runZeroFillRightShiftBitwiseProcess(typeOperator) {
    let data =
        {
            inputLeftOperand: Number.parseInt(document.getElementById("inputLeftZeroFillRightShiftOperand").value),
            inputRightOperand: Number.parseInt(document.getElementById("inputRightZeroFillRightShiftOperand").value),
            typeOperator: typeOperator
        };
    runBitwiseProcess(typeOperator, data);
}

function runBitwiseProcess(typeOperator, data) {

    jQuery.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/bitwise",
        data: JSON.stringify(data),
        success: function (result) {
            document.getElementById("leftBinaryOperand").innerHTML = result.leftBinaryOperand;
            document.getElementById("rightBinaryOperand").innerHTML = result.rightBinaryOperand;
            document.getElementById("resultBinaryBitwiseProcess").innerHTML = result.resultBinaryBitwiseProcess;
            writeBitwiseProcess(typeOperator, result.resultBitwiseOperation)
        },
        error: function () {
            return "error";
        }
    });
}

function writeBitwiseProcess(typeOperator, result) {
    switch (typeOperator) {
        case 'not' :
            document.getElementById("resultBitwiseNotOperation").innerHTML = result;
            break
        case 'and' :
            document.getElementById("resultBitwiseAndOperation").innerHTML = result;
            break
        case 'or' :
            document.getElementById("resultBitwiseOrOperation").innerHTML = result;
            break
        case 'xor' :
            document.getElementById("resultBitwiseXorOperation").innerHTML = result;
            break
        case 'leftShift' :
            document.getElementById("resultBitwiseLeftShiftOperation").innerHTML = result;
            break
        case 'rightShift' :
            document.getElementById("resultBitwiseRightShiftOperation").innerHTML = result;
            break
        case 'zeroFillRightShift' :
            document.getElementById("resultBitwiseZeroFillRightShiftOperation").innerHTML = result;
            break
    }
}
