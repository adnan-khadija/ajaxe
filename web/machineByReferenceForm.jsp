<%@page import="ma.school.beans.Machine"%>
<%@page import="ma.school.service.MachineService"%>
<%@page import="ma.school.beans.Marque"%>
<%@page import="ma.school.service.MarqueService"%>
<%@page import="java.util.Date"%>
<%@page import="ma.school.beans.Etudiant"%>
<%@page import="ma.school.service.EtudiantService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style/css.css" rel="stylesheet" type="text/css"/>
        <link href="style/css2.css" rel="stylesheet" type="text/css"/>
        <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="script/machineByMarque.js" type="text/javascript"></script>
         <script src="script/machineByReference.js" type="text/javascript"></script>
         <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
    </head>
    <body>
        <%@include file="template/header.jsp" %>
        <%@include file="template/menu.jsp" %>
        <div class="content">
            <form method="GET" action="MachineByReferenceController">
                                <fieldset>
                                    <table border="0">
                                    <legend>Selectionner Référence </legend>
                                     <td>Référence</td>
                            <td>
                                
                                <select id="reference" name="Reference">
                                    <option value="0" style="width: 200px" >Choisir un référence </option>
                                     <%
                                       MachineService mas = new MachineService();
                                        for (Machine ma: mas.findAll()) {
                                    %>
                                    <option value="<%=ma.getId()%>"><%=ma.getReference()%></option>
                                    <%}%>
                                </select>
                            </td>
                        </tr>
                                </table>
                                </fieldset>
                                   
            </form>
           
            <fieldset>
                <legend>Liste des Machines</legend>

                <table border="1" class="tab">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Reference </th>
                            <th>Prix</th>
                            <th class="large-colonne"> Date d'achat </th>
                            <th>Marque</th>
                            <th>Supprimer</th>
                            <th>Modifier</th>
                        </tr>
                    </thead>
                    <tbody  id='body'>
                         <%
                MachineService mms = new MachineService();
                for(Machine s : mms.findAll()){
            %>
            <tr>
                        <td><%= s.getId() %></td>
                        <td><%= s.getReference()%></td>
                        <td><%= s.getPrix() %></td>
                        <td><%= s.getDateAchat() %></td>
                        <td><%= s.getMarque().getLibelle() %></td>
                        <td><a class="bndelete" href="MachineController?op=delete&id=<%= s.getId() %>" onclick="confirmDelete(<%= s.getId() %>)">Supprimer</a></td>
                        <td><a class="bnupdate" href="MachineController?op=update&id<%= s.getId() %>">Modifier</a></td>
                        
                    </tr>
                    <% } %>
                    </tbody>
                </table>

            </fieldset>
        </form>            
</body>
</html>
<script>
    function confirmDelete(id) {
        var shouldDelete = confirm("Êtes-vous sûr de vouloir supprimer cet étudiant ?");
        if (shouldDelete) {
            window.location.href = "EtudiantController?op=delete&id=" + id;
        }
    }
</script> 
