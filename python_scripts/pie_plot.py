import pandas as pd
import matplotlib.pyplot as plt
import sys


file = sys.argv[1]
columna = sys.argv[2]

df = pd.read_csv(file)

cantidad = df["cantidad"].tolist()
labels = df[columna].tolist()
plt.pie(cantidad, labels=labels, autopct='%1.0f%%')
plt.savefig('./estadisticas.png')