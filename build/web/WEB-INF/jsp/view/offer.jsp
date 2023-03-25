<%-- Document : offer Created on : 08-Oct-2021, 5:23:55 PM Author : Akshay --%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:choose>
<%-- ! THIS IS THE QUOTE FORM --%>
<c:when test="${process eq 'getQuote'}">
<form id="inquiryform">
<div class="card">
<div class="card-header text-white bg-primary mb-3">
<h5>Quote Inquiry</h5>
</div>
<div class="p-3">

<div class="card mb-3">
<div class="card-header"><i class="fas fa-user-alt"></i> Personal
Information</div>
<div class="card-body">
<div class="row g-3">

<div class="col-md-6">
<label for="firstname" class="form-label">First Name</label>
<input type="text" class="form-control" name="firstname"
id="firstname" placeholder="Enter First Name"
tabindex="1" />
</div>

<div class="col-md-6">
<label for="lastname" class="form-label">Last Name</label>
<input type="text" class="form-control" name="lastname"
id="lastname" placeholder="Enter Last Name" tabindex="2" />
</div>

<div class="col-md-6">
<label for="dob" class="form-label">Date of Birth <small
class="small text-muted">(Min Age : 18 & Max Age :
65)</small></label>
<div class="input-group mb-3">
<input type="text" disabled class="form-control" name="dob"
id="dob" placeholder="Select Date of Birth" />
<button class="btn btn-primary" type="button" id="btnDob"
title="Click here to Select Date" tabindex="3"><i
class="fas fa-calendar-day"></i></button>
</div>
</div>

<div class="col-md-6">
<label for="address" class="form-label">Address</label>
<input type="text" class="form-control" name="address"
id="address" placeholder="Enter Address" tabindex="4" />
</div>

<div class="col-md-5">
<label for="state" class="form-label">State</label>

<select id="state" class="form-select" name="state"
onchange="getCities()" tabindex="5">
<option value="default" disabled selected>Select State
</option>
<c:forEach var="state" items="${statelist}">
<option value="${state.id}">
${state.name.toUpperCase()}</option>
</c:forEach>
</select>
</div>

<div class="col-md-4">
<label for="city" class="form-label">City</label>
<select class="form-select" id="city" name="city" disabled
tabindex="6">
<option value="default" selected disabled>Select City
</option>
</select>
</div>

<div class="col-md-3">
<label for="pincode" class="form-label">Pincode</label>
<input type="text" class="form-control" name="pincode"
id="pincode" placeholder="Enter Pincode" tabindex="7" />
</div>

</div>
</div>
</div>

<div class="card mb-3">
<div class="card-header"><i class="fas fa-home"></i> Home Information</div>
<div class="card-body">
<div class="row g-3">
<div class="col-md-6">
<label for="crapetarea" class="form-label">Carpetarea (in
m<sup>2</sup>)</label>
<input type="text" class="form-control" name="carpetarea"
id="crapetarea" placeholder="Enter Carpetarea"
tabindex="8" />
</div>

<div class="col-md-6">
<label for="year" class="form-label">Build Year</label>
<input type="text" class="form-control" name="year" id="year"
placeholder="Enter Build Year" tabindex="8" />
</div>

<div class="col-md-4">
<fieldset class="form-group">
<legend class="col-form-label pt-0">Roof Material</legend>
<div class="form-check form-check-inline">
<input class="form-check-input" type="radio" name="roof"
id="roof-wodden" value="WOODEN" checked
tabindex="9">
<label class="form-check-label"
for="roof-wodden">Wodden</label>
</div>
<div class="form-check form-check-inline">
<input class="form-check-input" type="radio" name="roof"
id="roof-rcc" value="RCC">
<label class="form-check-label"
for="roof-rcc">Rcc</label>
</div>
</fieldset>
</div>

