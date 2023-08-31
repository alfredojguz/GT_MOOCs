def letterCombinations(digits):
    letter_dict = {"2": "abc", "3" :"def",
    "4" : "ghi", "5" : "jkl", "6" : "mno", "7" : "pqrs", "8" : "tuv",
    "9" : "wxyz"}

    ans = []
    digits = [*digits]
    def backtrack(index, curr): # start single base case
        if len(curr) == len(digits):
            ans.append(curr[:])
            return
        
        # start recursive case
        for character in letter_dict[digits[index]]:
            backtrack(index + 1, curr + character) 
        # for num in digits:
        #     if num not in curr:
        #         curr.append(num)
        #         backtrack(curr)
        #         curr.pop()
    
    if digits: # check that digits isn't empty: question requests array
        backtrack(0, "")

    return ans 
    

# Test Cases
letterCombinations("The answer for '23' is {letterCombinations('23')}")
letterCombinations("The anwer for '' is {letterCombinations("")}")
print("The answer for {letterCombinations('2')")
            
