import random as R
import cgi
import cgitb;cgitb.enable()
class jpg:
    def __init__(self,t,i,n,l):
        self.tier=t;self.id=i;self.name=n;self.link=l #link to download pic
TL=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4]
TN=["Junk","Green","Conservationist","Naturalist","Ecologist"] #you got a {} tier!
junk=[jpg(0,0,"Can","/img/j1.jpg"),jpg(0,1,"Newspaper","/img/j2.jpg")]
green=[jpg(1,2,"Gardener","/img/g1.jpg")]
cons=[jpg(2,3,"Aristotle","/img/c1.jpg"),jpg(2,7,"Marjorie Stoneman Douglas","/img/c2.jpg")]
nat=[jpg(3,4,"Charles Darwin","/img/n1.jpg"),jpg(3,6,"Henry David Thoreau","/img/n2.jpg")]
eco=[jpg(4,5,"David Attenborough","/img/e1.jpg")]
J=[junk,green,cons,nat,eco]
def roll():
    x=R.randint(0,99);y=R.randint(0,len(J[TL[x]])-1);return J[TL[x]][y]
j=roll()#;f=open("gacha.html","r");l=f.readlines()
print("Content-Type: text/html");print()#headers
print("<html><title>Gacha!</title>")
print(""" <head>
    <title>Title of the document</title>
    <style>
      .parent {
        position: relative;
        top: 0;
        left: 0;
      }
      .green {
        position: relative;
        top: 0;
        left: 0;
        height: 720px;
        width: 400px;
        border-radius: 0px;
      }
      .beige {
        position: absolute;
        top: 0;
        left: 410px;
        height: 720px;
        width: 1050px;
        border-radius: 0px;
      }
      .button1 {
        position: absolute;
        top: 200px;
        left: 20px;
        height: 70px;
        width: 360px;
        border-radius: 10px;
      }

      .button1 {
        position: absolute;
        top: 240px;
        left: 20px;
        height: 100px;
        width: 360px;
        border-radius: 10px;
      }

      .button2 {
        position: absolute;
        top: 360px;
        left: 20px;
        height: 100px;
        width: 360px;
        border-radius: 10px;
      }

      .button3 {
        position: absolute;
        top: 480px;
        left: 20px;
        height: 100px;
        width: 360px;
        border-radius: 10px;
      }

      .button4 {
        position: absolute;
        top: 600px;
        left: 20px;
        height: 100px;
        width: 360px;
        border-radius: 0px;
      }
.roll { position: absolute; top: 10px; left: 500px; width: 800px; }

    </style>
  </head>
  <body>
    <div class="parent">
      <img class="green" src="/img/green.png" />
      <img class="beige" src="/img/beige.png" />""")
print(f"<div class=\"roll\"><h1>{TN[j.tier]}-Tier</h1>\n<h2>{j.name}</h2> <h3>#{j.id}</h3><img class=\"fit-picture\" src=\"{j.link}\">\n</div>")
print("""
      <a href="/cgi-bin/gacha.py"><img class="button1" src="/img/image_upload.png" /><a>
      <a href="../Profile.html"><img class="button2" src="/img/Profile.png" /><a>
      <a href="/cgi-bin/imgup.py"><img class="button3" src="/img/image_verification.png" /><a>
      <a href=""><img class="button4" src="/img/gacha_wheel.png" /><a>
    </div>
  </body>""")

print("</html>")

