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


st.set_page_config(
    page_title="Fraud Detection",
    page_icon="💳",
    layout="centered",
)


# Load the model (trusted artifact built by model.ipynb in this repo, not user-supplied)
@st.cache_resource
def load_model():
    return joblib.load("fraud_detection_model.pkl")

model = load_model()

st.title("💳 Credit Card Fraud Detection")
st.caption("Enter the transaction details below to check whether it looks fraudulent.")

st.divider()

transaction_type = st.selectbox("Transaction Type", ["PAYMENT", "TRANSFER", "CASH_OUT", "DEBIT", "CASH_IN"])
amount = st.number_input("Amount", min_value=0.0, value=1000.0)

st.subheader("Sender Account")
col1, col2 = st.columns(2)
with col1:
    oldbalanceOrg = st.number_input("Old Balance", min_value=0.0, value=1000.0, key="old_org")
with col2:
    newbalanceOrig = st.number_input("New Balance", min_value=0.0, value=1000.0, key="new_org")

st.subheader("Receiver Account")
col3, col4 = st.columns(2)
with col3:
    oldbalanceDest = st.number_input("Old Balance", min_value=0.0, value=1000.0, key="old_dest")
with col4:
    newbalanceDest = st.number_input("New Balance", min_value=0.0, value=1000.0, key="new_dest")

st.divider()

if st.button("Predict", type="primary", use_container_width=True):
    input_data = pd.DataFrame([{
        "type": transaction_type,
        "amount": amount,
        "oldbalanceOrg": oldbalanceOrg,
        "newbalanceOrig": newbalanceOrig,
        "oldbalanceDest": oldbalanceDest,
        "newbalanceDest": newbalanceDest
    }])

    prediction = model.predict(input_data)[0]

    if prediction == 1:
        st.error("🚨 Prediction: Fraudulent Transaction", icon="🚨")
    else:
        st.success("✅ Prediction: Legitimate Transaction", icon="✅")
