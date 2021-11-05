package codegym.repository;

import codegym.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class BlogRepositoryImpl implements BlogRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Blog> showAll() {
        TypedQuery<Blog> query = entityManager.createQuery("select b from Blog b",Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(int id) {
        TypedQuery<Blog> query = entityManager.createQuery("select b from Blog b where b.id =:id",Blog.class)
                .setParameter("id",id);
        return query.getSingleResult();
    }

    @Override
    public void save(Blog blog) {
        entityManager.persist(blog);
    }

    @Override
    public void update(Blog blog) {
        entityManager.merge(blog);
    }

    @Override
    public void delete(Blog blog) {
        entityManager.remove(entityManager.merge(blog));
    }
}
