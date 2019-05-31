package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.DefinitionEntity;

@Repository
public class DemoRepositoryImpl extends BaseRepository implements DemoRepository {

	@Override
	public List<DefinitionEntity> getDefinitionEntity() {
		CriteriaBuilder criteriaBuilder = getSession().getCriteriaBuilder();
        CriteriaQuery<DefinitionEntity> criteriaQuery = criteriaBuilder.createQuery(DefinitionEntity.class);
        Root<DefinitionEntity> root = criteriaQuery.from(DefinitionEntity.class);
        List<Predicate> predicates = new ArrayList<Predicate>();
        predicates.add(criteriaBuilder.equal(root.get("keyword"), "local claim"));
        predicates.add(criteriaBuilder.equal(root.get("category"), "BDM"));
        criteriaQuery.select(root).where(predicates.toArray(new Predicate[]{}));
        return getSession().createQuery(criteriaQuery).getResultList();
	}

}
