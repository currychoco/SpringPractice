package service;

import entity.TestUser;
import lombok.RequiredArgsConstructor;
import repository.TestRepository;

import java.util.List;

@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public TestUser save(TestUser user){
        return testRepository.save(user);
    }

    public TestUser findById(int id){
        return testRepository.findById(id);
    }

    public List<TestUser> findAll(){
        return testRepository.findAll();
    }

    public List<TestUser> findByName(String name){
        return testRepository.findByName(name);
    }

    public void deleteById(int id){
        testRepository.deleteById(id);
    }
}
