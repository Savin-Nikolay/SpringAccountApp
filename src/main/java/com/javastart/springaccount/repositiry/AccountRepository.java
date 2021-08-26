package com.javastart.springaccount.repositiry;

import com.javastart.springaccount.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
