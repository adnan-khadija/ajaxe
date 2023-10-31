<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ma.school.beans.Machine"%>
<%@page import="ma.school.service.MachineService"%>
<%@page import="ma.school.beans.Marque"%>
<%@page import="ma.school.service.MarqueService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="style/css2.css" rel="stylesheet" type="text/css"/>
    <link href="style/css.css" rel="stylesheet" type="text/css"/>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
    <%@include file="template/header.jsp" %>
        <%@include file="template/menu.jsp" %>
    <div style="width: 60%; margin: 0 auto;">
        <canvas id="machinesByBrandChart"></canvas>
    </div>

    <script>
        // Récupérer les données depuis la base de données (Java)
        <%
            MachineService machineService = new MachineService();
            MarqueService marqueService = new MarqueService();
            
            // Obtenir la liste des marques
            List<Marque> marques = marqueService.findAll();
            
            // Préparer les données pour le graphique
            List<Integer> machineCounts = new ArrayList<Integer>();
            List<String> labels = new ArrayList<String>();
            
            for (Marque marque : marques) {
                int count = machineService.countMachineByMarque(marque);
                machineCounts.add(count);
                labels.add(marque.getLibelle());
            }
        %>

        // Créer le graphique
        var data = {
            labels: [<% for (int i = 0; i < labels.size(); i++) { %>
                '<%= labels.get(i) %>'<% if (i < labels.size() - 1) { %>,<% } %>
            <% } %>],
            datasets: [{
                label: 'Nombre de Machines par Marque',
                data: [<% for (int i = 0; i < machineCounts.size(); i++) { %>
                    <%= machineCounts.get(i) %><% if (i < machineCounts.size() - 1) { %>,<% } %>
                <% } %>],
                backgroundColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)'
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)'
                ],
                borderWidth: 1
            }]
        };

        var ctx = document.getElementById('machinesByBrandChart').getContext('2d');
        var chart = new Chart(ctx, {
            type: 'bar',
            data: data,
            options: {
                scales: {
                    y: {
                        beginAtZero: true
                    }
                }
            }
        });
    </script>
</body>
</html>
