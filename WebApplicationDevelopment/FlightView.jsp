<!-- Using JSTL and EL -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- Key codes only. I only write the code for the table -->

<table>
    <thead>
        <tr>
            <th>Flight Id</th>
            <th>Departure</th>
            <th>Departure Date</th>
            <th>Arrival</th>
            <th>Arrival Date</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="f" items="${flist}">
            <tr>
                <td>${f.idFlight}</td>
                <td>${f.departureCity}</td>
                <td><fmt:formatDate value="${f.depature}" pattern="dd-MM-yyyy" /></td>
                <td>${f.arrivalCity}</td>
                <td><fmt:formatDate value="${f.arrival}" pattern="dd-MM-yyyy" /></td>
            </tr>
        </c:forEach>
    </tbody>
</table>