package com.skilldistillery.leadersdata.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeadersTest {

	private static EntityManagerFactory emf;

	private EntityManager em;

	@BeforeAll
	static void setUpBefore() throws Exception {
		emf = Persistence.createEntityManagerFactory("WorldLeaders");
	}

	@BeforeEach
	public void setUp() throws Exception {
		em = emf.createEntityManager();
	}

	@AfterEach
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}

	@Test
	void test_customer_mappings_first_name() {
		Leaders cust = em.find(Leaders.class, 1);
		assertEquals("Donald", cust.getFirstName());
	}

	@Test
	void test_customer_mappings_last_name() {
		Leaders cust = em.find(Leaders.class, 1);
		assertEquals("Trump", cust.getLastName());
	}

	@Test
	void test_customer_mappings_gender() {
		Leaders cust = em.find(Leaders.class, 1);
		assertEquals("Male", cust.getGender());
	}

	@Test
	void test_customer_mappings_country() {
		Leaders cust = em.find(Leaders.class, 1);
		assertEquals("United States", cust.getCountry());
	}

	@Test
	void test_customer_mappings_date_of_birth() {
		Leaders cust = em.find(Leaders.class, 1);
		assertEquals("1946-06-14", cust.getDateOfBirth());
	}

	@Test
	void test_customer_mappings_birth_place() {
		Leaders cust = em.find(Leaders.class, 1);
		assertEquals("United States", cust.getBirthPlace());
	}

}
