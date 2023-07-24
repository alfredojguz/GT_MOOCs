<<<<<<< Updated upstream
#Recall in the previous problem you counted the number of
#instances of a certain first name in a list of full names.
#You returned a dictionary with the name as the key, and the
#number of times it appeared as the value.
#
#Modify that code such that instead of having a count as the
#value, you instead have a list of the full names that had
#that first name. So, each key in the dictionary would still
#be a first name, but the values would be lists of names.
#Make sure to sort the list of names, too.
#
#Name this new function name_lists.


#Add your function here!
def name_lists(my_list):
    final_dict = {}
    for names in my_list:
        names = names.split(" ")
        print(names)
        if names[0] in final_dict:
                final_dict[names[0]] = n
        else:
                final_dict[names[0]] = names
    return final_dict



<<<<<<< Updated upstream
=======
'''
What name that is used for both genders has the smallest difference in
which gender holds the name most frequently? In case of a tie,
enter any one of the correct answers.
'''
mini = name_list["Isabella"]
name_list = {}
for i in range(len(baby_list)): 
    name = baby_list[i][0]
    ctr = baby_list[i][1]
    gndr = baby_list[i][2]
    if name in name_list.keys() and gndr != name_list[name][1]:
        name_list[name] = [int(name_list[name][0]) -1, gndr, 1]
    else:
        name_list[name] = [1, gndr, 0]
>>>>>>> Stashed changes

#Below are some lines of code that will test your function.
#You can change the value of the variable(s) to test your
#function with different inputs.
#
#If your function works correctly, this will originally
#print (although the order of the keys may vary):
#{'Shelba': 5, 'Maren': 1, 'Nicol': 1, 'David': 2, 'Brenton': 2}
name_list = ["David Joyner", "David Zuber", "Brenton Joyner",
             "Brenton Zuber", "Nicol Barthel", "Shelba Barthel",
             "Shelba Crowley", "Shelba Fernald", "Shelba Odle",
             "Shelba Fry", "Maren Fry"]
print(name_lists(name_list))
=======
>>>>>>> Stashed changes
