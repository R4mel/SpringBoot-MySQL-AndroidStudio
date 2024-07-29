package me.ramel.member.repository;

import me.ramel.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long>
{

}