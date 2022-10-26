from flask import Flask,render_template,request,url_for,redirect
from flask_mysqldb import MySQL


app=Flask(__name__, template_folder='template')#current module name (flaskProject.py) 
#configure
app.config["MYSQL_HOST"]="localhost"
app.config["MYSQL_USER"]="root"
app.config["MYSQL_PASSWORD"]=""
app.config["MYSQL_DB"]="crud"
app.config["MYSQL_CURSORCLASS"]="DictCursor"
mysql=MySQL(app)
#html page visible : 
@app.route('/') #Route Decarator
def home():
    con=mysql.connection.cursor()
    sql="select * from user"
    con.execute(sql)
    response=con.fetchall()
    return render_template("homepage.html",value=response)
    # return render_template("adduser.html")

#add user
@app.route("/adduser",methods=['POST','GET'])
def adduser():
    if request.method=="POST":
        name=request.form["name"]
        email=request.form["email"]
        phoneno=request.form["phoneno"]
        con=mysql.connection.cursor()
        sql="insert into user(name,email,phoneno) value(%s,%s,%s)"
        con.execute(sql,[name,email,phoneno])
        mysql.connection.commit()
        con.close()
        return redirect(url_for("home"))
    return render_template("adduser.html")

#update user:
@app.route("/edit/<string:id>",methods=['POST','GET'])
def edit(id):
    
    con=mysql.connection.cursor()
    if request.method=="POST":
        name=request.form["name"]
        email=request.form["email"]
        phoneno=request.form["phoneno"]
        sql="update user set name=%s ,email=%s ,phoneno=%s where id=%s"
        con.execute(sql,[name,email,phoneno,id])   
        mysql.connection.commit()
        con.close() 
        return redirect(url_for("home"))
    sql="select * from user where id=%s"
    con.execute(sql,[id])
    res=con.fetchone()
    return render_template("edit.html",datas=res)

#delete user
@app.route("/delete/<string:id>",methods=['POST','GET'])
def delete(id):
    con=mysql.connection.cursor()
    sql="delete from user where id=%s"
    con.execute(sql,[id])
    mysql.connection.commit()
    con.close()
    return redirect(url_for("home"))
if __name__=="__main__":
    app.run(debug=True)#no need to refresh the page again and  again ......




# from flask import Flask,render_template,request
# app=Flask(__name__,template_folder='template')

# @app.route('/')
# def function():
#     return render_template("register.html")
#     # return "satz"
# @app.route("/confim",methods=['POST','GET'])
# def register():
#     if request.method=="POST":
#         n=request.form.get("name")
#         e=request.form.get("email")
#         p=request.form.get("phoneNo")
#         return render_template("confirm.html",name=n,email=e,phoneno=p)

# if __name__=="__main__":
#     app.run(debug=True)