<div class="col-md-4">
<fieldset class="form-group">
<legend class="col-form-label pt-0">Floor Material</legend>
<div class="form-check form-check-inline">
<input class="form-check-input" type="radio"
name="floor" id="floor-wodden" value="WOODEN"
checked tabindex="10">
<label class="form-check-label"
for="floor-wodden">Wodden</label>
</div>
<div class="form-check form-check-inline">
<input class="form-check-input" type="radio"
name="floor" id="floor-tile" value="TILE">
<label class="form-check-label"
for="floor-tile">Tile</label>
</div>
</fieldset>
</div>

<div class="col-md-4">
<fieldset class="form-group">
<legend class="col-form-label pt-0">Fire Safety</legend>
<div class="form-check form-check-inline">
<input class="form-check-input" type="radio" name="fire"
id="fire-yes" value="1" checked tabindex="11">
<label class="form-check-label"
for="fire-yes">Yes</label>
</div>
<div class="form-check form-check-inline">
<input class="form-check-input" type="radio" name="fire"
id="fire-no" value="0">
<label class="form-check-label" for="fire-no">No</label>
</div>
</fieldset>
</div>

</div>
</div>
</div>

<div class="text-center">
<button type="button" class="btn btn-primary"
onclick="ValidateQuoteForm()">Generate
Quote</button>
<button type="reset" class="btn btn-warning">Reset</button>
</div>

</div>
</div>
</form>
</c:when>
<%-- ! THIS IS THE CHANGE COVERAGE OPTION VIEW --%>
<c:when test="${process eq 'changeCoverage'}">
<c:if test="${status eq '1'}">
<div class="card-body">
<form id="change-coverage">
<div class="row g-2">
<div class="col-md-12">
<label for="coverage" class="form-label">Coverage</label>
<div class="row align-items-center">
<div class="col-md-5">
<div class="input-group">
<span class="input-group-text">$</span>
<input type="text" class="form-control col-md-3"
name="coverage" disabled placeholder="coverage"
id="coverage" value="${offer.coverage}" />
</div>
</div>
<div class="col-md-7 d-flex justify-content-between">
<input type="range" class="form-range" id="range"
value="${offer.coverage}" min="${baseOffer.minCoverage}"
max="${baseOffer.maxCoverage}">
</div>
</div>
</div>
<input type="hidden" name="inquiryid" value="${offer.inquiryid}">
<input type="hidden" name="offerid" value="${offer.offerid}">
<div class="form-group mb-2">
<label for="premium" class="form-label">Premium</label>
<div class="input-group">
<span class="input-group-text">$</span>
<input type="text" class="form-control" id="premium"
placeholder="premium" name="premium" disabled
value="${offer.premium}">
<span class="input-group-text">Per Month</span>
</div>
</div>

<div class="text-center">
<button type="button" class="btn btn-primary"
onclick="confirm('Are you sure you want to Update Coverage?') && UpdateNewCoverage()">Update
Coverage</button>
<button type="button" class="btn btn-warning"
onclick="confirm('Are you sure you want to Cancel?') && getViewOfferLoader()">
Cancel</button>
</div>
</form>
</div>
</c:if>
<c:if test="${status eq '-1'}">
<div class="alert alert-danger" role="alert">
<h2>Cannot Update the Coverage of Provided Inquiry ID...</h2>
</div>
</c:if>

</c:when>
<%-- ! THIS IS THE VIEW OFFER TABLE VIEW OF ALL THE INQUIRIES TO BE GENERATED OR IS ALREADY
GENERATED --%>
<c:when test="${process eq 'viewOffer'}">
<div class="p-4 my-4 bg-light rounded-3">
<div class="container-fluid py-3">

