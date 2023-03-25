<%-- Document : nav Created on : 07-Oct-2021, 5:55:31 PM Author : njuser --%>
    <nav class="navbar navbar-expand-lg navbar-light bg-light shadow-sm">
        <div class="container rounded">
            <a class="navbar-brand" href="index.do">
                <h3 class="fs-4">Quote Inquiry</h3>
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
                aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item"><a onclick="getQuoteLoader()" class="inquiry-link nav-link">Quote Inquiry</a>
                    </li>
                    <li class="nav-item"><a onclick="getViewOfferLoader()" class="inquiry-link nav-link">View Offer</a>
                    </li>
                    <li class="nav-item"><a onclick="getReport()" class="inquiry-link nav-link">Report</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>