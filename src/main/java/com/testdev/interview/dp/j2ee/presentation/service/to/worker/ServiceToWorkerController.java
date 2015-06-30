package com.testdev.interview.dp.j2ee.presentation.service.to.worker;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The Service to Worker pattern is another name for the combination of the Front Controller pattern with a dispatcher and the View Helper pattern. The Service to Worker and Dispatcher View patterns are identical with respect to the components involved, but differ in the division of labor among those components. The Dispatcher View pattern suggests deferring content retrieval to the time of view processing. Also, the dispatcher plays a more limited role in view management, as the choice of view is typically already included in the request.
 *
 * An example of the dispatcher playing a moderate role is the case where the client submits a request directly to a controller with a query parameter that describes an action to be completed:

 http://some.server.com/servlet/Controller?action=login
 The responsibility of the dispatcher component here is to translate the logical name login into the resource name of an appropriate view, such as login.jsp, and dispatch to that view.
 *  Created by oleh.krupenia on 6/30/2015.
 */
public class ServiceToWorkerController extends HttpServlet {
    /** Processes requests for both HTTP
     * <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest
                                          request, HttpServletResponse response)
            throws ServletException, java.io.IOException {
        String next;

        try {


            // Use a helper object to gather parameter
            // specific information.
            RequestHelper helper = new
                    RequestHelper(request, response);


            // Get command object helper
            Command command = helper.getCommand();
            // delegate processing to the command object,
            // passing request and response objects along
            next = command.execute(helper);

            /** If the above command returns a value, we
             * will dispatch from the controller. In this
             * example, though, the command will use a
             * separate dispatcher component to choose a
             * view and dispatch to that view. The command
             * object delegates to this dispatcher
             * component in its execute method, above, and
             * control should not return to this point **/
        }
        catch (Exception e) {
            next = "error.jsp";
        }

        dispatch(request, response, next);

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
    public String getServletInfo() {
        return getSignature();
    }

    /** dispatcher method */
    protected void dispatch(HttpServletRequest request,
                            HttpServletResponse response,
                            String page) throws
            javax.servlet.ServletException,
            java.io.IOException {
        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }

    public void init(ServletConfig config) throws
            ServletException {
        super.init(config);
    }

    public void destroy() { }

    private String getSignature() {
        return "ServiceToWorker-DispatcherViewController";
    }
}
