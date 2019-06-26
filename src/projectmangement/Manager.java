/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmangement;
import java.util.ArrayList;
import java.util.Date;

public class Manager extends Employee {
        ArrayList<Project> projects =new ArrayList<Project>();
	public Manager(String name, Date dob, String email, String phone) {
		super(name, dob, email, phone);
		
	}
        public void addProject(Project p)
        {
            projects.add(p);
        }
        public void startProject(Project P)
        {
            
        }
}
