from flask import Flask, render_template, request, redirect
from model import train_model

app = Flask(__name__)

model = train_model()

# Dummy login
@app.route('/')
def home():
    return render_template('login.html')

@app.route('/login', methods=['POST'])
def login():
    username = request.form['username']
    password = request.form['password']

    if username and password:
        return redirect('/dashboard')
    else:
        return "Invalid login credentials"

@app.route('/register')
def register():
    return render_template('register.html')

@app.route('/register', methods=['POST'])
def register_submit():
    username = request.form['username']
    password = request.form['password']

    if username and password:
        return redirect('/dashboard')
    else:
        return "Please enter valid registration details"

@app.route('/dashboard')
def dashboard():
    return render_template('dashboard.html')

@app.route('/predict', methods=['POST'])
def predict():
    year = int(request.form['year'])
    
    prediction = model.predict([[year]])[0]
    
    return render_template('result.html', prediction=round(prediction,2))

if __name__ == '__main__':
    app.run(debug=True)