# -*- coding: utf-8 -*-
"""
Created on Wed Oct 20 13:05:59 2021

@author: matst260
"""
import csv  # csv is imported
import json #json is imported
import matplotlib.pyplot as plt  # chart is imported
filename = 'crime.csv' #csv is imported
filename1 = 'Final.json' #json is imported


cont = True
while cont:
	pick = input("#1: Choose File Name: , #2: Create Crime Report, #3: Get Beat Info, #4: Get Info for Bar Chart, #5: Quit Program ")
	if pick == '1':  # user is prompted to enter a file name if chosen
	       filename = input("Please enter your file name: ")

	elif pick == '2':
		with open(filename) as file: #This command opens the file and allows it to be used in the code
			data_from_file = csv.reader(file) #A Python object to link to the file is created
			header_row = next(data_from_file) #This command reads a line of data from the file
			ucr_ncic_code = [0,0,0,0,0,0,0,0,0] #ucr_ncic_code is created to provide nine spots which is what is needed
			for row in data_from_file: #takes the row needed from data file 
				crime = int(row[6])
				if crime in range (0,999): #takes crime in this first range
					ucr_ncic_code[0] = ucr_ncic_code[0] +1 #first row for ucr_ncic_code is made then 1 is added
				elif crime in range (1000,1999): #takes crime in second range
					ucr_ncic_code[1] = ucr_ncic_code[1] +1 #second row for ucr_ncic_code is made then 1 is added		
				elif crime in range (2000,2999): #takes crime in third range
					ucr_ncic_code[2] = ucr_ncic_code[2] +1 #third row for ucr_ncic_code is made then 1 is added
				elif crime in range (3000,3999): #takes crime in fourth range
					ucr_ncic_code[3] = ucr_ncic_code[3] +1 #fourth row for ucr_ncic_code is made then 1 is added
				elif crime in range (4000,4999): #takes crime in fifth range
					ucr_ncic_code[4] = ucr_ncic_code[4] +1 #fifth row for ucr_ncic_code is made then 1 is added
				elif crime in range (5000,5999): #takes crime in sixth range
					ucr_ncic_code[5] = ucr_ncic_code[5] +1 #sixth row for ucr_ncic_code is made then 1 is added
				elif crime in range (6000,6999): #takes crime in seventh range
					ucr_ncic_code[6] = ucr_ncic_code[6] +1 #seventh row for ucr_ncic_code is made then 1 is added
				elif crime in range (7000,7999): #takes crime in eighth range
					ucr_ncic_code[7] = ucr_ncic_code[7] +1 #eighth row for ucr_ncic_code is made then 1 is added
				elif crime in range (8000,8999): #takes crime in ninth range
					ucr_ncic_code[8] = ucr_ncic_code[8] +1 #ninth row for ucr_ncic_code is made then 1 is added
			print(ucr_ncic_code) #overall ucr_ncic_code is printed
		with open(filename) as file:
			data_from_file = csv.reader(file)
			header_row = next(data_from_file)
			district_count = [0,0,0,0,0,0]
			
			
			for row in data_from_file:
				district = (row[2])
				if district.strip() == '1': #takes crime in this first range
					district_count[0] = district_count[0] +1 #first row for ucr_ncic_code is made then 1 is added
				elif district.strip() == '2': #takes crime in second range
					district_count[1] = district_count[1] +1 #second row for ucr_ncic_code is made then 1 is added		
				elif district.strip() == '3': #takes crime in third range
					district_count[2] = district_count[2] +1 #third row for ucr_ncic_code is made then 1 is added
				elif district.strip() == '4': #takes crime in fourth range
					district_count[3] = district_count[3] +1 #fourth row for ucr_ncic_code is made then 1 is added
				elif district.strip() == '5': #takes crime in fifth range
					district_count[4] = district_count[4] +1 #fifth row for ucr_ncic_code is made then 1 is added
				elif district.strip() == '6': #takes crime in sixth range
					district_count[5] = district_count[5] +1 #sixth row for ucr_ncic_code is made then 1 is added
				
			print(district_count)
		with open(filename) as file:
			data_from_file = csv.reader(file)
			header_row = next(data_from_file)
			beat_count = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
			for row in data_from_file: #takes the row needed from data file 
				beat = (row[3])
				if beat.strip() == '1A': #takes beat strip in this first range and then so on down the list
					beat_count[0] = beat_count[0] +1 #first row for beat_count is made then 1 is added and so on down the list
				elif beat.strip() == '1B': 
					beat_count[1] = beat_count[1] +1
				elif beat.strip() == '1C':
					beat_count[2] = beat_count[2] +1
				elif beat.strip() == '2A':
					beat_count[3] = beat_count[3] +1
				elif beat.strip() == '2B':
					beat_count[4] = beat_count[4] +1
				elif beat.strip() == '2C':
					beat_count[5] = beat_count[5] +1 
				elif beat.strip() == '3A':
					beat_count[6] = beat_count[6] +1 
				elif beat.strip() == '3B':
					beat_count[7] = beat_count[7] +1 
				elif beat.strip() == '3C':
					beat_count[8] = beat_count[8] +1
				elif beat.strip() == '3M':
					beat_count[9] = beat_count[9] +1
				elif beat.strip() == '4A':
					beat_count[10] = beat_count[10] +1
				elif beat.strip() == '4B':
					beat_count[11] = beat_count[11] +1
				elif beat.strip() == '4C':
					beat_count[12] = beat_count[12] +1
				elif beat.strip() == '5A':
					beat_count[13] = beat_count[13] +1
				elif beat.strip() == '5B':
					beat_count[14] = beat_count[14] +1
				elif beat.strip() == '5C':
					beat_count[15] = beat_count[15] +1
				elif beat.strip() == '6A':
					beat_count[16] = beat_count[16] +1
				elif beat.strip() == '6B':
					beat_count[17] = beat_count[17] +1
				elif beat.strip() == '6C':
					beat_count[18] = beat_count[18] +1
				
			print(beat_count) #overall ucr_ncic_code is printed
			dict1 =[ucr_ncic_code, district_count, beat_count]
			with open (filename1, 'w') as file_object:
				json.dump(dict1, file_object)
	
	elif pick == '3': #beat info is gathered if available
		beat = input('enter beat')
		with open(filename) as file: #This command opens the file and allows it to be used in the code
			data_from_file = csv.reader(file) #A Python object to link to the file is created
			header_row = next(data_from_file) #This command reads a line of data from the file
			for row in data_from_file: #takes the row needed from data file 
				beat_from_file = row[3].strip()
				if beat_from_file == beat:
					crime_from_file = row[5]
					print(crime_from_file)
					#You need ot fix this so it doesn't print beat but prints the crime description
					
	elif pick == '4': #info for bar chart is gathered
		print("5 NCIC Numbers will be chosen: ")
		num1 = input('#1: ')
		num2 = input('#2: ')
		num3 = input('#3: ')
		num4 = input('#4: ')
		num5 = input('#5: ')
		
		
		title1 = input('Title: ')
		
		fig = plt.figure()
		ax = fig.add_axes([0,0,1,1])
		nums = ['num1', 'num2', 'num3', 'num4', 'num5']
		codes = [num1,num2,num3,num4,num5]
		ax.bar(nums,codes)
		plt.title = print(title1)
		plt.show()
		#Count the crimes and then create the bar chart
		
	   
			   


	elif pick == '5':
			cont = False #program is closed if 5 is selected

