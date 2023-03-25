const inquiryLinks = document.querySelectorAll(".inquiry-link");

// ? Loads The Quote Inquiry Form
function getQuoteLoader() {
	AjaxSynchronous("home.do?cmdAction=loadGetQuote", "load");
	// ! Get Date Picker Functionality
	getDatePicker("btnDob", "dob");
}
// ? Loads The Change Coverage
function getChangeCoverageLoader() {
	AjaxSynchronous("home.do?cmdAction=loadChangeCoverage", "load");
}
// ? Loads The View Offer
function getViewOfferLoader() {
	AjaxSynchronous("home.do?cmdAction=loadViewOffer", "load");
}
// ? Loads The Update Quote
function getUpdateQuoteLoader(inquiryId) {
	AjaxSynchronous(
		"home.do?cmdAction=loadUpdateQuoteForm",
		"updation",
		`inquiryid=${inquiryId}`
	);
}
// ? Generates Offer On Click
function GenerateOffer(inquiryId) {
	AjaxSynchronous(
		"home.do?cmdAction=generateOffer",
		"load",
		`inquiryid=${inquiryId}`
	);
	removeActive();
}
// ? View Offer on Click View Offer
function ViewGeneratedOffer(inquiryId) {
	AjaxSynchronous(
		"home.do?cmdAction=viewOffer",
		"load",
		`inquiryid=${inquiryId}`
	);
	removeActive();
}
// ? This Will Load the Report
function getReport() {
	AjaxSynchronous("home.do?cmdAction=loadReport", "load");
}

// ! Will Load the Change Coverage
function getChangeCoverage(inquiryId) {
	AjaxSynchronous(
		"home.do?cmdAction=loadChangeCoverage",
		"updation",
		`inquiryid=${inquiryId}`
	);
	CoverageRange();
}
// ! This Method will Updatethecoverage
function UpdateNewCoverage() {
	// * Form Object
	const quoteform = document.getElementById("change-coverage");
	// ! Validation OF Coverage Form
	let result =
		validate_only_number(quoteform, "coverage", "Coverage", true) &&
		validate_required(quoteform, "coverage", "Coverage") &&
		validate_only_number(quoteform, "premium", "Premium", true) &&
		validate_required(quoteform, "premium", "Premium");
	// ! Getting Parameter QueryString
	const params = getFormData(quoteform);
	// alert(params);
	if (result) {
		AjaxSynchronous(
			"home.do?cmdAction=updateNewCoverage",
			"updation",
			params
		);
	}
}
// ! This Method will Update the quote
function UpdateNewQuote() {
	// * Form Object
	const quoteform = document.getElementById("update-quote-from");
	// ! Validation OF Coverage Form
	let result = validateHomeData(quoteform);
	// ! Getting Parameter QueryString
	const params = getFormData(quoteform);
	// alert(params);
	if (result) {
		AjaxSynchronous("home.do?cmdAction=updateNewQuote", "updation", params);
	}
}

// ! Get City While Selecting State
function getCities() {
	document.getElementById("city").disabled = false;
	const state = document.getElementById("state").value;
	AjaxSynchronous("home.do?cmdAction=loadCities", "city", "state=" + state);
}

// ? Submit Quote Inquiry Form
// ! on click generate quote
function ValidateQuoteForm() {
	// * Form Object
	const quoteform = document.getElementById("inquiryform");
	// ! Validation
	let result = validatePersonalData(quoteform) && validateHomeData(quoteform);
	// ! Getting Parameter QueryString
	const params = getFormData(quoteform);
	// alert(params);
	if (result) {
		AjaxSynchronous("home.do?cmdAction=insertInquiry", "load", params);

		const status = document.getElementById("status").value;
		if (status > 0) {
			alert("Inquiry created successfully!");
		} else {
			alert("Problem in inquiry creation, try again later");
		}
		removeActive();
	}
}
// ? Validation Section
// ! Validation According to Type of Fields
// * Personal Details
function validatePersonalData(quoteform) {
	return (
		validate_required(quoteform, "firstname", "First Name") &&
		validate_alphabet_only(quoteform, "firstname", "First Name") &&
		validate_length(quoteform, "firstname", "First Name", 30) &&
		validate_required(quoteform, "lastname", "Last Name") &&
		validate_alphabet_only(quoteform, "lastname", "Last Name") &&
		validate_length(quoteform, "lastname", "Last Name", 30) &&
		validate_required(quoteform, "dob", "Date Of Birth") &&
		validateDate_txt("dob", "Date of Birth", true) &&
		validate_address(quoteform, "address", "Address", true) &&
		validate_dropdown(quoteform, "state", "State", true) &&
		validate_dropdown(quoteform, "city", "City") &&
		validate_pincode(quoteform, "pincode", "Pincode", "no", true)
	);
}
// * Home Details
function validateHomeData(quoteform) {
	return (
		validate_only_number(quoteform, "crapetarea", "Carpet Area", true) &&
		validate_only_number(quoteform, "year", "Build Year", true) &&
		validate_year(quoteform, "year", "Build Year") &&
		validate_radio(quoteform, "roof", "Roof", true) &&
		validate_radio(quoteform, "floor", "Floor", true) &&
		validate_radio(quoteform, "fire", "Fire", true)
	);
}

