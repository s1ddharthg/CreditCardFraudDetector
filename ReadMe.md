# Credit Card Fraud Detection Prediction App

A modern, end-to-end Machine Learning web application designed to detect fraudulent credit card transactions. The project features a comprehensive exploratory data analysis (EDA) pipeline, a scikit-learn model training workflow, and an interactive **Streamlit** dashboard for real-time predictions.

---

## Badges

[![Python](https://img.shields.io/badge/Python-3.11-3776AB?style=for-the-badge&logo=python&logoColor=white)](https://www.python.org/)
[![Streamlit](https://img.shields.io/badge/Streamlit-FF4B4B?style=for-the-badge&logo=streamlit&logoColor=white)](https://streamlit.io/)
[![Scikit-Learn](https://img.shields.io/badge/scikit--learn-F7931E?style=for-the-badge&logo=scikit-learn&logoColor=white)](https://scikit-learn.org/)
[![Pandas](https://img.shields.io/badge/Pandas-150458?style=for-the-badge&logo=pandas&logoColor=white)](https://pandas.pydata.org/)
[![Kaggle Dataset](https://img.shields.io/badge/Dataset-Kaggle-20BEFF?style=for-the-badge&logo=kaggle&logoColor=white)](https://www.kaggle.com/datasets/amanalisiddiqui/fraud-detection-dataset)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)](https://opensource.org/licenses/MIT)

---

## Live Demo

The app is deployed on Streamlit Community Cloud:

[![Open in Streamlit](https://img.shields.io/badge/Open%20in%20Streamlit-FF4B4B?style=for-the-badge&logo=streamlit&logoColor=white)](https://transactionfrauddetector.streamlit.app/)

**[transactionfrauddetector.streamlit.app](https://transactionfrauddetector.streamlit.app/)**

---

## Key Features

*   **Interactive Web App**: Simple and elegant user interface built with **Streamlit** to input transaction details and get real-time fraud predictions.
*   **Predictive Model Pipeline**: Robust data preprocessing (numerical scaling and categorical one-hot encoding) combined with a **Logistic Regression** classifier.
*   **Comprehensive EDA Notebook**: Complete workspace containing dataset download, visualization, exploratory analysis, and pipeline export.
*   **Automated Data Handling**: Integration with `kagglehub` for automated dataset downloading and preparation.

---

## Repository Structure

```text
├── data/                       # Downloaded dataset directory
├── app.py                      # Streamlit application (Frontend UI & prediction)
├── model.ipynb                 # Jupyter Notebook for EDA & model training
├── fraud_detection_model.pkl   # Serialized scikit-learn pipeline (joblib)
├── requirements.txt            # Python dependencies for the Streamlit app
├── runtime.txt                 # Pinned Python version for Streamlit Cloud
├── .gitignore                  # Git ignore files (.venv, data, model files)
├── LICENSE                     # MIT License details
└── ReadMe.md                   # Project documentation
```

---

## Dataset Information

The model is trained on the **Fraud Detection Dataset** hosted on Kaggle. It contains synthetic transactions representing typical credit card usage with normal and fraudulent labelings.

*   **Dataset URL**: [Kaggle: Fraud Detection Dataset](https://www.kaggle.com/datasets/amanalisiddiqui/fraud-detection-dataset)
*   **Target Identifier**: `amanalisiddiqui/fraud-detection-dataset`

---

## Setup & Installation Instructions

Follow these step-by-step instructions to get the application running on your local machine:

### 1. Clone the Repository

```bash
git clone https://github.com/s1ddharthg/CreditCardFraudDetector.git
cd CreditCardFraudDetector
```

### 2. Set Up a Virtual Environment (Recommended)

Create and activate a virtual environment to manage dependencies:

```bash
# Create environment
python -m venv .venv

# Activate environment (Windows)
.venv\Scripts\activate

# Activate environment (macOS/Linux)
source .venv/bin/activate
```

### 3. Install Dependencies

Install the required packages using `pip`:

```bash
pip install -r requirements.txt
```

> [!NOTE]
> The `model.ipynb` notebook additionally relies on `matplotlib` and `kagglehub[pandas-datasets]`, which aren't needed to run the Streamlit app itself.

### 4. Download and Prepare the Dataset

You can automate the download of the dataset by running the initial cells in the `model.ipynb` notebook. It will download the file using `kagglehub` directly into the `data/` folder as `data/AIML Dataset.csv`.

Alternatively, you can manually download the dataset from [Kaggle](https://www.kaggle.com/datasets/amanalisiddiqui/fraud-detection-dataset), create a folder named `data/` in the project root, and place the CSV file inside it under the name `AIML Dataset.csv`.

### 5. Train the Model & Export Pipeline

To generate/retrain the pipeline and export `fraud_detection_model.pkl`, open and run the Jupyter notebook:

```bash
jupyter notebook model.ipynb
```

> [!NOTE]
> The notebook handles data cleaning, feature encoding, scaling, and trains a Balanced Logistic Regression model, saving the final Pipeline to `fraud_detection_model.pkl`.

### 6. Run the Streamlit Application

Launch the prediction dashboard using:

```bash
streamlit run app.py
```

Open `http://localhost:8501` in your browser to interact with the application.

---

## License

This project is licensed under the MIT License - see the [LICENSE](file:///c:/GH/ML/CreditCardFraudDetector/LICENSE) file for details.