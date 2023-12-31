class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        
        l, r = 0, len(people) - 1
        result = 0

        while(l < r):
            if(people[l] + people[r] <= limit):
                result += 1
                r -=1
                l += 1
            else:
                result += 1
                r -=1

        if(l == r):
            result += 1  
        return result
                

