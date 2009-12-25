package com.epam.leasecar.test;

import junit.framework.TestCase;
import com.epam.leasecar.model.Man;
public class ManTest extends TestCase {

	public ManTest(String name) {
		super(name);
	}
	Man man = new Man();
	public void testGetId() {
		assertTrue(this.man.getId() == null);
		//assertNotNull(this.man.getId());
	}

	public void testSetId() {
		
	}

	public void testGetSurname() {
		assertTrue(man.getSurname() == "");
	}

	

	public void testGetName() {
		assertTrue(man.getName() == "");
	}

	
	public void testGetPatronymic() {
		assertTrue(man.getPatronymic() == "");
	}

	
	public void testGetLogin() {
		assertTrue(man.getLogin() == "");
	}

	
	public void testGetPassword() {
		assertTrue(man.getPassword() == "");
	}

	
	public void testGetRole() {
		assertTrue(man.getRole() == 0 );
	}

	
	
}
