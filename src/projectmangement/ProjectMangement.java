/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmangement;

import java.util.Date;

/**
 *
 * @author hp
 */
public class ProjectMangement {

  
     
    public static void main(String[] args) throws InterruptedException {
     // In in main we only create manager, then we add project by this manger and in classes we split praject to tasks and subtasks
       Manager mangerExaltProjects= (Manager) Factory.getEmp("maneger", "Sami", new Date(), "Sami@gmail.com", "0599541235");
        mangerExaltProjects.addProject(new Project("1","Nokia_project" , "Casper")); //This will aotumatically make tasks in classes
        
        
    }
    
}