<table class="table table-hover table-xl align-middle table-responsive">
<thead class="rounded">
<tr>
<th scope="col">Name / Inquiry ID</th>
<th scope="col">Offer Status</th>
<th scope="col">Address</th>
<th scope="col">Action</th>
</tr>
</thead>
<tbody>
<c:forEach items="${offerlist}" var="offerItem">
<tr>
<th scope="row">
<p class="name mb-0 text-capitalize">
${offerItem.firstname}
${offerItem.lastname}</p>
<p class="small text-muted mb-0">${offerItem.inquiryid}
</p>
</th>
<td>
<div class="d-flex align-items-center">
<c:if test="${offerItem.offerid eq null}">
<span
class="rounded-circle me-2 color-box bg-warning flex-grow-0 flex-shrink-0"></span><span
class="small">Generation Remaining</span>
</c:if>
<c:if test="${offerItem.offerid ne null}">
<span
class="rounded-circle me-2 color-box bg-success flex-grow-0 flex-shrink-0"></span>
<span class="small">Generated</span>
</c:if>
</div>
</td>
<td>
<p class="name mb-0 text-capitalize">
${offerItem.address},
${offerItem.pincode} </p>
<p class="small text-muted mb-0">${offerItem.city},
${offerItem.state}</p>
</td>
<td>
<c:if test="${offerItem.offerid eq null}">
<button type="button"
class="btn btn-warning btn-sm w-100"
onclick="GenerateOffer('${offerItem.inquiryid}')">Generate</button>
</c:if>
<c:if test="${offerItem.offerid ne null}">
<button type="button"
class="btn btn-success btn-sm w-100"
onclick="ViewGeneratedOffer('${offerItem.inquiryid}')">View</button>
</c:if>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</div>

</c:when>
<%-- ! THIS OPTION WILL LOAD THE OPTION LIST OF CITY IN QUOTE FORM ONCHANGING OF STATE
OPTION --%>
<c:when test="${process eq 'loadCity'}">
<option value="default" selected disabled>Select City</option>
<c:forEach var="city" items="${citylist}">
<option value="${city.id}">${city.name.toUpperCase()}</option>
</c:forEach>
</c:when>
<%-- ! THIS WILL GIVE US STATUS OF INQUIRY WHETHER ITS IS SUCCESSFULLY INSERTED OR
NOTE --%>
<c:when test="${process eq 'insertInquiry'}">
<input type="hidden" value="${status}" name="status" id="status">
</c:when>
<%-- ! THIS WILL SHOW THE VIEW OF GENERATED OFFER FROM THE VIEWOFFER MENU --%>
<c:when test="${process eq 'viewGeneratedOffer'}">
<c:if test="${status eq '1'}">
<div class="row g-3">
<div class="col-md-5 col-lg-4">
<ul class="list-group mb-3">
<li class="list-group-item list-group-item-primary">
<h4 class="text-primary mt-2">Offer Made for You
</h4>
</li>
<li class="list-group-item lh-sm">
<div>
<h6 class="my-0">Inquiry ID</h6>
<small
class="text-muted">${offer.inquiryid}</small>
</div>
</li>
<li class="list-group-item lh-sm">
<div>
<h6 class="my-0">Offer ID</h6>
<small
class="text-muted">${offer.offerid}</small>
</div>
</li>
<li
class="list-group-item d-flex justify-content-between lh-sm">
<div>
<h6 class="my-0">Coverage</h6>
<small class="text-muted">Coverage of
Property</small>
</div>
<span class="text-muted">
<fmt:formatNumber value="${offer.coverage}"
type="CURRENCY" currencySymbol="$" />
</span>
</li>
<li
class="list-group-item d-flex justify-content-between lh-sm">
<div>
<h6 class="my-0">Premium</h6>
<small class="text-muted">Premium for the
Coverage</small>
</div>
<span class="text-muted">
<fmt:formatNumber value="${offer.premium}"
type="CURRENCY" currencySymbol="$" />
</span>
</li>
</ul>
</div>
<div class="col-md-7 col-lg-8">
<div class="card">
<div class="card-header">