// ? Required Validation
function validate_required(frm, field_name, captionName) {
	const fieldvalue = frm.elements[field_name].value;

	if (Trim(fieldvalue) == "") {
		value_common_alert(captionName);
		frm.elements[field_name].focus();
		return false;
	}
	return true;
}
// ? Alphabet Only Validation
function validate_alphabet_only(frm, field_name, captionName) {
	const fieldvalue = frm.elements[field_name].value;

	alpharegexpr = /^[A-Za-z]+$/;

	if (Trim(fieldvalue) != "") {
		if (alpharegexpr.test(fieldvalue) != true) {
			valid_common_alert_alphabets(captionName);
			frm.elements[field_name].focus();
			return false;
		}
	}
	return true;
}
// function validate_length to check length of the field
function validate_length(frm, field_name, captionName, maxLength) {
	const fieldvalue = frm.elements[field_name].value;
	const MAX_LENGTH = maxLength;

	if (fieldvalue.length > MAX_LENGTH) {
		alert(`'${captionName} Length not more than ${MAX_LENGTH}'`);
		return false;
	} else {
		return true;
	}
}
// function validate_year(year) {
function validate_year(frm, field_name, captionName) {
	const fieldvalue = frm.elements[field_name].value;
	const MAX_YEAR_ALLOWED = 25;
	var alpharegexpr = /^[0-9]+$/;
	if (fieldvalue.length == 4) {
		if (fieldvalue != 0) {
			if (fieldvalue != "" && !alpharegexpr.test(fieldvalue)) {
				alert("Please Enter Numeric Values Only");
				return false;
			}
			if (fieldvalue.length != 4) {
				alert("Please Enter Valid Year (YYYY).");
				return false;
			}
			var current_year = new Date().getFullYear();
			if (
				fieldvalue < current_year - MAX_YEAR_ALLOWED ||
				fieldvalue > current_year
			) {
				alert(
					`'${captionName}' should be between ${
						current_year - MAX_YEAR_ALLOWED
					} and  ${current_year}`
				);
				return false;
			}
			return true;
		}
	} else {
		alert(`Please Enter Valid '${captionName}' (YYYY).`);
		return false;
	}
}
// ? UI - Interaction
// ! UI FUNCTIONALITY
inquiryLinks.forEach((link) => {
	link.addEventListener("click", () => {
		removeActive();
		link.classList.add("active");
	});
});
function removeActive() {
	inquiryLinks.forEach((link) => {
		link.classList.remove("active");
	});
}
// ! Date Picker Btn Click Functionality (Specific for DOB)
function getDatePicker(btnClick, inputField) {
	const btnFn = document.getElementById(btnClick);
	$(function () {
		$("#" + inputField).datepicker({
			yearRange: `${new Date().getFullYear() - 65}:${
				new Date().getFullYear() - 18
			}`,
			changeMonth: true,
			changeYear: true,
			dateFormat: "dd-mm-yy",
			maxDate: "=-18Y",
		});
	});
	btnFn.addEventListener("click", () => {
		$("#" + inputField).datepicker("show");
	});
}
// ! End Of Btn Click Functionality

// ! RANGE FUNCTIONALITY
function CoverageRange() {
	const range = document.getElementById("range");
	const coverage = document.getElementById("coverage");
	const premium = document.getElementById("premium");
	const BASE_COVERAGE = parseInt(coverage.value);
	const BASE_PREMIUM = parseInt(premium.value);
	let percent = 0;

	range.addEventListener("input", (e) => {
		coverage.value = e.target.value;
		percent =
			((e.target.value - BASE_COVERAGE) * 20) /
			(BASE_COVERAGE * 0.2) /
			100;
		premium.value = Math.round(BASE_PREMIUM + BASE_PREMIUM * percent);

		if (
			e.target.value == range.getAttribute("max") ||
			e.target.value == range.getAttribute("min")
		) {
			alert(
				`Coverage Range lies between (${range.getAttribute(
					"min"
				)} & ${range.getAttribute("max")})`
			);
		}
	});
}
// ! This Method Will Load the Repoet of the Given Inquiry ID
function getReportOfInquiry(inquiryId) {
	// ? Getting modal in load-report Container
	AjaxSynchronous(
		"home.do?cmdAction=loadDetailedReport",
		"load-report",
		`inquiryid=${inquiryId}`
	);
	// ? Showing the modal
	showModalReport(inquiryId);
}
// ! Modal Functionality
function showModalReport(modalID) {
	var reportModal = new bootstrap.Modal(document.getElementById(modalID));
	reportModal.show();
}
// ! Secure Offer
function showThankModal() {
	var inquiryModal = new bootstrap.Modal(document.getElementById("thank"));
	inquiryModal.show();
}
