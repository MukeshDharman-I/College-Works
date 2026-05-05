import pandas as pd
from sklearn.linear_model import LinearRegression

def train_model():
    data = pd.read_csv("crime_data.csv")
    
    X = data[['year']]
    y = data['crime_count']
    
    model = LinearRegression()
    model.fit(X, y)
    
    return model