<span
class="fs-3 d-block text-capitalize">${inquiry.firstname}
${inquiry.lastname}</span>
<span
class="small text-muted">${inquiry.inquiryid}</span>
</div>
<ul class="list-group list-group-flush">
<li class="list-group-item">
<div class="d-flex flex-wrap w-75">
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="CARPETAREA">
<i class="fas fa-chart-area me-1"></i>
Carpetarea ${inquiry.carpetarea}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="BUILD YEAR">
<i class="fas fa-wrench me-1"></i>
Build Year ${inquiry.year}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="ROOF TYPE"><i
class="fas fa-home me-1"></i></i>
Ceiling ${inquiry.roof}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="FLOOR TYPE"><i
class="fas fa-arrows-alt me-1"></i>
Flooring ${inquiry.floor}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="FIRESAFTEY"><i
class="fas fa-fire-extinguisher me-1"></i>
Firesafety
<c:if test="${inquiry.fire eq 1}">
Yes
</c:if>
<c:if test="${inquiry.fire eq 0}">
No
</c:if>
</span>
</div>
</li>
</ul>
<div class="card-body">
<div id="updation">
<h5 class="card-title">Special Offer For Quoted
Information</h5>
<p class="card-text">We have generated the best
suitable offer for you according to your
home structure..
</p>


<div class="btn-group">
<button type="button"
class="btn btn-primary dropdown-toggle"
data-bs-toggle="dropdown"
aria-expanded="false">
More Options
</button>
<ul class="dropdown-menu">
<li><a href="#" class="dropdown-item"
onclick="getUpdateQuoteLoader('${inquiry.inquiryid}')">Update
Quote</a>
</li>
<li>
<hr class="dropdown-divider">
</li>
<li><a href="#" class="dropdown-item"
onclick="getChangeCoverage('${inquiry.inquiryid}')">Change
Coverage</a></li>
</ul>
</div>

<a href="#" class="btn btn-success"
onclick="showThankModal()">Secure Offer</a>
</div>

</div>
</div>
</div>
</div>
<div class="modal fade" id="thank" tabindex="-1"
aria-labelledby="Thank You Model" aria-hidden="true">
<div class="modal-dialog">
<div class="modal-content">
<div class="modal-header">
<h5 class="modal-title" id="exampleModalLabel">Thank
You</h5>
<button type="button" class="btn-close"
data-bs-dismiss="modal"
aria-label="Close"></button>
</div>
<div class="modal-body">
<div class="list-group">
<li
class="list-group-item list-group-item-action list-group-item-success">
<i class="fas fa-shopping-cart"></i>
Shopping Module is not
Build Yet, We are bringing these facility as
soon as possible...
</li>

</div>
</div>
<div class="modal-footer">
<button type="button" class="btn btn-success"
data-bs-dismiss="modal">Gotcha</button>
</div>
</div>
</div>
</div>
</c:if>
<c:if test="${status eq '-1'}">
<div class="alert alert-danger" role="alert">
<h2>Cannot View offer of Provided Inquiry ID...</h2>
</div>
</c:if>
</c:when>
<%-- ! THIS WILL SHOW THE OFFER IS GENERATED OR NOT ON CLICK ON GENERATE
OFFER OF BUTTON VIEWOFFER --%>
<c:when test="${process eq 'generateOffer'}">
<c:if test="${status eq '1'}">
<div class="alert alert-success mb-3" role="alert">

