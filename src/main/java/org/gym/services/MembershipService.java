package org.gym.services;

import org.gym.models.Membership;
import org.gym.repositories.MembershipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipService {
    private MembershipRepository membershipRepository;
    public MembershipService(MembershipRepository membershipRepository){
        this.membershipRepository = membershipRepository;
    }
    public List<Membership> getAllMemberships(){
        return membershipRepository.geAllMemberships();
    }
    public void saveMembership(Membership membership){
        membershipRepository.saveMembership(membership);
    };


}
