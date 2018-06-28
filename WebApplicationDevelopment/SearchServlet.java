public class SearchServlet extends HttpServlet{
    private int counter;
    private String message;
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throw ServletException, IOException {
            ArrayList<Passenger> list = new ArrayList<Passenger>();
            request.setAttribute("result", list);
            String path = "Search.jsp";
            // Section 2.d starts here
            // Setting data in request Scope
            if (list.size() <= 0){
                path = "Error.jsp";
            } else if (list.size() > 100) {
                int pagination = list.size() / 100;
                request.setAttribute("pagination", pagination);  
            }
            RequestDispatcher rd = request.getRequestDispatcher(path);
            rd.forward(req, res);
            // Section 2.d ends here
        }
}