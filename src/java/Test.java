
import java.util.Date;
import ma.school.beans.Etudiant;
import ma.school.beans.Machine;
import ma.school.beans.Marque;
import ma.school.util.HibernateUtil;
import ma.school.service.EtudiantService;
import ma.school.service.MachineService;
import ma.school.service.MarqueService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leblond
 */
public class Test {
    public static void main(String[] args) {
        EtudiantService es = new EtudiantService();
        MachineService ms=new MachineService();
        MarqueService mrs=new MarqueService();
//        es.create(new Etudiant("RAMI", "ALI", "Agadir", new Date(), "homme"));
//        for(Etudiant e : es.findAll())
////            System.out.println(e.getId()+" "+e.getNom());
//        mrs.create(new Marque("DL", "Dell"));
//        ms.create(new Machine("DE", new Date(123,12,3), 30000, mrs.findById(1)));
        for(Machine ma:ms.findByReference("DE")){
            System.out.println(ma); }
        Machine m=ms.findById(1);
        ms.findByMarque(m.getMarque());
    }
}
