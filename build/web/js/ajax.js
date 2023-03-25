// ! Loading & Error Text
const varAjaxLoading = `<style>.bouncer{display:flex;justify-content:space-around;align-items:flex-end;width:100px;height:100px;position:fixed;top:50%;left:50%;transform:translate(-50%,-50%)}.bouncer>div{width:20px;height:20px;background:#07f;border-radius:50%;animation:bouncer .5s cubic-bezier(.19,.57,.3,.98) infinite alternate}.bouncer>div:nth-child(2){animation-delay:.1s;opacity:.8}.bouncer>div:nth-child(3){animation-delay:.2s;opacity:.6}.bouncer>div:nth-child(4){animation-delay:.3s;opacity:.4}@keyframes bouncer{from{transform:translateY(0)}to{transform:translateY(-100px)}}</style><div class="bouncer"><div></div><div></div><div></div><div></div></div>`;
const varAjaxProblem = `<style>.ajax-error{background-color:#f8d7da;border-color:#842029;border:1px solid rgba(0,0,0,.125);color:#842029;display:block;border-radius:.25rem;font-family:'Courier New',Courier,monospace;font-size:1.2rem;padding:.5rem 1rem;text-align:center;text-decoration:none}</style><p class="ajax-error"><strong>Some error arise.</strong></p>`;
// const WAITING_TIME = 0;
function AjaxAsynchronous(URL, DESTINATION, PARAM = "") {
	const XHR = false;
	if (window.XMLHttpRequest) {
		XHR = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		XHR = new ActiveXObject("Microsoft.XMLHTTP");
	}
	if (XHR) {
		const DESTINATION_OBJ = document.getElementById(DESTINATION);
		DESTINATION_OBJ.innerHTML = varAjaxLoading;

		// setTimeout(() => {
		XHR.open("POST", URL);
		XHR.setRequestHeader(
			"Content-Type",
			"application/x-www-form-urlencoded"
		);

		XHR.onreadystatechange = function () {
			if (XHR.readyState == 4) {
				if (XHR.status == 200)
					DESTINATION_OBJ.innerHTML = XHR.responseText;
				else DESTINATION_OBJ.innerHTML = varAjaxProblem;
			}
		};
		XHR.send(PARAM);
		// }, WAITING_TIME);
	}
}

// Getting Synchronous Data Using Ajax
function AjaxSynchronous(URL, DESTINATION, PARAM = "") {
	let XHR = false;
	if (window.XMLHttpRequest) {
		XHR = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		XHR = new ActiveXObject("Microsoft.XMLHTTP");
	}
	if (XHR) {
		const DESTINATION_OBJ = document.getElementById(DESTINATION);
		DESTINATION_OBJ.innerHTML = varAjaxLoading;

		// setTimeout(() => {
		XHR.open("POST", URL, false);
		XHR.setRequestHeader(
			"Content-Type",
			"application/x-www-form-urlencoded"
		);
		XHR.send(PARAM);
		if (XHR.readyState == 4) {
			if (XHR.status == 200) DESTINATION_OBJ.innerHTML = XHR.responseText;
			else DESTINATION_OBJ.innerHTML = varAjaxProblem;
		}
		// }, WAITING_TIME);
	}
}

function getDataResponse(dataSource, divID, param, function_name) {
	var XMLHttpRequestObject = false;
	if (window.XMLHttpRequest) {
		XMLHttpRequestObject = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		XMLHttpRequestObject = new ActiveXObject("Microsoft.XMLHTTP");
	}
	if (XMLHttpRequestObject) {
		var obj = document.getElementById(divID);
		obj.innerHTML = varLoading;
		XMLHttpRequestObject.open("POST", dataSource);
		XMLHttpRequestObject.setRequestHeader(
			"Content-Type",
			"application/x-www-form-urlencoded"
		);
		XMLHttpRequestObject.onreadystatechange = function () {
			if (
				XMLHttpRequestObject.readyState == 4 &&
				XMLHttpRequestObject.status == 200
			) {
				obj.innerHTML = XMLHttpRequestObject.responseText;
				if (function_name != "" && function_name != "getDataResponse") {
					eval(function_name + "();");
				}
			}

			if (XMLHttpRequestObject.readyState == 4) {
				if (XMLHttpRequestObject.status == 200) {
					obj.innerHTML = XMLHttpRequestObject.responseText;
					if (
						function_name != "" &&
						function_name != "getDataResponse"
					) {
						eval(function_name + "();");
					}
				} else {
					obj.innerHTML = varProblem;
				}
			}
		};
		XMLHttpRequestObject.send(param);
	}
}