<h4 class="alert-heading">Yayy! Offer Generated.</h4>
<p>Aww yeah, you successfully Generated Offer Please Check
out the <a onclick="getViewOfferLoader()"
class="link-success">View Offer Page</a>, and
remember the Offer ID
given below for further process</p>
<hr>
</div>
<div class="card text-white bg-success mb-3"
style="max-width: 18rem;">
<div class="card-header">Offer Id : ${offer.offerid}</div>
<ul class="list-group">
<li class="list-group-item">Inquiry Id :
${offer.inquiryid}</li>
<li
class="list-group-item d-flex justify-content-between align-items-start">
<div class="ms-2 me-auto">
<div class="fw-bold">Property Coverage</div>
USD
<fmt:formatNumber value="${offer.coverage}"
type="CURRENCY" currencySymbol="$" />
</div>
</li>
<li
class="list-group-item d-flex justify-content-between align-items-start">
<div class="ms-2 me-auto">
<div class="fw-bold">Premium for the Coverage
</div>
USD
<fmt:formatNumber value="${offer.premium}"
type="CURRENCY" currencySymbol="$" />
</div>
</li>
</ul>
</div>
</c:if>
<c:if test="${status eq '-1'}">
<div class="alert alert-danger" role="alert">
<h2>Cannot Generate the offer of Provided Inquiry ID...</h2>
</div>
</c:if>
</c:when>
<%-- ! THIS WILL SHOW THE Status Of the Coverage Update --%>
<c:when test="${process eq 'updatedCoverageStatus'}">
<c:if test="${status eq '1'}">
<div class="alert alert-success" role="alert">
<h2>Coverage Updated Successfully</h2>
<h3>Please Feel Free to Check <a
onclick="getViewOfferLoader()"
class="link-success">View Menu</a> For
Further Process</h3>
</div>
</c:if>
<c:if test="${status eq '-1'}">
<div class="alert alert-danger" role="alert">
<h2>Cannot Update the Coverage of Provided Inquiry ID or
Offer ID...</h2>
</div>
</c:if>
</c:when>
<%-- ! This Will Show THE Status Of the Coverage Update --%>
<c:when test="${process eq 'updatedQuoteStatus'}">
<c:if test="${status eq '1'}">
<div class="alert alert-success" role="alert">
<h2>Quote Updated Successfully</h2>
<h3>Please Feel Free to Generate New Offer According
to Your New Quote Information in
<a onclick="getViewOfferLoader()"
class="link-success">View Menu</a>...
</h3>
</div>
</c:if>
<c:if test="${status eq '-1'}">
<div class="alert alert-danger" role="alert">
<h2>Cannot Update the Quote of Provided Inquiry ID
or Offer ID...</h2>
</div>
</c:if>
</c:when>
<%-- ! This Will Show THE Quote Form Fot quote Update Request
--%>
<c:when test="${process eq 'updateQuoteForm'}">
<c:if test="${status eq '1'}">
<div class="card mb-3">
<div class="card-header">Home Information</div>
<div class="card-body">
<form id="update-quote-from">
<div class="row g-3">
<input type="hidden"
name="inquiryid"
value="${quoteDetail.inquiryid}">
<div class="col-md-6">
<label for="crapetarea"
class="form-label">Carpetarea
(in m<sup>2</sup>)</label>
<input type="text"
class="form-control"
name="carpetarea"
id="crapetarea"
placeholder="Enter Carpetarea"
value="${quoteDetail.carpetarea}" />
</div>

<div class="col-md-6">
<label for="year"
class="form-label">Build
Year</label>
<input type="text"
class="form-control"
name="year" id="year"
placeholder="Enter Build Year"
value="${quoteDetail.year}" />
</div>

<div class="col-md-4">
<fieldset class="form-group">
<legend
class="col-form-label pt-0">
Roof Material</legend>
<div
class="form-check form-check-inline">
<input
class="form-check-input"
type="radio"
name="roof"
id="roof-wodden"
value="WOODEN"
${quoteDetail.roof=='WOODEN'
? 'checked' : '' }>
<label
class="form-check-label"
for="roof-wodden">Wodden</label>
</div>
<div
class="form-check form-check-inline">
<input
class="form-check-input"
type="radio"
name="roof"
id="roof-rcc"
value="RCC"
${quoteDetail.roof=='RCC'
? 'checked' : '' }>
<label
class="form-check-label"
for="roof-rcc">Rcc</label>
</div>
</fieldset>
</div>

