package org.hbrs.se1.ws23.uebung2;

import org.hbrs.se1.ws23.uebung2.Exceptions.ContainerException;

import java.util.ArrayList;

public class Container {

    private ArrayList<Member> Members;

    public Container() {
        Members = new ArrayList<>();
    }

    public void addMember(ConcreteMember member) throws ContainerException {


        for (int i = 0; i < Members.size(); i++) {

            Member tmp = Members.get(i);
            if (member.getID() == Members.get(i).getID())
                throw new ContainerException("The id "+member.getID()+" already exists");


        }
        Members.add(member);
    }

    public String deleteMember(int id){

        for (int i = 0; i < Members.size(); i++) {

            Member tmp = Members.get(i);
            if (id == Members.get(i).getID()){
                Members.remove(i);
                return String.valueOf(id);
            }


        }
        return "The id "+id+" doenst exist";


    }

    public void dump(){

        Members.forEach(n -> System.out.println(n.toString()));

    }

    public int size(){

        return Members.size();

    }






}


