package org.hbrs.se1.ws23.uebung2.Test;

import org.hbrs.se1.ws23.uebung2.ConcreteMember;
import org.hbrs.se1.ws23.uebung2.Container;
import org.hbrs.se1.ws23.uebung2.Exceptions.ContainerException;
import org.junit.Test;

import static org.junit.Assert.*;


public class TestUebung2 {

    Container c = new Container();
    @Test
    public void createContainerpositive(){
        Container Test = new Container();
        assertEquals(Test.getClass(),new Container().getClass());
    }

    @Test
    public void addMemberpositive() throws ContainerException {
    int currentsize = c.size();
    c.addMember(new ConcreteMember(1));
    assertEquals(c.size(),currentsize+1);

    }
    @Test
    public void addMembernegative() throws ContainerException {
        int currentsize = c.size();
        c.addMember(new ConcreteMember(1));
        assertNotEquals(c.size(),currentsize);

    }

    @Test
    public void checkSizepositive() throws ContainerException {
        assertEquals(c.size(),0);

    }

    @Test
    public void checkSizenegative() throws ContainerException {
        assertNotEquals(c.size(),1);

    }

    @Test
    public void addMemberThrowpositive() throws ContainerException {
        c.addMember(new ConcreteMember(1));
        assertThrows(ContainerException.class,()->c.addMember(new ConcreteMember(1)));
    }
    @Test
    public void addMemberThrowpositiveString() throws ContainerException {
        c.addMember(new ConcreteMember(1));
        assertThrows("The ID already exists in this Container",ContainerException.class,()->c.addMember(new ConcreteMember(1)));
    }

    @Test
    public void deleteMemberpositive() throws ContainerException {
        c.addMember(new ConcreteMember(1));
        assertEquals(c.deleteMember(1),"1");

    }

    @Test
    public void deleteMemberNegative() throws ContainerException {
        c.addMember(new ConcreteMember(1));
        assertNotEquals(c.deleteMember(1),"2");

    }
    @Test
    public void deleteMemberpositiveString() throws ContainerException {
        c.addMember(new ConcreteMember(1));
        assertEquals("The id 2 doesnt exist",c.deleteMember(2));

    }

    @Test
    public void deleteMembernegativeString() throws ContainerException {
        c.addMember(new ConcreteMember(1));
        assertNotEquals("The id 2 doesnt exist",c.deleteMember(1));

    }

  
}
