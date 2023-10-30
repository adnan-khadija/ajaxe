package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import ma.school.beans.Machine;
import ma.school.service.MachineService;
import ma.school.beans.Marque;
import ma.school.service.MarqueService;

public final class graphe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div style=\"width: 80%; margin: 0 auto;\">\n");
      out.write("        <canvas id=\"machinesByBrandChart\"></canvas>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        // Récupérer les données depuis la base de données (Java)\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("\n");
      out.write("        // Créer le graphique\n");
      out.write("        var data = {\n");
      out.write("            labels: [");
 for (int i = 0; i < labels.size(); i++) { 
      out.write("\n");
      out.write("                '");
      out.print( labels.get(i) );
      out.write('\'');
 if (i < labels.size() - 1) { 
      out.write(',');
 } 
      out.write("\n");
      out.write("            ");
 } 
      out.write("],\n");
      out.write("            datasets: [{\n");
      out.write("                label: 'Nombre de Machines par Marque',\n");
      out.write("                data: [");
 for (int i = 0; i < machineCounts.size(); i++) { 
      out.write("\n");
      out.write("                    ");
      out.print( machineCounts.get(i) );
 if (i < machineCounts.size() - 1) { 
      out.write(',');
 } 
      out.write("\n");
      out.write("                ");
 } 
      out.write("],\n");
      out.write("                backgroundColor: [\n");
      out.write("                    'rgba(255, 99, 132, 0.2)',\n");
      out.write("                    'rgba(54, 162, 235, 0.2)',\n");
      out.write("                    'rgba(255, 206, 86, 0.2)',\n");
      out.write("                    'rgba(75, 192, 192, 0.2)'\n");
      out.write("                ],\n");
      out.write("                borderColor: [\n");
      out.write("                    'rgba(255, 99, 132, 1)',\n");
      out.write("                    'rgba(54, 162, 235, 1)',\n");
      out.write("                    'rgba(255, 206, 86, 1)',\n");
      out.write("                    'rgba(75, 192, 192, 1)'\n");
      out.write("                ],\n");
      out.write("                borderWidth: 1\n");
      out.write("            }]\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        var ctx = document.getElementById('machinesByBrandChart').getContext('2d');\n");
      out.write("        var chart = new Chart(ctx, {\n");
      out.write("            type: 'bar',\n");
      out.write("            data: data,\n");
      out.write("            options: {\n");
      out.write("                scales: {\n");
      out.write("                    y: {\n");
      out.write("                        beginAtZero: true\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
