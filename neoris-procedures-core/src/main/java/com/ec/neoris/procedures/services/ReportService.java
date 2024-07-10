package com.ec.neoris.procedures.services;

import com.ec.neoris.procedures.AccountStatusRequestVo;
import com.ec.neoris.procedures.AccountStatusResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Service for account resources
 *
 * @author daleonv
 * @version 1.0
 */
@Lazy
@Service
@Transactional
public class ReportService implements IReportService {

    @Lazy
    @Autowired
    private ICustomerService customerService;


    /**
     * {@inheritDoc}
     */
    @Override
    public List<AccountStatusResponseVo> findAccountStatus(AccountStatusRequestVo filters) {
        return customerService.findAccountStatus(filters);
    }

}
