#!/bin/bash
# Assignment #9: Linux shell scripting 2
# Rowan Pilon 
# 041049454
# script file user_manager.sh
# November 20th 2023
# Contains a menu to perform various tasks based on user input,

echo "welcome to my menu! here are the following options:"
echo "A: create a user with a password and home directory"
echo "B: delete a user and their home directory"
echo "C: add a user to a supplementary group"
echo "D: change a users' primary group"
echo "E: change a users' shell"
echo "F: change a users' expiry date"
echo "Q: exit the program"
choice='n'


while [[ $choice != 'Q' ]] && [[ $choice != 'q' ]]  # initial while loop that program will stay in
do
	clear
	echo -e "Choice:"
	read choice  # ask for user choice
 	wait   # this is important, it waits for the read to happen and otherwise an infinite loop occurs
	echo "you entered $choice" # returns user choice
	sleep 3 #sleeps for 3 seconds
	if [[ $choice == 'a' ]] || [[ $choice == 'A' ]] # if-elif structure to determine user choice and proper operation to perform
	then 
		echo "enter username"
		read username
		echo "enter password"
		read password
		echo "enter home directory"  # takes three vars and sets them to make a new user/pass/home direct
		read home
		useradd "$username"
		echo $username:$password | sudo chpasswd
		usermod -m -d "$home" "$username"
		echo "done! user "$username" exists at "$home" with password $password" # a success statement
		sleep 3
		continue   # sleeps 3 sec and then returns to the wait statement at the start of the while loop, this is in every if/elif block 
	elif [[ $choice == 'b' ]] || [[ $choice == 'B' ]]
	then
		echo "enter username of account to be deleted"
		read userdelete
		sudo userdel -r "$userdelete"  # takes var and then deletes a user with the var name
		sleep 3
		continue
	elif [[ $choice == 'c' ]] || [[ $choice == 'C' ]]
	then 
		echo "enter username of user to add group to"
		read usergroop
		echo "enter name of group to add to user" # takes vars and then adds the $user to the supplementary group, also creates the group if it doesnt exist
		read groupname
		sudo groupadd "$groupname"
		usermod -a -G "$groupname" "$usergroop"
		sleep 3
		continue
	elif [[ $choice == 'd' ]] || [[ $choice == 'D' ]]
	then 	
		echo "enter username of user youd like to change the igroup of"
		read userigroup
		echo "enter group name" # takes a groupname variable and username variable and sets the usernames primary group to the group var
		read groupnamei
		groupadd "$groupnamei"
		usermod -g "$groupnamei" "$userigroup"
		sleep 3
		continue
	elif [[ $choice == 'e' ]] || [[ $choice == 'E' ]]
	then 
		echo "enter username of user youd like to change shell of"
		read usershell
		echo "enter shell name" # takes a username and shell var, and sets users' shell 
		read shellname
		chsh -s "$shellname" "$usershell"
		sleep 3
		continue
	elif [[ $choice == 'f' ]] || [[ $choice == 'F' ]] 
	then 
		echo "enter username"
		read userexpi
		echo "enter expiry date in YYYY-MM-DD format" #takes a username and date in YYYY-MM-DD format and then sets the users expiry date accordingly
		read expirydate
		sudo chage -E $expirydate "$userexpi"
		sleep 3
		continue
	elif [[ $choice == 'q' ]] || [[ $choice == 'Q' ]]
    then 
	    exit # for the q option, just exits the script

	else 
		echo "that is not a valid input" # for all other inputs, this is displayed
		sleep 3
		continue
	fi

done #end of loop, only accessible from q
