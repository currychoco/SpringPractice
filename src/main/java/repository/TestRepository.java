package repository;

import entity.TestUser;

import java.util.*;
import java.util.stream.Collectors;

public class TestRepository {

    private final Map<Integer, TestUser> repository = new HashMap<>();

    private Integer sequence = 1;

    public TestUser save(TestUser testUser){

        final int seq = sequence++;

        TestUser user = new TestUser(seq, testUser.getName(), testUser.getBirth(), testUser.getGender());
        repository.put(seq, user);
        return user;
    }

    public TestUser findById(int id){
        return repository.get(id);
    }

    public List<TestUser> findAll(){
        return new ArrayList<>(repository.values());
    }

    public List<TestUser> findByName(String name){

        return repository.values().stream()
                .filter(n -> n.getName().equals(name))
                .collect(Collectors.toList());

        /*
        List<TestUser> userList = new ArrayList<>();
        for(Map.Entry<Integer, TestUser> user : repository.entrySet()){
            TestUser temp = user.getValue();
            if(name.equals(temp.getName())){
                userList.add(temp);
            }
        }
        return userList;
         */
    }

    public void deleteById(int id){
        repository.remove(id);
    }

}
