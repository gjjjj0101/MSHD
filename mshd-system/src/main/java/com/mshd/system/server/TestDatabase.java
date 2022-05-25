package com.mshd.system.server;

import com.mshd.system.domain.Code;
import com.mshd.system.repository.CodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestDatabase {
    private final CodeRepository codeRepository;

    public Code test(){
        Code code = new Code();
        code.setName("dizhen");
        code.setPlace("beijing");
        return codeRepository.save(code);
    }
}
