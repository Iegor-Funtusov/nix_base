function runSum() {
    let data = { from: document.getElementById("inputRangeFrom").value, to: document.getElementById("inputRangeTo").value };
    jQuery.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/circle/runSum",
        data: JSON.stringify(data),
        success: function (result) {
            document.getElementById("forTime").innerHTML = result.forTime;
            document.getElementById("whileTime").innerHTML = result.whileTime;
            document.getElementById("forEachTime").innerHTML = result.forEachTime;
            document.getElementById("forEachStreamTime").innerHTML = result.forEachStreamTime;
            document.getElementById("mathTime").innerHTML = result.mathTime;

            document.getElementById("forSum").innerHTML = result.forSum;
            document.getElementById("whileSum").innerHTML = result.whileSum;
            document.getElementById("forEachSum").innerHTML = result.forEachSum;
            document.getElementById("forEachStreamSum").innerHTML = result.forEachStreamSum;
            document.getElementById("mathSum").innerHTML = result.mathSum;
        },
        error: function () {
            return "error";
        }
    });
}

function convertStringToNumberAndFindSum() {
    jQuery.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/circle/convertStringToNumberAndFindSum",
        data: document.getElementById("inputStringValue").value,
        success: function (result) {
            document.getElementById("resultStringValue").innerHTML = result;
        },
        error: function () {
            return "error";
        }
    });
}
