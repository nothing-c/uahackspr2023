import random as R
import cgi
import cgitb;cgitb.enable()
print("Content-Type: text/html");print()#headers
print("<html>")
#print("<html><TITLE>CGI script output</TITLE>")
#print("<H1>This is my first CGI script</H1>")
#cgi.print_environ()
#print("Hello, world!</html>")
print("</html>")
class jpg:
    def __init__(self,t,i,n,l):
        self.tier=t;self.id=i;self.name=n;self.link=l #link to download pic
TL=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4]
junk=[jpg(0,0,"f00"),jpg(0,1,"bar")]
green=[jpg(1,2,"boo")]
cons=[jpg(2,3,"baz")]
nat=[jpg(3,4,"blah")]
eco=[jpg(4,5,"bloo")]
J=[junk,green,cons,nat,eco]
def roll():
    x=R.randint(0,99);y=R.randint(0,len(J[TL[x]])-1);return J[TL[x]][y]
