package vn.codegym.repository;

import vn.codegym.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class CustomerRepositoryImpl implements CustomerRepository{
    @PersistenceContext
    private EntityManager entityManager ;
    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = entityManager.createQuery("select c from Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(int id) {
        TypedQuery<Customer> query = entityManager.createQuery("select c from Customer c where c.id =:id",Customer.class)
                .setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void save(Customer customer) {
            entityManager.persist(customer);
    }

    @Override
    public void remove(Customer customer) {
        entityManager.remove(entityManager.merge(customer));
    }

    @Override
    public void update(Customer customer) {
        entityManager.merge(customer);
    }

    @Override
    public List<Customer> searchByName(String input) {
        TypedQuery<Customer> query = entityManager.createQuery("select c from Customer c where c.firstName like:input",Customer.class)
                .setParameter("input","%"+input+"%");
        return query.getResultList();
    }
}
