4/3/2019

1. download JDK dari oracle website
2.install ke c:\program files\java\jdk..
3.set environment variable point ke c:\program files\java\jdk..\bin
4.javac<nama file>.java
5.java<nama file>

2 kaedah kita guna:-
netbeans dgn notepad

3. create class
4.create obj , using new operator
satu file, satu class
kena ada main() -entry point utk run sesuatu pogram
-variable -pecah kepada 2 bhg 
1.primitif (ada 8 -int,double,float, byte,boolean)-semua start huruf kecil
2.bkn primitive (class-based)-Book b1

Book b1; //non primitive
int umur; //primitive



Git Command
--------------
git clone<url>
cth: git clone https://github.com/mawaddah2009/moh-java.git 
(slps step clone pergi ke folder mohjava ....cut 
copy dari repo di git hub
git add*
git commit - m "first commitkomenla apa2 kat sini"
git push

==============


4. method yg diguna

-contructor
-overloading- function yg nama sama, tp parameter yg tak sama
-over riding - ada kaitan dgn inheritance -child akan overide parent
-final - method yg tak boleh di overide 
final var (constant) best practice letak hrf besar cth: float PI = 3.14;

static( own by class, shared by all obj) kita dpt dr kelas .Book.info()
-void - tidak return apa2
-super()

method overloading - method nama sama, param tak sama

method overriding
-replace method (over riding parent dia)
 final - tidak boleh ubah lagi. (tak boleh over ride)


cth final
------------------------

class KiraGaji-kira()

AzmanGaji extends KiraGaji
-kira()


5/3/2019

domain name
favtrainer.com

com.favtrainer.hrm

moh.gov.my
kena tukar jadi
my.gov.my.pms

pms.register --->ini kalau nak pakai dlm moh shj


database===========

1.JDBC (Java Data base connectivity) driver

install JDK add dlm library

6/3/2019
---------------

servlet
-tomcat
-manually or netbeans
-web.xml
-webapps/tutorial/WEB-INF
-classes/HelloWorld.class
-lib
mysql.jar

JSP
-scripted <%.....%>
EL ${}
-JSP declaration <%! .....%>
-<%@page include file ="">
-<%= print%>

MVC-teknik utk dev sistem atas java
-guna model (POJO)java class biasa(cth :Student)
-Controller =Servlet(berfungsi sbg controller)
-View=JSP (jsp bertindak sbg view)

8/3/19

CRUD
-create,retrieve,update, delete

CRUD no 2
-login
-session
-dropdown, checkbox,

