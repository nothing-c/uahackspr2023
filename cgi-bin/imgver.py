import cgi
import cgitb;cgitb.enable()
import os
f=os.listdir("c:/Users/lightning/Documents/program/hackathon-spring-23/verimg")[0]
print("Content-Type: text/html");print()#headers
print("""<html>
  <head>
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
print(f"<div class=\"roll\"><img class=\"fit-picture\" src=\"../verimg/{f}\"></div>")
print("""
<a href="/cgi-bin/gacha.py"><img class="button1" src="/img/image_upload.png" /><a>
      <a href="Profile.html"><img class="button2" src="/img/Profile.png" /><a>
      <a href="/cgi-bin/imgver.py"><img class="button3" src="/img/image_verification.png" /><a>
      <a href=""><img class="button4" src="/img/gacha_wheel.png" /><a>
    </div>
  </body>
</html>
""")

