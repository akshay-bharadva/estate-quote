package com.logical.demo.inquiry.inquirycontroller.apps;

import com.logical.demo.inquiry.inquirycontroller.business.InquiryBaseOfferBean;
import com.logical.demo.inquiry.inquirycontroller.business.InquiryEntityBean;
import com.logical.demo.inquiry.inquiryoffer.module.InquiryOffer;
import com.notedown.utility.Logger;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 *
 * @author Akshay
 */
public class QuoteInquiryController extends MultiActionController {

    QuoteInquiryService quoteInquiryService = new QuoteInquiryService();
    final String FILE_NAME = "C:\\Users\\Akshay\\Documents\\NetBeansProjects\\SpringQuote\\web\\log\\log.txt";
    Logger logger = new Logger(FILE_NAME);

    // ! This Method Will Loads Home Page
    public ModelAndView loadHomePage(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("quoteinquiry");

        logger.logData("Controller | Loading Home Page");

        return modelAndView;
    }

    // ! This Method Will Loads Quote Inquiry Form
    public ModelAndView loadGetQuote(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "getQuote");

        logger.logData("Controller | Loading Quote Form");

        try {
            modelAndView.addObject("statelist", quoteInquiryService.getState());
        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);
        } catch (Exception ex) {
            logger.logError(ex);
        }
        return modelAndView;
    }

    // ! This Method Will Loads Change Coverage UI
    public ModelAndView loadChangeCoverage(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "changeCoverage");

        String inquiryid = request.getParameter("inquiryid");

        logger.logData("Controller | Loading Change Coverage of Inquiry ID (" + inquiryid + ")");

        try {
            InquiryOffer offer = quoteInquiryService.viewOffer(inquiryid);
            InquiryBaseOfferBean baseOffer = quoteInquiryService.getBaseOffer(inquiryid);

            if (offer != null) {
                modelAndView.addObject("status", "1");
                modelAndView.addObject("offer", offer);
                modelAndView.addObject("baseOffer", baseOffer);
            } else {
                modelAndView.addObject("status", "-1");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);
        } catch (Exception ex) {
            logger.logError(ex);
        }

        return modelAndView;
    }

    // ! This Method Will Loads Offer List of Inquiry
    public ModelAndView loadViewOffer(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "viewOffer");

        logger.logData("Controller | In View Offer");

        try {
            modelAndView.addObject("offerlist", quoteInquiryService.getAllOffers());
        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);
        } catch (Exception ex) {
            logger.logError(ex);
        }

        return modelAndView;
    }

    // ! This Method Will Loads Update Quote UI
    public ModelAndView loadUpdateQuote(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "updateQuote");
        modelAndView.addObject("status", "1");

        logger.logData("Controller | In Update Quote");

        return modelAndView;
    }

    // ! This Method Will Loads City In Quote Form Data of selected State
    public ModelAndView loadCities(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "loadCity");

        int state = Integer.parseInt(request.getParameter("state"));

        logger.logData("Controller | Loading City For Quote Form ( of state : " + state + ") : ");

        try {
            modelAndView.addObject("citylist", quoteInquiryService.getCities(state));
        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);
        } catch (Exception ex) {
            logger.logError(ex);
        }
        return modelAndView;
    }

    // ! This Method Will Inserts the data into inquiry table of the Quote Form
    //Model = FormBeans & EntityBean
    //For =       ->Form      ->DataBase
    public ModelAndView insertInquiry(HttpServletRequest request, HttpServletResponse response, InquiryFormBean inquiryFormBean) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "insertInquiry");

        logger.logData("Controller | In InsertInquiry : ");

        try {
            modelAndView.addObject("status", quoteInquiryService.createQuoteInquiry(inquiryFormBean));
        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);
        } catch (Exception ex) {
            logger.logError(ex);
        }

        return modelAndView;
    }

    // ! This Method Will Generate Offer According top the Inquiry ID : Conditions on Data
    public ModelAndView generateOffer(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "generateOffer");

        String inquiryid = request.getParameter("inquiryid");

        logger.logData("Controller | In Generate Offer of Inquiry Id (" + inquiryid + "): ");

        try {
            InquiryOffer offer = quoteInquiryService.generateOffer(inquiryid);

            if (offer != null) {
                modelAndView.addObject("status", "1");
                modelAndView.addObject("offer", offer);
            } else {
                modelAndView.addObject("status", "-1");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);
        } catch (Exception ex) {
            logger.logError(ex);
        }
        return modelAndView;
    }

    // ! This Method Will Show The Generated Offer viewOffer
    public ModelAndView viewOffer(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "viewGeneratedOffer");

        String inquiryid = request.getParameter("inquiryid");

        logger.logData("Controller | In View Offer of Inquiry Id (" + inquiryid + "): ");

        try {
            InquiryOffer offer = quoteInquiryService.viewOffer(inquiryid);
            InquiryEntityBean inquiryDetail = quoteInquiryService.getInquiryDetails(inquiryid);

            if (offer != null) {
                modelAndView.addObject("status", "1");
                modelAndView.addObject("offer", offer);
                modelAndView.addObject("inquiry", inquiryDetail);
            } else {
                modelAndView.addObject("status", "-1");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);
        } catch (Exception ex) {
            logger.logError(ex);
        }
        return modelAndView;
    }

    public ModelAndView updateNewCoverage(HttpServletRequest request, HttpServletResponse response, UpdateCoverageFormBean updateCoverageFormBean) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "updatedCoverageStatus");

        String offerid = request.getParameter("offerid");

        logger.logData("Controller | In Update New Coverage of OfferId (" + offerid + ") : ");

        try {
            int check = quoteInquiryService.updateNewCoverage(updateCoverageFormBean);

            if (check > 0) {
                modelAndView.addObject("status", "1");
            } else {
                modelAndView.addObject("status", "-1");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);
        } catch (Exception ex) {
            logger.logError(ex);
        }
        return modelAndView;
    }

    // ! This Method Will Loads Update Quote UI Of Home Details Only
    public ModelAndView loadUpdateQuoteForm(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "updateQuoteForm");

        String inquiryid = request.getParameter("inquiryid");

        logger.logData("Controller | Loading Quote Form for Quote Updation for Inquiry ID (" + inquiryid + ")");

        try {
            InquiryEntityBean inquiryEntityBean = quoteInquiryService.getInquiryDetails(inquiryid);

            if (inquiryEntityBean != null) {
                modelAndView.addObject("status", "1");
                modelAndView.addObject("quoteDetail", inquiryEntityBean);
            } else {
                modelAndView.addObject("status", "-1");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);

        } catch (Exception ex) {
            logger.logError(ex);

        }

        return modelAndView;
    }

    public ModelAndView updateNewQuote(HttpServletRequest request, HttpServletResponse response, UpdateQuoteFormBean updateQuoteFormBean) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "updatedQuoteStatus");

        logger.logData("Controller | In Update New Quote of Inquiry ID (" + updateQuoteFormBean.getInquiryid() + ") : ");

        // ! Do Something
        try {
            int check = quoteInquiryService.updateNewQuote(updateQuoteFormBean);

            if (check > 0) {
                modelAndView.addObject("status", "1");
            } else {
                modelAndView.addObject("status", "-1");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);

        } catch (Exception ex) {
            logger.logError(ex);

        }
        return modelAndView;
    }

// ! This Method is similar to loadOffer to show details of the inquiry from the table
    public ModelAndView loadReport(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "viewDetailReport");

        logger.logData("Controller | In View Reqport");

        // ! Do Something
        try {
            modelAndView.addObject("inquirylist", quoteInquiryService.getAllOffers());
        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);
        } catch (Exception ex) {
            logger.logError(ex);
        }
        return modelAndView;
    }

    // ! loadDetailedReport
    public ModelAndView loadDetailedReport(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("view/offer");
        modelAndView.addObject("process", "addingModalReport");
        String inquiryid = request.getParameter("inquiryid");

        logger.logData("Controller | In Load Detailed Repoert of Inquiry Id (" + inquiryid + ")");

        // ! Getting List of Offer And Old Quote from inquiryid
        try {

            modelAndView.addObject("offerlist", quoteInquiryService.getOfferList(inquiryid));
            modelAndView.addObject("quotelist", quoteInquiryService.getQuoteList(inquiryid));
            modelAndView.addObject("modalid", inquiryid);

        } catch (ClassNotFoundException | SQLException ex) {
            logger.logError(ex);

        } catch (Exception ex) {
            logger.logError(ex);

        }

        return modelAndView;
    }
}