<div class="col-md-4">
<fieldset class="form-group">
<legend
class="col-form-label pt-0">
Floor Material</legend>
<div
class="form-check form-check-inline">
<input
class="form-check-input"
type="radio"
name="floor"
id="floor-wodden"
value="WOODEN"
${quoteDetail.floor=='WOODEN'
? 'checked' : '' }>
<label
class="form-check-label"
for="floor-wodden">Wodden</label>
</div>
<div
class="form-check form-check-inline">
<input
class="form-check-input"
type="radio"
name="floor"
id="floor-tile"
value="TILE"
${quoteDetail.floor=='TILE'
? 'checked' : '' }>
<label
class="form-check-label"
for="floor-tile">Tile</label>
</div>
</fieldset>
</div>

<div class="col-md-4">
<fieldset class="form-group">
<legend
class="col-form-label pt-0">
Fire Safety</legend>
<div
class="form-check form-check-inline">
<input
class="form-check-input"
type="radio"
name="fire"
id="fire-yes"
value="1"
${quoteDetail.fire==1
? 'checked' : '' }>
<label
class="form-check-label"
for="fire-yes">Yes</label>
</div>
<div
class="form-check form-check-inline">
<input
class="form-check-input"
type="radio"
name="fire"
id="fire-no"
value="0"
${quoteDetail.fire==0
? 'checked' : '' }>
<label
class="form-check-label"
for="fire-no">No</label>
</div>
</fieldset>
</div>
<div class="text-center">
<button type="button"
class="btn btn-primary"
onclick="confirm('Are you sure you want to Update Quote Details?') && UpdateNewQuote()">Update
Quote</button>
<button type="button"
class="btn btn-warning"
onclick="confirm('Are you sure you want to Cancel?') && getViewOfferLoader()">Cancel</button>
</div>
</div>
</form>
</div>
</div>
</c:if>
<c:if test=" ${status eq '-1' }">
<div class="alert alert-danger" role="alert">
<h2>Cannot Update the Quote of Provided
InquiryID or OfferID</h2>
</div>
</c:if>

</c:when>
<%-- ! Loading View Report --%>
<c:when test="${process eq 'viewDetailReport'}">
<div class="p-4 my-4 bg-light rounded-3">
<div class="container-fluid py-3">
<h3 class="display-6 fw-bold"><i
class="fas fa-chart-pie"></i> Report
</h3>
<table
class="table table-hover table-xl align-middle">
<thead class="rounded">
<tr>
<th scope="col">Name / Inquiry
ID</th>
<th scope="col">Current Quote
</th>
<th scope="col">Current Offer ID
</th>
<th scope="col">Action</th>
</tr>
</thead>
<tbody>
<c:forEach items="${inquirylist}"
var="inquiry">
<tr>
<th scope="row">
<p class="name mb-0">
${inquiry.firstname}
${inquiry.lastname}
</p>
<p
class="small text-muted mb-0">
${inquiry.inquiryid}
</p>
</th>
<td>
<div
class="d-flex flex-wrap w-75">
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="CARPETAREA">
<i
class="fas fa-chart-area me-1"></i>
Carpetarea
${inquiry.carpetarea}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="BUILD YEAR">
<i
class="fas fa-wrench me-1"></i>
Build Year
${inquiry.year}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="ROOF TYPE"><i
class="fas fa-home me-1"></i></i>
Ceiling
${inquiry.roof}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="FLOOR TYPE"><i
class="fas fa-arrows-alt me-1"></i>
Flooring
${inquiry.floor}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="FIRESAFTEY"><i
class="fas fa-fire-extinguisher me-1"></i>
Firesafety
<c:if
test="${inquiry.firesafety eq 1}">
Yes
</c:if>
<c:if
test="${inquiry.firesafety eq 0}">
No
</c:if>
</span>
</div>
</td>
<td class="small">
<c:if
test="${inquiry.offerid ne null}">
${inquiry.offerid}
</c:if>
<c:if
test="${inquiry.offerid eq null}">
<div
class="d-flex align-items-center">
<span
class="rounded-circle me-2 color-box bg-warning flex-grow-0 flex-shrink-0"></span><span
class="small">Offer
Generation
Remaining</span>
</div>
</c:if>
</td>
<td><button type="button"
class="btn btn-primary btn-sm w-100"
onclick="getReportOfInquiry('${inquiry.inquiryid}')">
View Details
</button>
</td>
</tr>
</c:forEach>

