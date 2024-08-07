package com.ec.test.procedures.repositories;

import com.ec.test.entities.procedures.AccountEntity;
import com.ec.test.procedures.config.IQueryDslBaseRepository;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for account resources
 *
 * @author daleonv
 * @version 1.0
 */
public interface IAccountRepository extends IQueryDslBaseRepository<AccountEntity> {

    /**
     * Return account list information
     *
     * @return List<AccountEntity>
     */
    List<AccountEntity> findAccountList();

    /**
     * Return account information by accountId
     *
     * @return Optional<AccountEntity>
     */
    Optional<AccountEntity> findById(Long accountId);

}
