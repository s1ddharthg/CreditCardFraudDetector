import streamlit as st
import pandas as pd
import joblib

try:
    import sklearn.compose._column_transformer as _ct_mod
    if not hasattr(_ct_mod, "_RemainderColsList"):
        class _RemainderColsList(list):
            pass
        _ct_mod._RemainderColsList = _RemainderColsList
except Exception:
    pass


# Load the model
@st.cache_resource
def load_model():
    return joblib.load("fraud_detection_model.pkl")

model = load_model()

st.title("Fraud Detection Prediction App")

st.markdown("Please enter the transaction detailes and use the predict button")

st.divider()

transaction_type = st.selectbox("Transaction Type", ["PAYMENT", "TRANSFER", "CASH_OUT", "DEBIT", "CASH_IN"])
amount = st.number_input("Amount", min_value=0.0, value=1000.0)
oldbalanceOrg = st.number_input("Old Balance (Sender)", min_value=0.0, value=1000.0)
newbalanceOrig = st.number_input("New Balance (Sender)", min_value=0.0, value=1000.0)
oldbalanceDest = st.number_input("Old Balance (Receiver)", min_value=0.0, value=1000.0)
newbalanceDest = st.number_input("New Balance (Receiver)", min_value=0.0, value=1000.0)

if st.button("Predict"):
    input_data = pd.DataFrame([{
        "type": transaction_type,
        "amount": amount,
        "oldbalanceOrg": oldbalanceOrg,
        "newbalanceOrig": newbalanceOrig,
        "oldbalanceDest": oldbalanceDest,
        "newbalanceDest": newbalanceDest
    }])
    
    prediction = model.predict(input_data)[0]

    st.subheader(f'Prediction : {int(prediction)}')
    
    if prediction == 1:
        st.error("Prediction: Fraudulent Transaction")
    else:
        st.success("Prediction: Legitimate Transaction")
