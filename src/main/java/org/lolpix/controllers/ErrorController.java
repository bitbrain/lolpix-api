package org.lolpix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Lukas F&uuml;lling
 */
@Controller
public class ErrorController implements org.springframework.boot.autoconfigure.web.ErrorController {

    private static final String PATH = "/error";

    private final ErrorAttributes errorAttributes;

    @Autowired
    public ErrorController(ErrorAttributes errorAttributes) {
        Assert.notNull(errorAttributes, "ErrorAttributes must not be null.");
        this.errorAttributes = errorAttributes;
    }

    /**
     * Builds the error view.
     *
     * @param aRequest the failed request
     * @return the error mav
     */
    @RequestMapping(PATH)
    ModelAndView error(HttpServletRequest aRequest) {
        RequestAttributes requestAttributes = new ServletRequestAttributes(aRequest);
        ModelAndView mav = new ModelAndView("error");
        mav.addObject("error_attrs", errorAttributes.getErrorAttributes(requestAttributes, getTraceParameter(aRequest)));
        return mav;
    }

    private boolean getTraceParameter(HttpServletRequest request) {
        String parameter = request.getParameter("trace");
        return parameter != null && !"false".equals(parameter.toLowerCase());
    }


    public ErrorAttributes getErrorAttributes() {
        return errorAttributes;
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}