// Getting Parameters From FORM

function getFormData(oForm) {
	var aParams = new Array();
	aParams = getalldata(oForm);
	return aParams;
}
function getalldata(oForm, isNew) {
	var aParams = new Array();
	var sParam = "";
	var flag = false;
	for (var i = 0; i < oForm.elements.length; i++) {
		if (oForm.elements[i].tagName == "SELECT") {
			if (isNew == undefined || isNew == false) {
				for (var j = 0; j < oForm.elements[i].options.length; j++) {
					if (oForm.elements[i].options[j].selected) {
						sParam = encodeURIComponent(oForm.elements[i].name);
						sParam += "=";
						sParam += encodeURIComponent(
							oForm.elements[i][j].value
						);
						aParams.push(sParam);
					}
				}
			} else {
				for (
					var j = 0, k = 0;
					j < oForm.elements[i].options.length;
					j++
				) {
					if (k == 0 && oForm.elements[i].options[j].selected) {
						sParam = encodeURIComponent(oForm.elements[i].name);
						sParam += "=";
						k++;
					}
					if (oForm.elements[i].options[j].selected) {
						sParam +=
							encodeURIComponent(oForm.elements[i][j].value) +
							",";
						flag = true;
					}
				}
				if (flag) {
					sParam = sParam.substr(0, sParam.length - 1);
					aParams.push(sParam);
				}
				flag = false;
			}
		}
		if (oForm.elements[i].type == "textarea") {
			sParam = encodeURIComponent(oForm.elements[i].name);
			sParam += "=";
			sParam += encodeURIComponent(oForm.elements[i].value);
			aParams.push(sParam);
		}
		if (
			oForm.elements[i].type == "checkbox" &&
			oForm.elements[i].checked == true
		) {
			sParam = encodeURIComponent(oForm.elements[i].name);
			sParam += "=";
			sParam += encodeURIComponent(oForm.elements[i].value);
			aParams.push(sParam);
		}
		if (
			oForm.elements[i].type == "radio" &&
			oForm.elements[i].checked == true
		) {
			sParam = encodeURIComponent(oForm.elements[i].name);
			sParam += "=";
			sParam += encodeURIComponent(oForm.elements[i].value);
			aParams.push(sParam);
		}
		if (
			oForm.elements[i].tagName == "INPUT" &&
			oForm.elements[i].type == "text"
		) {
			sParam = encodeURIComponent(oForm.elements[i].name);
			sParam += "=";
			sParam += encodeURIComponent(oForm.elements[i].value);
			aParams.push(sParam);
		}
		if (
			oForm.elements[i].tagName == "INPUT" &&
			oForm.elements[i].type == "hidden"
		) {
			sParam = encodeURIComponent(oForm.elements[i].name);
			sParam += "=";
			sParam += encodeURIComponent(oForm.elements[i].value);
			aParams.push(sParam);
		}
		if (
			oForm.elements[i].tagName == "INPUT" &&
			oForm.elements[i].type == "password"
		) {
			sParam = encodeURIComponent(oForm.elements[i].name);
			sParam += "=";
			sParam += encodeURIComponent(oForm.elements[i].value);
			aParams.push(sParam);
		}
		if (
			oForm.elements[i].tagName == "INPUT" &&
			oForm.elements[i].type == "file"
		) {
			sParam = encodeURIComponent(oForm.elements[i].name);
			sParam += "=";
			sParam += encodeURIComponent(oForm.elements[i].value);
			aParams.push(sParam);
		}
	}
	return aParams.join("&");
}
