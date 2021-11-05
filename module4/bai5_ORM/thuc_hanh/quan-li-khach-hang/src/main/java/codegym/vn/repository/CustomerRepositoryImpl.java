package codegym.vn.repository;

import codegym.vn.model.Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Repository

public class CustomerRepositoryImpl implements CustomerRepository{

    @Override
    public List<Customer> findAll() {
        String queryStr = "SELECT c FROM Customer AS c";
        TypedQuery<Customer> query = ConnectionUtil.entityManager.createQuery(queryStr,Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(int id) {
        String queryStr = "SELECT c FROM Customer as c Where c.id = :id";
        TypedQuery<Customer> query = ConnectionUtil.entityManager.createQuery(queryStr,Customer.class);
        query.setParameter("id",id);
        return query.getSingleResult();
    }

    @Override
    public void save(Customer customer) {
        Session session = null;
        // Transaction là một tiến trình xử lý có xác định điểm đầu và điểm cuối
        Transaction transaction = null;
        try{
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
        }finally {
            if(session != null){
                session.close();
            }
        }
    }

    @Override
    public Customer update(int id, Customer customer) {
        Session session = null;
        Transaction transaction = null;
        try{
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            Customer origin = findById(customer.getId());
            origin.setName(customer.getName());
            origin.setEmail(customer.getEmail());
            origin.setAddress(customer.getAddress());
            session.saveOrUpdate(origin);
            transaction.commit();
            return origin;
        }catch (Exception e){
            e.printStackTrace();
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            if(session != null){
                session.close();
            }
        }
        return null;
    }

    @Override
    public void delete(Customer customer) {

    }
}
