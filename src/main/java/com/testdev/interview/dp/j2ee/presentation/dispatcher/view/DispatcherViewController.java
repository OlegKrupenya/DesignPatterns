package com.testdev.interview.dp.j2ee.presentation.dispatcher.view;

import com.sun.net.httpserver.Authenticator;
import com.testdev.interview.dp.j2ee.presentation.service.to.worker.RequestHelper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The Dispatcher View pattern is a combination of the Front Controller pattern with a dispatcher, and the View Helper pattern.
 * The Dispatcher View pattern suggests deferring content retrieval to the time of view processing.
 * Also, the dispatcher plays a more limited role in view management, as the choice of view is typically already included in the request.
 * Created by oleh.krupenia on 6/30/2015.
 */
public class DispatcherViewController extends HttpServlet {

    /** Processes requests for both HTTP
     * <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest
                                          request, HttpServletResponse response)
            throws ServletException, java.io.IOException {
        String nextview;
        try {
            // Use a helper object to gather parameter
            // specific information.
            RequestHelper helper = new
                    RequestHelper(request, response);


            Authenticator auth = new BasicAuthenticator();
            auth.authenticate(helper);

            nextview = request.getParameter("nextview");
        }
        catch (Exception e) {
            /** ApplicationResources provides a simple API
             * for retrieving constants and other
             * preconfigured values**/
            nextview = "error.jsp";
        }
        dispatch(request, response, nextview);
    }

    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, java.io.IOException {
        processRequest(request, response);
    }

    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, java.io.IOException {
        processRequest(request, response);
    }

    /** Returns a short description of the servlet. */
    public String getServletInfo(){
        return getSignature();
    }

    public void init(ServletConfig config) throws
            ServletException {
        super.init(config);
    }

    public void destroy() { }

    /**
     * dispatcher method
     */
    protected void dispatch(HttpServletRequest request,
                            HttpServletResponse response, String page)
            throws javax.servlet.ServletException,
            java.io.IOException {
        RequestDispatcher dispatcher =
                getServletContext().
                        getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }

    private String getSignature()  {
        return "DispatcherView-DispatcherViewController";
    }
}
