let currentSelectPrimitiveType;

document.getElementById("byteType").addEventListener("click", selectByteType);
document.getElementById("shortType").addEventListener("click", selectShortType);
document.getElementById("intType").addEventListener("click", selectIntType);
document.getElementById("longType").addEventListener("click", selectLongType);
document.getElementById("floatType").addEventListener("click", selectFloatType);
document.getElementById("doubleType").addEventListener("click", selectDoubleType);
document.getElementById("charType").addEventListener("click", selectCharType);
document.getElementById("booleanType").addEventListener("click", selectBooleanType);

function selectByteType() {
    currentSelectPrimitiveType = "byteType";
}

function selectShortType() {
    currentSelectPrimitiveType = "shortType";
}

function selectIntType() {
    currentSelectPrimitiveType = "intType";
}

function selectLongType() {
    currentSelectPrimitiveType = "longType";
}

function selectFloatType() {
    currentSelectPrimitiveType = "floatType";
}

function selectDoubleType() {
    currentSelectPrimitiveType = "doubleType";
}

function selectCharType() {
    currentSelectPrimitiveType = "charType";
}

function selectBooleanType() {
    currentSelectPrimitiveType = "booleanType";
}

function convert() {
    let data = { type: currentSelectPrimitiveType, value: document.getElementById("primitiveValue").value };
    jQuery.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/primitive",
        data: JSON.stringify(data),
        success: function (result) {
            document.getElementById("resultConversion").innerHTML = result;
        },
        error: function () {
            return "error";
        }
    });
}
