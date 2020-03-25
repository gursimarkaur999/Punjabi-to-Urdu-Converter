for r in range(1,8):
    for c in range(1,78):
        """
        G
        """
        if (r==1 and c>1 and c<5) or (r==7 and c>1 and c<5) or (c==1 and r>1 and r<7) or (r==4 and c>2 and c<=5) or (c==5 and (r==2 or r==5 or r==6)):
            print("*",end="")
        #U
        elif((c==7 or c==11) and r<7) or (r==7 and c>7 and c<11):
            print("*",end="")
        #R
        elif (c==13) or (c>13 and c<17 and (r==1 or r==4)) or (r>1 and r<4 and c==17) or (c==14 and r==5) or (r==6 and c==16) or (r==7 and c==17):
            print("*",end="")
       #S
        elif((r==1 or r==4 or r==7) and c>19 and c<23) or (c==19 and (r>1 and r<4)) or (c==23 and (r>4 and r<7)) or (c==19 and r==6) or (c==23 and r==2):
            print("*",end="")
        #I
        elif(c==27 and r>1 and r<7) or ((r==1 or r==7) and c>25 and c<29):
            print("*",end="")
      #M
        elif((c==31) or (c==35) or (r==2 and (c==32 or c==34)) or (c==33 and r>2 and r<5)):
            print("*", end="")
     #A
        elif(r==1 and (c>37 and c<41)) or (r>1 and (c==37))or (r>1 and c==41) or (r==4 and (c>37 and c<41)):
            print("*",end="")
    #R
        elif (c==43) or (c>43 and c<47 and (r==1 or r==4)) or (r>1 and r<4 and c==47) or (c==45 and r==5) or (r==6 and c==46) or (r==7 and c==47):
            print("*", end="")
      #K
        elif((c==55) or (c==56 and r==4) or (c==57) and (r==3 or r==5) or ((r==2 or r==6) and c==58) or ((r==1 or r==7) and c==59)):
            print("*", end="")
        #A
        elif ((r==1 and (c>61 and c<65)) or (r>1 and (c==61))or (r>1 and c==65) or (r==4 and (c>61 and c<65))):
            print("*", end="")
       #U
        elif((c==67 or c==71) and r<7) or (r==7 and c>67 and c<71):
            print("*", end="")
        #R
        elif (c==73) or (c>73 and c<77 and (r==1 or r==4)) or (r>1 and r<4 and c==77) or (c==75 and r==5) or (r==6 and c==76) or (r==7 and c==77):
            print("*", end="")
        #Space between characters 
        else:
            print(end =" ")
    print()
    
