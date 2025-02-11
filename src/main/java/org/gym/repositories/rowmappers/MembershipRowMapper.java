package org.gym.repositories.rowmappers;

import org.gym.models.Membership;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class MembershipRowMapper implements RowMapper<Membership> {

    @Override
    public Membership mapRow(ResultSet rs, int rowNum) throws SQLException {
        Membership membership = new Membership();
        membership.setId(rs.getInt("id"));
        membership.setName(rs.getString("name"));
        membership.setPrice(rs.getInt("price"));
        membership.setDuration(rs.getInt("duration"));
        membership.setDaysPerWeek(rs.getInt("daysPerWeek"));
        return membership;

    }
}
