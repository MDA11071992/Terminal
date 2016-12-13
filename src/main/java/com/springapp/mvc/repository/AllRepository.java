package com.springapp.mvc.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class AllRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public List listAddonpc() {
        return this.sessionFactory.getCurrentSession().createQuery("from addonpc").list();
    }

    public List listAddonps4() {
        return this.sessionFactory.getCurrentSession().createQuery("from addonps4").list();
    }

    public List listAddonx() {
        return this.sessionFactory.getCurrentSession().createQuery("from addonx").list();
    }

    public List listAvir() { return this.sessionFactory.getCurrentSession().createQuery("from avir").list(); }

    public List listDigverpcg() { return this.sessionFactory.getCurrentSession().createQuery("from digverpcg").list(); }

    public List listOther() { return this.sessionFactory.getCurrentSession().createQuery("from other").list(); }

    public List listDigverps4g() { return this.sessionFactory.getCurrentSession().createQuery("from digverps4g").list(); }

    public List listDigverxg() { return this.sessionFactory.getCurrentSession().createQuery("from digverxg").list(); }

    public List listGcpcgame() { return this.sessionFactory.getCurrentSession().createQuery("from gcpcgame").list(); }

    public List listGcps4game() { return this.sessionFactory.getCurrentSession().createQuery("from gcps4game").list(); }

    public List listGcxgame() { return this.sessionFactory.getCurrentSession().createQuery("from gcxgame").list(); }

    public List listItunes(){
        return this.sessionFactory.getCurrentSession().createQuery("from itunes").list();
    }

    public List listOffice(){
        return this.sessionFactory.getCurrentSession().createQuery("from office").list();
    }

    public List listOncin(){
        return this.sessionFactory.getCurrentSession().createQuery("from oncin").list();
    }

    public List listRefilps(){
        return this.sessionFactory.getCurrentSession().createQuery("from refilps").list();
    }

    public List listRefilx(){
        return this.sessionFactory.getCurrentSession().createQuery("from refilx").list();
    }

    public List listSabsps(){
        return this.sessionFactory.getCurrentSession().createQuery("from sabsps").list();
    }

    public List listSabsx(){
        return this.sessionFactory.getCurrentSession().createQuery("from sabsx").list();
    }

    public List listTurnsol(){
        return this.sessionFactory.getCurrentSession().createQuery("from turnsol").list();
    }

}