</tbody>
</table>
</div>
</div>
<div id="load-report"></div>
</c:when>
<%-- ! Adding Modal to the Process --%>
<c:when test="${process eq 'addingModalReport'}">
<div class="modal fade" id="${modalid}"
tabindex="-1"
aria-labelledby="exampleModalLabel"
aria-hidden="true">

<div
class="modal-dialog modal-xl modal-dialog-scrollable">
<div class="modal-content">
<div class="modal-header">
<h5 class="modal-title">Detailed
Report of
<strong>${modalid}</strong>
</h5>
<button type="button"
class="btn-close"
data-bs-dismiss="modal"
aria-label="Close"></button>
</div>
<div class="modal-body">
<ul class="list-group mb-2">
<li class="list-group-item active"
aria-current="true">
Offer History</li>

<c:if
test="${quotelist.size() == 0}">
<li
class="list-group-item list-group-item-info">
<h3>
No Offer History
</h3>
</li>
</c:if>
<c:if
test="${quotelist.size() > 0}">
<table
class="table table-hover table-xl align-middle">
<thead
class="rounded">
<tr>
<th
scope="col">
Offer
ID
</th>
<th
scope="col">
Coverage
</th>
<th
scope="col">
Premium
</th>
</tr>
</thead>
<tbody>
<c:forEach
items="${offerlist}"
var="offer">
<tr>
<th>
${offer.offerid}
</th>
<td>
${offer.coverage}
</td>
<td>
${offer.premium}
</td>
</tr>
</c:forEach>
</tbody>
</table>
</c:if>
</ul>
<ul class="list-group mb-2">
<li class="list-group-item active"
aria-current="true">
Quote History</li>
<c:if
test="${quotelist.size() == 0}">
<li
class="list-group-item list-group-item-info">
<h3>
No Quote History
</h3>
</li>
</c:if>
<c:if
test="${quotelist.size() > 0}">
<table
class="table table-hover table-xl align-middle">
<thead
class="rounded">
<tr>
<th
scope="col">
Offer
ID
</th>
<th
scope="col">
Quote
Details
</th>

</tr>
</thead>
<tbody>
<c:forEach
items="${quotelist}"
var="quote">
<tr>
<th
scope="row">
${quote.offerid}
</th>
<td>
<div
class="d-flex flex-wrap w-75">
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="CARPETAREA">
<i
class="fas fa-chart-area me-1"></i>
Carpetarea
${quote.carpetarea}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="BUILD YEAR">
<i
class="fas fa-wrench me-1"></i>
Build
Year
${quote.year}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="ROOF TYPE"><i
class="fas fa-home me-1"></i></i>
Ceiling
${quote.roof}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="FLOOR TYPE"><i
class="fas fa-arrows-alt me-1"></i>
Flooring
${quote.floor}
</span>
<span
class="m-1 badge rounded-pill bg-info text-dark bg-opacity-50"
title="FIRESAFTEY"><i
class="fas fa-fire-extinguisher me-1"></i>
Firesafety
<c:if
test="${quote.firesafety eq true}">
Yes
</c:if>
<c:if
test="${quote.firesafety eq false}">
No
</c:if>
</span>
</div>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</c:if>
</ul>
</div>
<div class="modal-footer">
<button type="button"
class="btn btn-secondary"
data-bs-dismiss="modal">Close</button>
</div>
</div>
</div>
</div>
</c:when>
<%-- ! DEFAULT PAGE FOR IF THE PROCESS IS NOT FOUND
--%>
<c:otherwise>
<h1>Will Think of that...</h1>
</c:otherwise>
</c:choose>