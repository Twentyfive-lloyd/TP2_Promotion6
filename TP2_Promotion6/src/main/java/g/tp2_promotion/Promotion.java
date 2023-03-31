/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.tp2_promotion;

import java.util.ArrayList;

/**
 *
 * @author Kaely
 */
public class Promotion {
    
    private ArrayList<Etudiant> studentList;
    
    public Promotion()
    {
        studentList = new ArrayList<>();
    }
    
    public int newId()
    {
        int studentCount = 0;
        studentCount = studentList.size();
        if (studentCount == 0)
        {
            return 0;
        }
       
            int largeId = studentList.get(0).getIdetudiant();
            int id = 0;
            for (int i = 0; i < studentCount ; i ++)
            {
               id = studentList.get(i).getIdetudiant();
            }
        if (id > largeId)
        {
            largeId = id;
        }
         return largeId + 1;
    }
    
    public int ajoutEtudiant(String nom, String prenom, int age)
    {
        int id = newId();
        studentList.add(new Etudiant(id, nom, prenom, age));
        return id;
    }
   
    public void afficheEtudiant()
    {
        for (Etudiant etudiant : studentList)
        {
            System.out.println(etudiant.getIdetudiant() +1 +" "+etudiant.getNom()+" "+etudiant.getAge());
        }
        
    }
    
    public void swap (int i, int j)
    {
        Etudiant tmp = studentList.get(i);
        studentList.set(i,studentList.get(j));
        studentList.set(j, tmp);
        
    }
    
    public void insertionsort()
    {
        int n = studentList.size();
       int smallindex ;
    for (int i = 0; i < n; i++)
    {
        smallindex = i;
        Etudiant min = studentList.get(i);
        for (int j = i+1; j < n; j++)
        {
            Etudiant sj = studentList.get(j);
            if(sj.getNom().compareTo(min.getNom()) <0)
            {
                smallindex= j;
                min = sj;
            }
        }
         swap (i, smallindex);
    }
   
    }
    
}
