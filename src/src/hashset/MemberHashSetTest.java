package hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(201,"�̼���");
		Member memberKim = new Member(301,"������");
		Member memberShin = new Member(401,"�Ż��Ӵ�");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		
		memberHashSet.showAll();
		
		Member memberLee2 = new Member(201,"�̸���");
		memberHashSet.addMember(memberLee2);
		
		memberHashSet.showAll();
	}

}
