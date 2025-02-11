package org.gym.repositories;

import org.gym.models.Membership;
import org.gym.repositories.rowmappers.MembershipRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MembershipRepository {
    private NamedParameterJdbcTemplate jdbcTemplate;
    public MembershipRepository( NamedParameterJdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Membership> geAllMemberships(){
        String query = "select id,name,price, duration,daysPerWeek from membership";
        List<Membership> memberships = jdbcTemplate.query(query, new MembershipRowMapper());
        return memberships;
    }
    public void saveMembership(Membership membership){
        String query = "insert into membership(name, price, duration, daysPerWeek) values(:name,:price,:duration,:daysPerWeek)";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", membership.getName());
        params.addValue("price", membership.getPrice());
        params.addValue("duration", membership.getDuration());
        params.addValue("daysPerWeek", membership.getDaysPerWeek());
        jdbcTemplate.update(query, params);
    }


}
