package com.spring100.database.databasedemo;

import com.spring100.database.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    PersonRowMapper personRowMapper;

    @Autowired
    BeanPropertyRowMapper beanPropertyRowMapper;

    @Autowired
    JdbcTemplate jdbcTemplate;



    public List<Person> findAll() {
       return jdbcTemplate.query("select * from person",
               personRowMapper);
    }


//    public Person findById(int id) {
//        return (Person) jdbcTemplate.queryForObject("select * from person where id=?", new Object[]{id},
//                beanPropertyRowMapper
//               // new BeanPropertyRowMapper<>(Person.class);
//                );
//        public Person findById(int id) {
//            return jdbcTemplate.queryForObject("select * from person where id=?", new Object[]{id},
//                    beanPropertyRowMapper
//                    // new BeanPropertyRowMapper<>(Person.class);
//            );
        public Person findById(int id) {
            return (Person) jdbcTemplate.queryForObject("select * from person where id=?",
                    new Object[]{id},
                    beanPropertyRowMapper);
        }



    // new BeanPropertyRowMapper<>(Person.class));

    public int  deleteById(int id) {
        return jdbcTemplate.update("delete from person where id=?", new Object[]{id});
        //return jdbcTemplate.update("delete from person where id=?, xyz=?", new Object[]{id, xyz});
        // - for multiple
      }  //return value is - how many rows deleted

    public int insert(Person person) {
        return jdbcTemplate.update("insert into person (id, name, location, birth_date) "
                + "values(?,?,?,?)", person.getId(),
                person.getName(),
                person.getLocation(),
                new Timestamp(person.getBirthDate().getTime()));
    }
    public int update(Person person) {
        return jdbcTemplate.update("update person "
                        + "set name = ?, location = ?, birth_date = ? "
                        + "where id = ?",
                new Object[] {
                        person.getName(),
                        person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime()),
                        person.getId(),
                });
    }
}
