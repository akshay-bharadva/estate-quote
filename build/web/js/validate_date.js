function IsDateValid(frm, tdt, captionName) {
	var mn = frm.elements[tdt + "months"].value;
	var day = frm.elements[tdt + "days"].value;
	var yr = frm.elements[tdt + "years"].value;
	if (yr == 0 || (day == 0) | (mn == 0)) {
		return true;
	}
	if (mn == "02" && day > 28) {
		if (((yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0) && day < 30)
			return true;
		else {
			valid_date_alert(captionName);
			return false;
		}
	} else if (
		(mn == "04" || mn == "06" || mn == "09" || mn == "11") &&
		day > 30
	) {
		valid_date_alert(captionName);
		return false;
	} else return true;
}

function compare_date(frm, startdt, enddt, captionName1, captionName2) {
	var firstdt;
	var seconddt;
	if (!frm.elements[startdt + "days"])
		firstdt = new Date(
			frm.elements[startdt + "years"].value,
			frm.elements[startdt + "months"].value - 1,
			"01"
		);
	else
		firstdt = new Date(
			frm.elements[startdt + "years"].value,
			frm.elements[startdt + "months"].value - 1,
			frm.elements[startdt + "days"].value
		);
	if (!frm.elements[startdt + "days"])
		seconddt = new Date(
			frm.elements[enddt + "years"].value,
			frm.elements[enddt + "months"].value - 1,
			1
		);
	else
		seconddt = new Date(
			frm.elements[enddt + "years"].value,
			frm.elements[enddt + "months"].value - 1,
			frm.elements[enddt + "days"].value
		);
	if (firstdt < seconddt) {
		valid_date_compare_alert(captionName1, captionName2);
		return false;
	} else return true;
}
function validateDate_txt(dt, captionName, isCompulsory) {
	var input = document.getElementById(dt);
	var validformat2 = /^\d{2}[-]\d{2}[-]\d{4}$/;
	var dayfield;
	var monthfield;
	var yearfield;
	var dayobj;

	if (Trim(input.value) == "" && isCompulsory == true) {
		valid_date_alert(captionName);
		return false;
	}
	if (Trim(input.value) != "") {
		if (!validformat2.test(input.value)) {
			valid_date_format_alert(captionName);
			return false;
		} else {
			//Detailed check for valid date ranges

			dayfield = input.value.split(/[\/-]/)[0];
			monthfield = input.value.split(/[\/-]/)[1];
			yearfield = input.value.split(/[\/-]/)[2];

			dayobj = new Date(yearfield, monthfield - 1, dayfield);
			if (
				dayobj.getMonth() + 1 != monthfield ||
				dayobj.getDate() != dayfield ||
				dayobj.getFullYear() != yearfield
			) {
				valid_date_alert(captionName);
				return false;
			}
		}
	}
	return true;
}

function checkFutureDateNotAllow(
	frm,
	field_name,
	captionName1,
	captionName2,
	currentDate
) {
	var input = frm.elements[field_name]; //document.getElementById(dt);

	// var validformat1=/^\d{2}[\/]\d{2}[\/]\d{4}$/;
	var validformat2 = /^\d{2}[-]\d{2}[-]\d{4}$/;

	if (!validformat2.test(Trim(input.value))) {
		//!validformat1.test(Trim(input.value)) &&
		valid_date_format_alert(captionName1);
		frm.elements[field_name].focus();
		return false;
	}

	var dayfield = input.value.split(/[\/-]/)[0];
	var monthfield = input.value.split(/[\/-]/)[1];
	var yearfield = input.value.split(/[\/-]/)[2];

	var dayobj = new Date(yearfield, monthfield - 1, dayfield);

	if (
		dayobj.getMonth() + 1 != monthfield ||
		dayobj.getDate() != dayfield ||
		dayobj.getFullYear() != yearfield
	) {
		valid_date_alert(captionName1);
		frm.elements[field_name].focus();
		return false;
	}

	if (Trim(currentDate) == "") {
		//if current date is not passes
		currentDate = new Date();
		if (dayobj > currentDate) {
			future_date_now_allow_alert(captionName1, captionName2);
			frm.elements[field_name].focus();
			return false;
		}
		return true;
	} else {
		//if  date is passed

		var curDayfield = currentDate.split(/[\/-]/)[0];
		var curMonthfield = currentDate.split(/[\/-]/)[1];
		var curYearfield = currentDate.split(/[\/-]/)[2];

		currentDate = new Date(curYearfield, curMonthfield - 1, curDayfield);

		if (dayobj > currentDate) {
			future_date_now_allow_alert(captionName1, captionName2);
			frm.elements[field_name].focus();
			return false;
		}
		return true;
	}
}

function checkOnlyFutureDateAllow(
	frm,
	field_name,
	captionName1,
	captionName2,
	currentDate
) {
	var input = frm.elements[field_name]; //document.getElementById(dt);

	//  var validformat1=/^\d{2}[\/]\d{2}[\/]\d{4}$/;
	var validformat2 = /^\d{2}[-]\d{2}[-]\d{4}$/;

	if (!validformat2.test(Trim(input.value))) {
		//!validformat1.test(Trim(input.value)) &&
		//if date entered is not valid
		valid_date_format_alert(captionName1);
		frm.elements[field_name].focus();
		return false;
	}

	var dayfield = input.value.split(/[\/-]/)[0];
	var monthfield = input.value.split(/[\/-]/)[1];
	var yearfield = input.value.split(/[\/-]/)[2];

	var dayobj = new Date(yearfield, monthfield - 1, dayfield);
	if (
		dayobj.getMonth() + 1 != monthfield ||
		dayobj.getDate() != dayfield ||
		dayobj.getFullYear() != yearfield
	) {
		valid_date_alert(captionName1);
		frm.elements[field_name].focus();
		return false;
	}

	if (Trim(currentDate) == "") {
		//if current date is not passes
		currentDate = new Date();
		if (dayobj < currentDate) {
			future_date_only_allow_alert(captionName1, captionName2);
			return false;
		}
		return true;
	} else {
		//if  date is passed

		var curDayfield = currentDate.split(/[\/-]/)[0];
		var curMonthfield = currentDate.split(/[\/-]/)[1];
		var curYearfield = currentDate.split(/[\/-]/)[2];

		currentDate = new Date(curYearfield, curMonthfield - 1, curDayfield);

		if (dayobj < currentDate) {
			future_date_only_allow_alert(captionName1, captionName2);
			frm.elements[field_name].focus();
			return false;
		}
		return true;
	}
}
function checkNotGreaterOrEqualToFutureDate(
	frm,
	field_name,
	captionName1,
	captionName2,
	currentDate
) {
	var input = frm.elements[field_name]; //document.getElementById(dt);

	//  var validformat1=/^\d{2}[\/]\d{2}[\/]\d{4}$/;
	var validformat2 = /^\d{2}[-]\d{2}[-]\d{4}$/;

	if (!validformat2.test(Trim(input.value))) {
		//!validformat1.test(Trim(input.value)) &&
		//if date entered is not valid
		valid_date_format_alert(captionName1);
		frm.elements[field_name].focus();
		return false;
	}

	var dayfield = input.value.split(/[\/-]/)[0];
	var monthfield = input.value.split(/[\/-]/)[1];
	var yearfield = input.value.split(/[\/-]/)[2];

	var dayobj = new Date(yearfield, monthfield - 1, dayfield);
	if (
		dayobj.getMonth() + 1 != monthfield ||
		dayobj.getDate() != dayfield ||
		dayobj.getFullYear() != yearfield
	) {
		valid_date_alert(captionName1);
		frm.elements[field_name].focus();
		return false;
	}

	if (Trim(currentDate) == "") {
		//if current date is not passes
		currentDate = new Date();
		if (dayobj < currentDate) {
			future_date_only_allow_alert(captionName1, captionName2);
			return false;
		}
		return true;
	} else {
		//if  date is passed

		var curDayfield = currentDate.split(/[\/-]/)[0];
		var curMonthfield = currentDate.split(/[\/-]/)[1];
		var curYearfield = currentDate.split(/[\/-]/)[2];

		currentDate = new Date(curYearfield, curMonthfield - 1, curDayfield);

		if (dayobj <= currentDate) {
			future_date_only_allow_alert(captionName1, captionName2);
			frm.elements[field_name].focus();
			return false;
		}
		return true;
	}
}

function future_date_now_allow_alert(captionName1, captionName2) {
	if (captionName2.toString().toLowerCase() != "current date")
		alert(
			"'" +
				captionName1 +
				"' should not be greater than '" +
				captionName2 +
				"'."
		);
	else
		alert(
			"'" +
				captionName1 +
				"' should not be greater than '" +
				captionName2 +
				"'."
		);
}

function future_date_only_allow_alert(captionName1, captionName2) {
	alert(
		"'" + captionName1 + "' should be greater than '" + captionName2 + "'."
	);
}

function valid_date_alert(caption) {
	if (caption == "") {
		caption = " Date";
	} else {
		caption = caption.replace('"', "'");
	}
	alert("Please enter valid '" + caption + "'.");
}

function valid_date_format_alert(caption) {
	if (caption == "") {
		caption = " Date";
	} else {
		caption = caption.replace('"', "'");
	}
	alert("'" + caption + "' format should be DD-MM-YYYY."); // or DD/MM/YYYY
}

function valid_date_compare_alert(caption1, caption2) {
	if (caption1 == "") {
		caption1 = " From date";
	} else {
		caption1 = caption1.replace('"', "'");
	}

	if (caption2 == "") {
		caption2 = " To date";
	} else {
		caption2 = caption2.replace('"', "'");
	}

	alert(
		"'" + caption1 + "' must be less than or equal to '" + caption2 + "'"
	);
}

//-------------trim functions--------------

function Trim(TRIM_VALUE) {
	if (TRIM_VALUE.length < 1) return "";
	TRIM_VALUE = LTrim(TRIM_VALUE);
	TRIM_VALUE = RTrim(TRIM_VALUE);
	if (TRIM_VALUE == "") return "";
	else return TRIM_VALUE;
}
function RTrim(VALUE) {
	var w_space = String.fromCharCode(32);
	var w_enter = String.fromCharCode(10);
	var v_length = VALUE.length;
	var strTemp = "";
	if (v_length < 0) return "";
	var iTemp = v_length - 1;
	while (iTemp > -1) {
		if (VALUE.charAt(iTemp) == w_space || VALUE.charAt(iTemp) == w_enter)
			iTemp = iTemp - 1;
		else break;
	}
	strTemp = VALUE.substring(0, iTemp + 1);
	return strTemp;
}
function LTrim(VALUE) {
	var w_space = String.fromCharCode(32);
	var w_enter = String.fromCharCode(10);
	if (v_length < 1) return "";
	var v_length = VALUE.length;
	var strTemp = "";
	var iTemp = 0;
	while (iTemp < v_length) {
		if (VALUE.charAt(iTemp) == w_space || VALUE.charAt(iTemp) == w_enter)
			iTemp = iTemp + 1;
		else break;
	}
	strTemp = VALUE.substring(iTemp, v_length);
	return strTemp;
}
function myTrim(msg) {
	msg.value = Trim(msg.value);
}
