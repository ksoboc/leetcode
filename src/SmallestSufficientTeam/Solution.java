package SmallestSufficientTeam;

import java.util.*;

public class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        int numOfSkills = req_skills.length;
        int numOfPersons = people.size();

        int bit=1;

        Map<String,Integer> skillToBit=new HashMap<>();
        for (String req_skill : req_skills) {
            skillToBit.put(req_skill, bit);
            bit <<= 1;
        }
        int[] personsSkills = new int[numOfPersons];
        for (int i = 0; i < numOfPersons; i++) {
            int skillSet=0;
            for (var skill:people.get(i)) {
                skillSet|=skillToBit.getOrDefault(skill,0);
            }
            personsSkills[i] = skillSet;
        }

        long[] dp = new long[1<<numOfSkills];
        Arrays.fill(dp, (1L<<numOfPersons)-1);
        dp[0]=0L;

        for (int i = 1; i < 1<<numOfSkills; i++) {
            for (int j = 0; j < numOfPersons; j++) {
                int smallerSkillSet = i & ~personsSkills[j];
                long teamMask = dp[smallerSkillSet] | (1L<<j);
                if (smallerSkillSet!=i) {
                    if (Long.bitCount(dp[i])>Long.bitCount(teamMask)) {
                        dp[i]=teamMask;
                    }
                }

            }
        }

        long bits = dp[(1<<numOfSkills)-1];
        int len = Long.bitCount(bits);
        int[] res = new int[len];

        long mask=1;
        int idx=0;
        for (int i = 0; i < numOfPersons; i++) {
            if ((bits & mask) == mask) {
                res[idx]=i;
                ++idx;
            }
            mask<<=1;
        }

        return res;

    }


}
